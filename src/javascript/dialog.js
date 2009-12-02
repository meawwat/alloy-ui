AUI.add('dialog', function(A) {

var L = A.Lang,
	isBoolean = L.isBoolean,
	isArray = L.isArray,
	isObject = L.isObject,

	BLANK = '',
	BODY_CONTENT = 'bodyContent',
	BOUNDING_BOX = 'boundingBox',
	BUTTON = 'button',
	BUTTONS = 'buttons',
	CLOSE = 'close',
	CONSTRAIN_TO_VIEWPORT = 'constrain2view',
	CONTAINER = 'container',
	DD = 'dd',
	DEFAULT = 'default',
	DESTROY_ON_CLOSE = 'destroyOnClose',
	DIALOG = 'dialog',
	DOT = '.',
	DRAGGABLE = 'draggable',
	DRAG_INSTANCE = 'dragInstance',
	FOOTER_CONTENT = 'footerContent',
	HD = 'hd',
	ICON = 'icon',
	IO = 'io',
	LOADING = 'loading',
	MODAL = 'modal',
	STACK = 'stack',
	TOOLS = 'tools',

	getCN = A.ClassNameManager.getClassName,

	CSS_DIALOG_BUTTON = getCN(DIALOG, BUTTON),
	CSS_DIALOG_BUTTON_CONTAINER = getCN(DIALOG, BUTTON, CONTAINER),
	CSS_DIALOG_BUTTON_DEFAULT = getCN(DIALOG, BUTTON, DEFAULT),
	CSS_DIALOG_HD = getCN(DIALOG, HD),
	CSS_ICON_LOADING = getCN(ICON, LOADING),
	CSS_PREFIX = getCN(DD),

	NODE_BLANK_TEXT = document.createTextNode(''),

	TPL_BUTTON = '<button class="' + CSS_DIALOG_BUTTON + '"></button>',
	TPL_BUTTON_CONTAINER = '<div class="' + CSS_DIALOG_BUTTON_CONTAINER + '"></div>',
	TPL_LOADING = '<div class="' + CSS_ICON_LOADING + '"></div>';

var Dialog = function(config) {};

A.mix(
	Dialog,
	{
		NAME: DIALOG,

		ATTRS: {
			bodyContent: {
				value: NODE_BLANK_TEXT
			},

			buttons: {
				value: [],
				validator: isArray
			},

			close: {
				value: true
			},

			constrain2view: {
				value: false,
				validator: isBoolean
			},

			destroyOnClose: {
				value: false,
				validator: isBoolean
			},

			draggable: {
				lazyAdd: true,
				value: true,
				setter: function(v) {
					return this._setDraggable(v);
				}
			},

			dragInstance: {
				value: null
			},

			headerContent: {
				writeOnce: true,
				getter: function() {
					return this.titleContainter;
				}
			},

			modal: {
				setter: function(v) {
					return this._setModal(v);
				},
				lazyAdd: false,
				value: false,
				validator: isBoolean
			},

			io: {
				lazyAdd: true,
				value: null,
				setter: function(v) {
					return this._setIO(v);
				}
			},

			stack: {
				lazyAdd: true,
				value: true,
				setter: function(v) {
					return this._setStack(v);
				},
				validator: isBoolean
			}
		}
	}
);

Dialog.prototype = {
	initializer: function(config) {
		var instance = this;
		var tools = instance.get(TOOLS);
		var close = instance.get(CLOSE);
		var buttons = instance.get(BUTTONS);

		if (buttons && buttons.length && !instance.get(FOOTER_CONTENT)) {
			instance.set(FOOTER_CONTENT, NODE_BLANK_TEXT);
		}

		if (close) {
			var closeConfig = {
				icon: CLOSE,
				id: CLOSE,
				handler: {
					fn: instance.close,
					context: instance
				}
			};

			if (tools) {
				tools.push(closeConfig);
			}

			instance.set(TOOLS, tools);
		}

		instance.after('render', instance._afterRenderer);
	},

	/*
	* Methods
	*/
	close: function() {
		var instance = this;

		if (instance.get(DESTROY_ON_CLOSE)) {
			instance.destroy();
		}
		else {
			instance.hide();
		}

		if (instance.get(MODAL)) {
			A.DialogMask.hide();
		}

		instance.fire('close');
	},

	_afterRenderer: function() {
		var instance = this;

		instance._initButtons();

		// forcing lazyAdd:true attrs call the setter
		instance.get(STACK);
		instance.get(DRAGGABLE);
		instance.get(IO);
	},

	_initButtons: function() {
		var instance = this;

		var buttons = instance.get(BUTTONS);
		var container = A.Node.create(TPL_BUTTON_CONTAINER);
		var nodeModel = A.Node.create(TPL_BUTTON);

		A.each(
			buttons,
			function(button, i) {
				var node = nodeModel.cloneNode();

				if (button.isDefault) {
					node.addClass(CSS_DIALOG_BUTTON_DEFAULT);
				}

				if (button.handler) {
					node.on('click', button.handler, instance);
				}

				node.html(button.text || BLANK);

				container.append(node);
			}
		);

		if (buttons.length) {
			instance.set(FOOTER_CONTENT, container);
		}
	},

	_setDraggable: function(value) {
		var instance = this;
		var boundingBox = instance.get(BOUNDING_BOX);

		var destroyDraggable = function() {
			var dragInstance = instance.get(DRAG_INSTANCE);

			if (dragInstance) {
				// TODO - YUI3 has a bug when destroy and recreates
				dragInstance.destroy();
				dragInstance.unplug(A.Plugin.DDConstrained);
			}
		};

		A.DD.DDM.CSS_PREFIX = CSS_PREFIX;

		if (value) {
			var defaults = {
				node: boundingBox,
				handles: [ DOT + CSS_DIALOG_HD ]
			};

			var dragOptions = A.merge(defaults, instance.get(DRAGGABLE) || {});

			// change the drag scope callback to execute using the dialog scope
			if (dragOptions.on) {
				A.each(
					dragOptions.on,
					function(fn, eventName) {
						dragOptions.on[eventName] = A.bind(fn, instance);
					}
				);
			}

			destroyDraggable();

			var dragInstance = new A.DD.Drag(dragOptions);

			dragInstance.plug(
				A.Plugin.DDConstrained,
				{
					constrain2view: instance.get(CONSTRAIN_TO_VIEWPORT)
				}
			);

			instance.set(DRAG_INSTANCE, dragInstance);
		}
		else {
			destroyDraggable();
		}

		return value;
	},

	_setIO: function(value) {
		var instance = this;

		if (value && !instance.get(BODY_CONTENT)) {
			instance.set(BODY_CONTENT, TPL_LOADING);
		}

		if (value) {
			instance.unplug(A.Plugin.StdModIOPlugin);

			value.uri = value.uri || value.url;
			value.cfg = value.cfg || {};

			var data = value.cfg.data;

			if (isObject(data)) {
				value.cfg.data = A.toQueryString(data);
			}

			instance.plug(A.Plugin.StdModIOPlugin, value);

			var autoRefresh = ('autoRefresh' in value) ? value.autoRefresh : true;

			if (instance.io && autoRefresh) {
				instance.io.refresh();
			}
		}
		else {
			instance.unplug(A.Plugin.StdModIOPlugin);
		}

		return value;
	},

	_setModal: function(value) {
		var instance = this;

		if (value) {
			A.DialogMask.show();
		}
		else {
			A.DialogMask.hide();
		}

		return value;
	},

	_setStack: function(value) {
		var instance = this;

		if (value) {
			A.DialogManager.register(instance);
		}
		else {
			A.DialogManager.remove(instance);
		}

		return value;
	},

	/*
	* Attribute Listeners
	*/
	_afterSetVisible: function(event) {
		var instance = this;

		if (instance.get(MODAL)) {
			if (event.newVal) {
				A.DialogMask.show();
			}
			else {
				A.DialogMask.hide();
			}
		}
	}
};

A.Dialog = A.Base.build(DIALOG, A.Panel, [Dialog, A.WidgetPosition, A.WidgetStack, A.WidgetPositionExt]);

A.DialogManager = new A.OverlayManager(
	{
		zIndexBase: 1000
	}
);

A.mix(
	A.DialogManager,
	{
		findByChild: function(child) {
			return A.Widget.getByNode(child);
		},

		closeByChild: function(child) {
			return A.DialogManager.findByChild(child).close();
		},

		refreshByChild: function(child, io) {
			var dialog = A.DialogManager.findByChild(child);

			if (dialog && dialog.io) {
				if (io) {
					dialog.set(IO, io);
				}
				else {
					dialog.io.refresh();
				}
			}
		}
	}
);

A.DialogMask = new A.OverlayMask().render();

}, '@VERSION', { requires: [ 'aui-base', 'panel', 'overlay-manager', 'overlay-mask', 'dd-constrain', 'io-stdmod', 'dialog-css' ] });