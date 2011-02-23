package com.liferay.alloy.taglib.alloy.base;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;

/**
 * <a href="BaseDialogTag.java.html"><b><i>View Source</i></b></a>
 *
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 */
public class BaseDialogTag extends com.liferay.taglib.util.IncludeTag {

	public int doStartTag() throws JspException {
		setAttributeNamespace(_ATTRIBUTE_NAMESPACE);

		return super.doStartTag();
	}

	public java.lang.Object getAlign() {
		return _align;
	}

	public java.lang.String getDialogBodyContent() {
		return _dialogBodyContent;
	}

	public java.lang.String getBoundingBox() {
		return _boundingBox;
	}

	public java.lang.Object getButtons() {
		return _buttons;
	}

	public java.lang.Object getCentered() {
		return _centered;
	}

	public java.lang.Boolean getClose() {
		return _close;
	}

	public java.lang.Boolean getCollapsed() {
		return _collapsed;
	}

	public java.lang.Boolean getCollapsible() {
		return _collapsible;
	}

	public java.lang.Object getConstrain() {
		return _constrain;
	}

	public java.lang.Object getConstrain2view() {
		return _constrain2view;
	}

	public java.lang.String getContentBox() {
		return _contentBox;
	}

	public java.lang.String getCssClass() {
		return _cssClass;
	}

	public java.lang.Boolean getDestroyOnClose() {
		return _destroyOnClose;
	}

	public java.lang.Boolean getDestroyed() {
		return _destroyed;
	}

	public java.lang.Boolean getDisabled() {
		return _disabled;
	}

	public java.lang.Object getDragInstance() {
		return _dragInstance;
	}

	public java.lang.Boolean getDraggable() {
		return _draggable;
	}

	public java.lang.Object getFillHeight() {
		return _fillHeight;
	}

	public java.lang.Boolean getFocused() {
		return _focused;
	}

	public java.lang.Object getFooterContent() {
		return _footerContent;
	}

	public java.lang.Object getHeaderContent() {
		return _headerContent;
	}

	public java.lang.Object getHeight() {
		return _height;
	}

	public java.lang.String getHideClass() {
		return _hideClass;
	}

	public java.lang.Object getIcons() {
		return _icons;
	}

	public java.lang.String getDialogId() {
		return _dialogId;
	}

	public java.lang.Boolean getInitialized() {
		return _initialized;
	}

	public java.lang.Boolean getModal() {
		return _modal;
	}

	public java.lang.Boolean getPreventOverlap() {
		return _preventOverlap;
	}

	public java.lang.Object getRender() {
		return _render;
	}

	public java.lang.Boolean getRendered() {
		return _rendered;
	}

	public java.lang.Boolean getResizable() {
		return _resizable;
	}

	public java.lang.Object getResizableInstance() {
		return _resizableInstance;
	}

	public java.lang.Boolean getShim() {
		return _shim;
	}

	public java.lang.String getSrcNode() {
		return _srcNode;
	}

	public java.lang.Boolean getStack() {
		return _stack;
	}

	public java.lang.Object getStrings() {
		return _strings;
	}

	public java.lang.Object getTabIndex() {
		return _tabIndex;
	}

	public java.lang.Object getTitle() {
		return _title;
	}

	public java.lang.Boolean getVisible() {
		return _visible;
	}

	public java.lang.Object getWidth() {
		return _width;
	}

	public java.lang.Object getX() {
		return _x;
	}

	public java.lang.Object getXy() {
		return _xy;
	}

	public java.lang.Object getY() {
		return _y;
	}

	public java.lang.Object getZIndex() {
		return _zIndex;
	}

	public java.lang.Object getAfterAlignChange() {
		return _afterAlignChange;
	}

	public java.lang.Object getAfterBodyContentChange() {
		return _afterBodyContentChange;
	}

	public java.lang.Object getAfterBoundingBoxChange() {
		return _afterBoundingBoxChange;
	}

	public java.lang.Object getAfterButtonsChange() {
		return _afterButtonsChange;
	}

	public java.lang.Object getAfterCenteredChange() {
		return _afterCenteredChange;
	}

	public java.lang.Object getAfterCloseChange() {
		return _afterCloseChange;
	}

	public java.lang.Object getAfterCollapsedChange() {
		return _afterCollapsedChange;
	}

	public java.lang.Object getAfterCollapsibleChange() {
		return _afterCollapsibleChange;
	}

	public java.lang.Object getAfterConstrain2viewChange() {
		return _afterConstrain2viewChange;
	}

	public java.lang.Object getAfterConstrainChange() {
		return _afterConstrainChange;
	}

	public java.lang.Object getAfterContentBoxChange() {
		return _afterContentBoxChange;
	}

	public java.lang.Object getAfterCssClassChange() {
		return _afterCssClassChange;
	}

	public java.lang.Object getAfterDestroy() {
		return _afterDestroy;
	}

	public java.lang.Object getAfterDestroyOnCloseChange() {
		return _afterDestroyOnCloseChange;
	}

	public java.lang.Object getAfterDestroyedChange() {
		return _afterDestroyedChange;
	}

	public java.lang.Object getAfterDisabledChange() {
		return _afterDisabledChange;
	}

	public java.lang.Object getAfterDragInstanceChange() {
		return _afterDragInstanceChange;
	}

	public java.lang.Object getAfterDraggableChange() {
		return _afterDraggableChange;
	}

	public java.lang.Object getAfterFillHeightChange() {
		return _afterFillHeightChange;
	}

	public java.lang.Object getAfterFocusedChange() {
		return _afterFocusedChange;
	}

	public java.lang.Object getAfterFooterContentChange() {
		return _afterFooterContentChange;
	}

	public java.lang.Object getAfterHeaderContentChange() {
		return _afterHeaderContentChange;
	}

	public java.lang.Object getAfterHeightChange() {
		return _afterHeightChange;
	}

	public java.lang.Object getAfterHideClassChange() {
		return _afterHideClassChange;
	}

	public java.lang.Object getAfterIconsChange() {
		return _afterIconsChange;
	}

	public java.lang.Object getAfterIdChange() {
		return _afterIdChange;
	}

	public java.lang.Object getAfterInit() {
		return _afterInit;
	}

	public java.lang.Object getAfterInitializedChange() {
		return _afterInitializedChange;
	}

	public java.lang.Object getAfterModalChange() {
		return _afterModalChange;
	}

	public java.lang.Object getAfterPreventOverlapChange() {
		return _afterPreventOverlapChange;
	}

	public java.lang.Object getAfterRenderChange() {
		return _afterRenderChange;
	}

	public java.lang.Object getAfterRenderedChange() {
		return _afterRenderedChange;
	}

	public java.lang.Object getAfterResizableChange() {
		return _afterResizableChange;
	}

	public java.lang.Object getAfterResizableInstanceChange() {
		return _afterResizableInstanceChange;
	}

	public java.lang.Object getAfterShimChange() {
		return _afterShimChange;
	}

	public java.lang.Object getAfterSrcNodeChange() {
		return _afterSrcNodeChange;
	}

	public java.lang.Object getAfterStackChange() {
		return _afterStackChange;
	}

	public java.lang.Object getAfterStringsChange() {
		return _afterStringsChange;
	}

	public java.lang.Object getAfterTabIndexChange() {
		return _afterTabIndexChange;
	}

	public java.lang.Object getAfterTitleChange() {
		return _afterTitleChange;
	}

	public java.lang.Object getAfterVisibleChange() {
		return _afterVisibleChange;
	}

	public java.lang.Object getAfterContentUpdate() {
		return _afterContentUpdate;
	}

	public java.lang.Object getAfterRender() {
		return _afterRender;
	}

	public java.lang.Object getAfterWidthChange() {
		return _afterWidthChange;
	}

	public java.lang.Object getAfterXChange() {
		return _afterXChange;
	}

	public java.lang.Object getAfterXyChange() {
		return _afterXyChange;
	}

	public java.lang.Object getAfterYChange() {
		return _afterYChange;
	}

	public java.lang.Object getAfterZIndexChange() {
		return _afterZIndexChange;
	}

	public java.lang.Object getOnAlignChange() {
		return _onAlignChange;
	}

	public java.lang.Object getOnBodyContentChange() {
		return _onBodyContentChange;
	}

	public java.lang.Object getOnBoundingBoxChange() {
		return _onBoundingBoxChange;
	}

	public java.lang.Object getOnButtonsChange() {
		return _onButtonsChange;
	}

	public java.lang.Object getOnCenteredChange() {
		return _onCenteredChange;
	}

	public java.lang.Object getOnCloseChange() {
		return _onCloseChange;
	}

	public java.lang.Object getOnCollapsedChange() {
		return _onCollapsedChange;
	}

	public java.lang.Object getOnCollapsibleChange() {
		return _onCollapsibleChange;
	}

	public java.lang.Object getOnConstrain2viewChange() {
		return _onConstrain2viewChange;
	}

	public java.lang.Object getOnConstrainChange() {
		return _onConstrainChange;
	}

	public java.lang.Object getOnContentBoxChange() {
		return _onContentBoxChange;
	}

	public java.lang.Object getOnCssClassChange() {
		return _onCssClassChange;
	}

	public java.lang.Object getOnDestroy() {
		return _onDestroy;
	}

	public java.lang.Object getOnDestroyOnCloseChange() {
		return _onDestroyOnCloseChange;
	}

	public java.lang.Object getOnDestroyedChange() {
		return _onDestroyedChange;
	}

	public java.lang.Object getOnDisabledChange() {
		return _onDisabledChange;
	}

	public java.lang.Object getOnDragInstanceChange() {
		return _onDragInstanceChange;
	}

	public java.lang.Object getOnDraggableChange() {
		return _onDraggableChange;
	}

	public java.lang.Object getOnFillHeightChange() {
		return _onFillHeightChange;
	}

	public java.lang.Object getOnFocusedChange() {
		return _onFocusedChange;
	}

	public java.lang.Object getOnFooterContentChange() {
		return _onFooterContentChange;
	}

	public java.lang.Object getOnHeaderContentChange() {
		return _onHeaderContentChange;
	}

	public java.lang.Object getOnHeightChange() {
		return _onHeightChange;
	}

	public java.lang.Object getOnHideClassChange() {
		return _onHideClassChange;
	}

	public java.lang.Object getOnIconsChange() {
		return _onIconsChange;
	}

	public java.lang.Object getOnIdChange() {
		return _onIdChange;
	}

	public java.lang.Object getOnInit() {
		return _onInit;
	}

	public java.lang.Object getOnInitializedChange() {
		return _onInitializedChange;
	}

	public java.lang.Object getOnModalChange() {
		return _onModalChange;
	}

	public java.lang.Object getOnPreventOverlapChange() {
		return _onPreventOverlapChange;
	}

	public java.lang.Object getOnRenderChange() {
		return _onRenderChange;
	}

	public java.lang.Object getOnRenderedChange() {
		return _onRenderedChange;
	}

	public java.lang.Object getOnResizableChange() {
		return _onResizableChange;
	}

	public java.lang.Object getOnResizableInstanceChange() {
		return _onResizableInstanceChange;
	}

	public java.lang.Object getOnShimChange() {
		return _onShimChange;
	}

	public java.lang.Object getOnSrcNodeChange() {
		return _onSrcNodeChange;
	}

	public java.lang.Object getOnStackChange() {
		return _onStackChange;
	}

	public java.lang.Object getOnStringsChange() {
		return _onStringsChange;
	}

	public java.lang.Object getOnTabIndexChange() {
		return _onTabIndexChange;
	}

	public java.lang.Object getOnTitleChange() {
		return _onTitleChange;
	}

	public java.lang.Object getOnVisibleChange() {
		return _onVisibleChange;
	}

	public java.lang.Object getOnContentUpdate() {
		return _onContentUpdate;
	}

	public java.lang.Object getOnRender() {
		return _onRender;
	}

	public java.lang.Object getOnWidthChange() {
		return _onWidthChange;
	}

	public java.lang.Object getOnXChange() {
		return _onXChange;
	}

	public java.lang.Object getOnXyChange() {
		return _onXyChange;
	}

	public java.lang.Object getOnYChange() {
		return _onYChange;
	}

	public java.lang.Object getOnZIndexChange() {
		return _onZIndexChange;
	}

	public void setAlign(java.lang.Object align) {
		_align = align;

		setScopedAttribute("align", align);
	}

	public void setDialogBodyContent(java.lang.String dialogBodyContent) {
		_dialogBodyContent = dialogBodyContent;

		setScopedAttribute("dialogBodyContent", dialogBodyContent);
	}

	public void setBoundingBox(java.lang.String boundingBox) {
		_boundingBox = boundingBox;

		setScopedAttribute("boundingBox", boundingBox);
	}

	public void setButtons(java.lang.Object buttons) {
		_buttons = buttons;

		setScopedAttribute("buttons", buttons);
	}

	public void setCentered(java.lang.Object centered) {
		_centered = centered;

		setScopedAttribute("centered", centered);
	}

	public void setClose(java.lang.Boolean close) {
		_close = close;

		setScopedAttribute("close", close);
	}

	public void setCollapsed(java.lang.Boolean collapsed) {
		_collapsed = collapsed;

		setScopedAttribute("collapsed", collapsed);
	}

	public void setCollapsible(java.lang.Boolean collapsible) {
		_collapsible = collapsible;

		setScopedAttribute("collapsible", collapsible);
	}

	public void setConstrain(java.lang.Object constrain) {
		_constrain = constrain;

		setScopedAttribute("constrain", constrain);
	}

	public void setConstrain2view(java.lang.Object constrain2view) {
		_constrain2view = constrain2view;

		setScopedAttribute("constrain2view", constrain2view);
	}

	public void setContentBox(java.lang.String contentBox) {
		_contentBox = contentBox;

		setScopedAttribute("contentBox", contentBox);
	}

	public void setCssClass(java.lang.String cssClass) {
		_cssClass = cssClass;

		setScopedAttribute("cssClass", cssClass);
	}

	public void setDestroyOnClose(java.lang.Boolean destroyOnClose) {
		_destroyOnClose = destroyOnClose;

		setScopedAttribute("destroyOnClose", destroyOnClose);
	}

	public void setDestroyed(java.lang.Boolean destroyed) {
		_destroyed = destroyed;

		setScopedAttribute("destroyed", destroyed);
	}

	public void setDisabled(java.lang.Boolean disabled) {
		_disabled = disabled;

		setScopedAttribute("disabled", disabled);
	}

	public void setDragInstance(java.lang.Object dragInstance) {
		_dragInstance = dragInstance;

		setScopedAttribute("dragInstance", dragInstance);
	}

	public void setDraggable(java.lang.Boolean draggable) {
		_draggable = draggable;

		setScopedAttribute("draggable", draggable);
	}

	public void setFillHeight(java.lang.Object fillHeight) {
		_fillHeight = fillHeight;

		setScopedAttribute("fillHeight", fillHeight);
	}

	public void setFocused(java.lang.Boolean focused) {
		_focused = focused;

		setScopedAttribute("focused", focused);
	}

	public void setFooterContent(java.lang.Object footerContent) {
		_footerContent = footerContent;

		setScopedAttribute("footerContent", footerContent);
	}

	public void setHeaderContent(java.lang.Object headerContent) {
		_headerContent = headerContent;

		setScopedAttribute("headerContent", headerContent);
	}

	public void setHeight(java.lang.Object height) {
		_height = height;

		setScopedAttribute("height", height);
	}

	public void setHideClass(java.lang.String hideClass) {
		_hideClass = hideClass;

		setScopedAttribute("hideClass", hideClass);
	}

	public void setIcons(java.lang.Object icons) {
		_icons = icons;

		setScopedAttribute("icons", icons);
	}

	public void setDialogId(java.lang.String dialogId) {
		_dialogId = dialogId;

		setScopedAttribute("dialogId", dialogId);
	}

	public void setInitialized(java.lang.Boolean initialized) {
		_initialized = initialized;

		setScopedAttribute("initialized", initialized);
	}

	public void setModal(java.lang.Boolean modal) {
		_modal = modal;

		setScopedAttribute("modal", modal);
	}

	public void setPreventOverlap(java.lang.Boolean preventOverlap) {
		_preventOverlap = preventOverlap;

		setScopedAttribute("preventOverlap", preventOverlap);
	}

	public void setRender(java.lang.Object render) {
		_render = render;

		setScopedAttribute("render", render);
	}

	public void setRendered(java.lang.Boolean rendered) {
		_rendered = rendered;

		setScopedAttribute("rendered", rendered);
	}

	public void setResizable(java.lang.Boolean resizable) {
		_resizable = resizable;

		setScopedAttribute("resizable", resizable);
	}

	public void setResizableInstance(java.lang.Object resizableInstance) {
		_resizableInstance = resizableInstance;

		setScopedAttribute("resizableInstance", resizableInstance);
	}

	public void setShim(java.lang.Boolean shim) {
		_shim = shim;

		setScopedAttribute("shim", shim);
	}

	public void setSrcNode(java.lang.String srcNode) {
		_srcNode = srcNode;

		setScopedAttribute("srcNode", srcNode);
	}

	public void setStack(java.lang.Boolean stack) {
		_stack = stack;

		setScopedAttribute("stack", stack);
	}

	public void setStrings(java.lang.Object strings) {
		_strings = strings;

		setScopedAttribute("strings", strings);
	}

	public void setTabIndex(java.lang.Object tabIndex) {
		_tabIndex = tabIndex;

		setScopedAttribute("tabIndex", tabIndex);
	}

	public void setTitle(java.lang.Object title) {
		_title = title;

		setScopedAttribute("title", title);
	}

	public void setVisible(java.lang.Boolean visible) {
		_visible = visible;

		setScopedAttribute("visible", visible);
	}

	public void setWidth(java.lang.Object width) {
		_width = width;

		setScopedAttribute("width", width);
	}

	public void setX(java.lang.Object x) {
		_x = x;

		setScopedAttribute("x", x);
	}

	public void setXy(java.lang.Object xy) {
		_xy = xy;

		setScopedAttribute("xy", xy);
	}

	public void setY(java.lang.Object y) {
		_y = y;

		setScopedAttribute("y", y);
	}

	public void setZIndex(java.lang.Object zIndex) {
		_zIndex = zIndex;

		setScopedAttribute("zIndex", zIndex);
	}

	public void setAfterAlignChange(java.lang.Object afterAlignChange) {
		_afterAlignChange = afterAlignChange;

		setScopedAttribute("afterAlignChange", afterAlignChange);
	}

	public void setAfterBodyContentChange(java.lang.Object afterBodyContentChange) {
		_afterBodyContentChange = afterBodyContentChange;

		setScopedAttribute("afterBodyContentChange", afterBodyContentChange);
	}

	public void setAfterBoundingBoxChange(java.lang.Object afterBoundingBoxChange) {
		_afterBoundingBoxChange = afterBoundingBoxChange;

		setScopedAttribute("afterBoundingBoxChange", afterBoundingBoxChange);
	}

	public void setAfterButtonsChange(java.lang.Object afterButtonsChange) {
		_afterButtonsChange = afterButtonsChange;

		setScopedAttribute("afterButtonsChange", afterButtonsChange);
	}

	public void setAfterCenteredChange(java.lang.Object afterCenteredChange) {
		_afterCenteredChange = afterCenteredChange;

		setScopedAttribute("afterCenteredChange", afterCenteredChange);
	}

	public void setAfterCloseChange(java.lang.Object afterCloseChange) {
		_afterCloseChange = afterCloseChange;

		setScopedAttribute("afterCloseChange", afterCloseChange);
	}

	public void setAfterCollapsedChange(java.lang.Object afterCollapsedChange) {
		_afterCollapsedChange = afterCollapsedChange;

		setScopedAttribute("afterCollapsedChange", afterCollapsedChange);
	}

	public void setAfterCollapsibleChange(java.lang.Object afterCollapsibleChange) {
		_afterCollapsibleChange = afterCollapsibleChange;

		setScopedAttribute("afterCollapsibleChange", afterCollapsibleChange);
	}

	public void setAfterConstrain2viewChange(java.lang.Object afterConstrain2viewChange) {
		_afterConstrain2viewChange = afterConstrain2viewChange;

		setScopedAttribute("afterConstrain2viewChange", afterConstrain2viewChange);
	}

	public void setAfterConstrainChange(java.lang.Object afterConstrainChange) {
		_afterConstrainChange = afterConstrainChange;

		setScopedAttribute("afterConstrainChange", afterConstrainChange);
	}

	public void setAfterContentBoxChange(java.lang.Object afterContentBoxChange) {
		_afterContentBoxChange = afterContentBoxChange;

		setScopedAttribute("afterContentBoxChange", afterContentBoxChange);
	}

	public void setAfterCssClassChange(java.lang.Object afterCssClassChange) {
		_afterCssClassChange = afterCssClassChange;

		setScopedAttribute("afterCssClassChange", afterCssClassChange);
	}

	public void setAfterDestroy(java.lang.Object afterDestroy) {
		_afterDestroy = afterDestroy;

		setScopedAttribute("afterDestroy", afterDestroy);
	}

	public void setAfterDestroyOnCloseChange(java.lang.Object afterDestroyOnCloseChange) {
		_afterDestroyOnCloseChange = afterDestroyOnCloseChange;

		setScopedAttribute("afterDestroyOnCloseChange", afterDestroyOnCloseChange);
	}

	public void setAfterDestroyedChange(java.lang.Object afterDestroyedChange) {
		_afterDestroyedChange = afterDestroyedChange;

		setScopedAttribute("afterDestroyedChange", afterDestroyedChange);
	}

	public void setAfterDisabledChange(java.lang.Object afterDisabledChange) {
		_afterDisabledChange = afterDisabledChange;

		setScopedAttribute("afterDisabledChange", afterDisabledChange);
	}

	public void setAfterDragInstanceChange(java.lang.Object afterDragInstanceChange) {
		_afterDragInstanceChange = afterDragInstanceChange;

		setScopedAttribute("afterDragInstanceChange", afterDragInstanceChange);
	}

	public void setAfterDraggableChange(java.lang.Object afterDraggableChange) {
		_afterDraggableChange = afterDraggableChange;

		setScopedAttribute("afterDraggableChange", afterDraggableChange);
	}

	public void setAfterFillHeightChange(java.lang.Object afterFillHeightChange) {
		_afterFillHeightChange = afterFillHeightChange;

		setScopedAttribute("afterFillHeightChange", afterFillHeightChange);
	}

	public void setAfterFocusedChange(java.lang.Object afterFocusedChange) {
		_afterFocusedChange = afterFocusedChange;

		setScopedAttribute("afterFocusedChange", afterFocusedChange);
	}

	public void setAfterFooterContentChange(java.lang.Object afterFooterContentChange) {
		_afterFooterContentChange = afterFooterContentChange;

		setScopedAttribute("afterFooterContentChange", afterFooterContentChange);
	}

	public void setAfterHeaderContentChange(java.lang.Object afterHeaderContentChange) {
		_afterHeaderContentChange = afterHeaderContentChange;

		setScopedAttribute("afterHeaderContentChange", afterHeaderContentChange);
	}

	public void setAfterHeightChange(java.lang.Object afterHeightChange) {
		_afterHeightChange = afterHeightChange;

		setScopedAttribute("afterHeightChange", afterHeightChange);
	}

	public void setAfterHideClassChange(java.lang.Object afterHideClassChange) {
		_afterHideClassChange = afterHideClassChange;

		setScopedAttribute("afterHideClassChange", afterHideClassChange);
	}

	public void setAfterIconsChange(java.lang.Object afterIconsChange) {
		_afterIconsChange = afterIconsChange;

		setScopedAttribute("afterIconsChange", afterIconsChange);
	}

	public void setAfterIdChange(java.lang.Object afterIdChange) {
		_afterIdChange = afterIdChange;

		setScopedAttribute("afterIdChange", afterIdChange);
	}

	public void setAfterInit(java.lang.Object afterInit) {
		_afterInit = afterInit;

		setScopedAttribute("afterInit", afterInit);
	}

	public void setAfterInitializedChange(java.lang.Object afterInitializedChange) {
		_afterInitializedChange = afterInitializedChange;

		setScopedAttribute("afterInitializedChange", afterInitializedChange);
	}

	public void setAfterModalChange(java.lang.Object afterModalChange) {
		_afterModalChange = afterModalChange;

		setScopedAttribute("afterModalChange", afterModalChange);
	}

	public void setAfterPreventOverlapChange(java.lang.Object afterPreventOverlapChange) {
		_afterPreventOverlapChange = afterPreventOverlapChange;

		setScopedAttribute("afterPreventOverlapChange", afterPreventOverlapChange);
	}

	public void setAfterRenderChange(java.lang.Object afterRenderChange) {
		_afterRenderChange = afterRenderChange;

		setScopedAttribute("afterRenderChange", afterRenderChange);
	}

	public void setAfterRenderedChange(java.lang.Object afterRenderedChange) {
		_afterRenderedChange = afterRenderedChange;

		setScopedAttribute("afterRenderedChange", afterRenderedChange);
	}

	public void setAfterResizableChange(java.lang.Object afterResizableChange) {
		_afterResizableChange = afterResizableChange;

		setScopedAttribute("afterResizableChange", afterResizableChange);
	}

	public void setAfterResizableInstanceChange(java.lang.Object afterResizableInstanceChange) {
		_afterResizableInstanceChange = afterResizableInstanceChange;

		setScopedAttribute("afterResizableInstanceChange", afterResizableInstanceChange);
	}

	public void setAfterShimChange(java.lang.Object afterShimChange) {
		_afterShimChange = afterShimChange;

		setScopedAttribute("afterShimChange", afterShimChange);
	}

	public void setAfterSrcNodeChange(java.lang.Object afterSrcNodeChange) {
		_afterSrcNodeChange = afterSrcNodeChange;

		setScopedAttribute("afterSrcNodeChange", afterSrcNodeChange);
	}

	public void setAfterStackChange(java.lang.Object afterStackChange) {
		_afterStackChange = afterStackChange;

		setScopedAttribute("afterStackChange", afterStackChange);
	}

	public void setAfterStringsChange(java.lang.Object afterStringsChange) {
		_afterStringsChange = afterStringsChange;

		setScopedAttribute("afterStringsChange", afterStringsChange);
	}

	public void setAfterTabIndexChange(java.lang.Object afterTabIndexChange) {
		_afterTabIndexChange = afterTabIndexChange;

		setScopedAttribute("afterTabIndexChange", afterTabIndexChange);
	}

	public void setAfterTitleChange(java.lang.Object afterTitleChange) {
		_afterTitleChange = afterTitleChange;

		setScopedAttribute("afterTitleChange", afterTitleChange);
	}

	public void setAfterVisibleChange(java.lang.Object afterVisibleChange) {
		_afterVisibleChange = afterVisibleChange;

		setScopedAttribute("afterVisibleChange", afterVisibleChange);
	}

	public void setAfterContentUpdate(java.lang.Object afterContentUpdate) {
		_afterContentUpdate = afterContentUpdate;

		setScopedAttribute("afterContentUpdate", afterContentUpdate);
	}

	public void setAfterRender(java.lang.Object afterRender) {
		_afterRender = afterRender;

		setScopedAttribute("afterRender", afterRender);
	}

	public void setAfterWidthChange(java.lang.Object afterWidthChange) {
		_afterWidthChange = afterWidthChange;

		setScopedAttribute("afterWidthChange", afterWidthChange);
	}

	public void setAfterXChange(java.lang.Object afterXChange) {
		_afterXChange = afterXChange;

		setScopedAttribute("afterXChange", afterXChange);
	}

	public void setAfterXyChange(java.lang.Object afterXyChange) {
		_afterXyChange = afterXyChange;

		setScopedAttribute("afterXyChange", afterXyChange);
	}

	public void setAfterYChange(java.lang.Object afterYChange) {
		_afterYChange = afterYChange;

		setScopedAttribute("afterYChange", afterYChange);
	}

	public void setAfterZIndexChange(java.lang.Object afterZIndexChange) {
		_afterZIndexChange = afterZIndexChange;

		setScopedAttribute("afterZIndexChange", afterZIndexChange);
	}

	public void setOnAlignChange(java.lang.Object onAlignChange) {
		_onAlignChange = onAlignChange;

		setScopedAttribute("onAlignChange", onAlignChange);
	}

	public void setOnBodyContentChange(java.lang.Object onBodyContentChange) {
		_onBodyContentChange = onBodyContentChange;

		setScopedAttribute("onBodyContentChange", onBodyContentChange);
	}

	public void setOnBoundingBoxChange(java.lang.Object onBoundingBoxChange) {
		_onBoundingBoxChange = onBoundingBoxChange;

		setScopedAttribute("onBoundingBoxChange", onBoundingBoxChange);
	}

	public void setOnButtonsChange(java.lang.Object onButtonsChange) {
		_onButtonsChange = onButtonsChange;

		setScopedAttribute("onButtonsChange", onButtonsChange);
	}

	public void setOnCenteredChange(java.lang.Object onCenteredChange) {
		_onCenteredChange = onCenteredChange;

		setScopedAttribute("onCenteredChange", onCenteredChange);
	}

	public void setOnCloseChange(java.lang.Object onCloseChange) {
		_onCloseChange = onCloseChange;

		setScopedAttribute("onCloseChange", onCloseChange);
	}

	public void setOnCollapsedChange(java.lang.Object onCollapsedChange) {
		_onCollapsedChange = onCollapsedChange;

		setScopedAttribute("onCollapsedChange", onCollapsedChange);
	}

	public void setOnCollapsibleChange(java.lang.Object onCollapsibleChange) {
		_onCollapsibleChange = onCollapsibleChange;

		setScopedAttribute("onCollapsibleChange", onCollapsibleChange);
	}

	public void setOnConstrain2viewChange(java.lang.Object onConstrain2viewChange) {
		_onConstrain2viewChange = onConstrain2viewChange;

		setScopedAttribute("onConstrain2viewChange", onConstrain2viewChange);
	}

	public void setOnConstrainChange(java.lang.Object onConstrainChange) {
		_onConstrainChange = onConstrainChange;

		setScopedAttribute("onConstrainChange", onConstrainChange);
	}

	public void setOnContentBoxChange(java.lang.Object onContentBoxChange) {
		_onContentBoxChange = onContentBoxChange;

		setScopedAttribute("onContentBoxChange", onContentBoxChange);
	}

	public void setOnCssClassChange(java.lang.Object onCssClassChange) {
		_onCssClassChange = onCssClassChange;

		setScopedAttribute("onCssClassChange", onCssClassChange);
	}

	public void setOnDestroy(java.lang.Object onDestroy) {
		_onDestroy = onDestroy;

		setScopedAttribute("onDestroy", onDestroy);
	}

	public void setOnDestroyOnCloseChange(java.lang.Object onDestroyOnCloseChange) {
		_onDestroyOnCloseChange = onDestroyOnCloseChange;

		setScopedAttribute("onDestroyOnCloseChange", onDestroyOnCloseChange);
	}

	public void setOnDestroyedChange(java.lang.Object onDestroyedChange) {
		_onDestroyedChange = onDestroyedChange;

		setScopedAttribute("onDestroyedChange", onDestroyedChange);
	}

	public void setOnDisabledChange(java.lang.Object onDisabledChange) {
		_onDisabledChange = onDisabledChange;

		setScopedAttribute("onDisabledChange", onDisabledChange);
	}

	public void setOnDragInstanceChange(java.lang.Object onDragInstanceChange) {
		_onDragInstanceChange = onDragInstanceChange;

		setScopedAttribute("onDragInstanceChange", onDragInstanceChange);
	}

	public void setOnDraggableChange(java.lang.Object onDraggableChange) {
		_onDraggableChange = onDraggableChange;

		setScopedAttribute("onDraggableChange", onDraggableChange);
	}

	public void setOnFillHeightChange(java.lang.Object onFillHeightChange) {
		_onFillHeightChange = onFillHeightChange;

		setScopedAttribute("onFillHeightChange", onFillHeightChange);
	}

	public void setOnFocusedChange(java.lang.Object onFocusedChange) {
		_onFocusedChange = onFocusedChange;

		setScopedAttribute("onFocusedChange", onFocusedChange);
	}

	public void setOnFooterContentChange(java.lang.Object onFooterContentChange) {
		_onFooterContentChange = onFooterContentChange;

		setScopedAttribute("onFooterContentChange", onFooterContentChange);
	}

	public void setOnHeaderContentChange(java.lang.Object onHeaderContentChange) {
		_onHeaderContentChange = onHeaderContentChange;

		setScopedAttribute("onHeaderContentChange", onHeaderContentChange);
	}

	public void setOnHeightChange(java.lang.Object onHeightChange) {
		_onHeightChange = onHeightChange;

		setScopedAttribute("onHeightChange", onHeightChange);
	}

	public void setOnHideClassChange(java.lang.Object onHideClassChange) {
		_onHideClassChange = onHideClassChange;

		setScopedAttribute("onHideClassChange", onHideClassChange);
	}

	public void setOnIconsChange(java.lang.Object onIconsChange) {
		_onIconsChange = onIconsChange;

		setScopedAttribute("onIconsChange", onIconsChange);
	}

	public void setOnIdChange(java.lang.Object onIdChange) {
		_onIdChange = onIdChange;

		setScopedAttribute("onIdChange", onIdChange);
	}

	public void setOnInit(java.lang.Object onInit) {
		_onInit = onInit;

		setScopedAttribute("onInit", onInit);
	}

	public void setOnInitializedChange(java.lang.Object onInitializedChange) {
		_onInitializedChange = onInitializedChange;

		setScopedAttribute("onInitializedChange", onInitializedChange);
	}

	public void setOnModalChange(java.lang.Object onModalChange) {
		_onModalChange = onModalChange;

		setScopedAttribute("onModalChange", onModalChange);
	}

	public void setOnPreventOverlapChange(java.lang.Object onPreventOverlapChange) {
		_onPreventOverlapChange = onPreventOverlapChange;

		setScopedAttribute("onPreventOverlapChange", onPreventOverlapChange);
	}

	public void setOnRenderChange(java.lang.Object onRenderChange) {
		_onRenderChange = onRenderChange;

		setScopedAttribute("onRenderChange", onRenderChange);
	}

	public void setOnRenderedChange(java.lang.Object onRenderedChange) {
		_onRenderedChange = onRenderedChange;

		setScopedAttribute("onRenderedChange", onRenderedChange);
	}

	public void setOnResizableChange(java.lang.Object onResizableChange) {
		_onResizableChange = onResizableChange;

		setScopedAttribute("onResizableChange", onResizableChange);
	}

	public void setOnResizableInstanceChange(java.lang.Object onResizableInstanceChange) {
		_onResizableInstanceChange = onResizableInstanceChange;

		setScopedAttribute("onResizableInstanceChange", onResizableInstanceChange);
	}

	public void setOnShimChange(java.lang.Object onShimChange) {
		_onShimChange = onShimChange;

		setScopedAttribute("onShimChange", onShimChange);
	}

	public void setOnSrcNodeChange(java.lang.Object onSrcNodeChange) {
		_onSrcNodeChange = onSrcNodeChange;

		setScopedAttribute("onSrcNodeChange", onSrcNodeChange);
	}

	public void setOnStackChange(java.lang.Object onStackChange) {
		_onStackChange = onStackChange;

		setScopedAttribute("onStackChange", onStackChange);
	}

	public void setOnStringsChange(java.lang.Object onStringsChange) {
		_onStringsChange = onStringsChange;

		setScopedAttribute("onStringsChange", onStringsChange);
	}

	public void setOnTabIndexChange(java.lang.Object onTabIndexChange) {
		_onTabIndexChange = onTabIndexChange;

		setScopedAttribute("onTabIndexChange", onTabIndexChange);
	}

	public void setOnTitleChange(java.lang.Object onTitleChange) {
		_onTitleChange = onTitleChange;

		setScopedAttribute("onTitleChange", onTitleChange);
	}

	public void setOnVisibleChange(java.lang.Object onVisibleChange) {
		_onVisibleChange = onVisibleChange;

		setScopedAttribute("onVisibleChange", onVisibleChange);
	}

	public void setOnContentUpdate(java.lang.Object onContentUpdate) {
		_onContentUpdate = onContentUpdate;

		setScopedAttribute("onContentUpdate", onContentUpdate);
	}

	public void setOnRender(java.lang.Object onRender) {
		_onRender = onRender;

		setScopedAttribute("onRender", onRender);
	}

	public void setOnWidthChange(java.lang.Object onWidthChange) {
		_onWidthChange = onWidthChange;

		setScopedAttribute("onWidthChange", onWidthChange);
	}

	public void setOnXChange(java.lang.Object onXChange) {
		_onXChange = onXChange;

		setScopedAttribute("onXChange", onXChange);
	}

	public void setOnXyChange(java.lang.Object onXyChange) {
		_onXyChange = onXyChange;

		setScopedAttribute("onXyChange", onXyChange);
	}

	public void setOnYChange(java.lang.Object onYChange) {
		_onYChange = onYChange;

		setScopedAttribute("onYChange", onYChange);
	}

	public void setOnZIndexChange(java.lang.Object onZIndexChange) {
		_onZIndexChange = onZIndexChange;

		setScopedAttribute("onZIndexChange", onZIndexChange);
	}


	protected void cleanUp() {
		_align = null;
		_dialogBodyContent = null;
		_boundingBox = null;
		_buttons = null;
		_centered = null;
		_close = true;
		_collapsed = false;
		_collapsible = false;
		_constrain = null;
		_constrain2view = null;
		_contentBox = null;
		_cssClass = null;
		_destroyOnClose = false;
		_destroyed = false;
		_disabled = false;
		_dragInstance = null;
		_draggable = true;
		_fillHeight = null;
		_focused = false;
		_footerContent = null;
		_headerContent = null;
		_height = null;
		_hideClass = "aui-helper-hidden";
		_icons = null;
		_dialogId = null;
		_initialized = false;
		_modal = false;
		_preventOverlap = false;
		_render = null;
		_rendered = false;
		_resizable = true;
		_resizableInstance = null;
		_shim = false;
		_srcNode = null;
		_stack = true;
		_strings = null;
		_tabIndex = 0;
		_title = null;
		_visible = true;
		_width = null;
		_x = 0;
		_xy = null;
		_y = 0;
		_zIndex = 0;
		_afterAlignChange = null;
		_afterBodyContentChange = null;
		_afterBoundingBoxChange = null;
		_afterButtonsChange = null;
		_afterCenteredChange = null;
		_afterCloseChange = null;
		_afterCollapsedChange = null;
		_afterCollapsibleChange = null;
		_afterConstrain2viewChange = null;
		_afterConstrainChange = null;
		_afterContentBoxChange = null;
		_afterCssClassChange = null;
		_afterDestroy = null;
		_afterDestroyOnCloseChange = null;
		_afterDestroyedChange = null;
		_afterDisabledChange = null;
		_afterDragInstanceChange = null;
		_afterDraggableChange = null;
		_afterFillHeightChange = null;
		_afterFocusedChange = null;
		_afterFooterContentChange = null;
		_afterHeaderContentChange = null;
		_afterHeightChange = null;
		_afterHideClassChange = null;
		_afterIconsChange = null;
		_afterIdChange = null;
		_afterInit = null;
		_afterInitializedChange = null;
		_afterModalChange = null;
		_afterPreventOverlapChange = null;
		_afterRenderChange = null;
		_afterRenderedChange = null;
		_afterResizableChange = null;
		_afterResizableInstanceChange = null;
		_afterShimChange = null;
		_afterSrcNodeChange = null;
		_afterStackChange = null;
		_afterStringsChange = null;
		_afterTabIndexChange = null;
		_afterTitleChange = null;
		_afterVisibleChange = null;
		_afterContentUpdate = null;
		_afterRender = null;
		_afterWidthChange = null;
		_afterXChange = null;
		_afterXyChange = null;
		_afterYChange = null;
		_afterZIndexChange = null;
		_onAlignChange = null;
		_onBodyContentChange = null;
		_onBoundingBoxChange = null;
		_onButtonsChange = null;
		_onCenteredChange = null;
		_onCloseChange = null;
		_onCollapsedChange = null;
		_onCollapsibleChange = null;
		_onConstrain2viewChange = null;
		_onConstrainChange = null;
		_onContentBoxChange = null;
		_onCssClassChange = null;
		_onDestroy = null;
		_onDestroyOnCloseChange = null;
		_onDestroyedChange = null;
		_onDisabledChange = null;
		_onDragInstanceChange = null;
		_onDraggableChange = null;
		_onFillHeightChange = null;
		_onFocusedChange = null;
		_onFooterContentChange = null;
		_onHeaderContentChange = null;
		_onHeightChange = null;
		_onHideClassChange = null;
		_onIconsChange = null;
		_onIdChange = null;
		_onInit = null;
		_onInitializedChange = null;
		_onModalChange = null;
		_onPreventOverlapChange = null;
		_onRenderChange = null;
		_onRenderedChange = null;
		_onResizableChange = null;
		_onResizableInstanceChange = null;
		_onShimChange = null;
		_onSrcNodeChange = null;
		_onStackChange = null;
		_onStringsChange = null;
		_onTabIndexChange = null;
		_onTitleChange = null;
		_onVisibleChange = null;
		_onContentUpdate = null;
		_onRender = null;
		_onWidthChange = null;
		_onXChange = null;
		_onXyChange = null;
		_onYChange = null;
		_onZIndexChange = null;
	}

	protected String getPage() {
		return _PAGE;
	}
	
	protected void setAttributes(HttpServletRequest request) {
		setNamespacedAttribute(request, "align", _align);
		setNamespacedAttribute(request, "dialogBodyContent", _dialogBodyContent);
		setNamespacedAttribute(request, "boundingBox", _boundingBox);
		setNamespacedAttribute(request, "buttons", _buttons);
		setNamespacedAttribute(request, "centered", _centered);
		setNamespacedAttribute(request, "close", _close);
		setNamespacedAttribute(request, "collapsed", _collapsed);
		setNamespacedAttribute(request, "collapsible", _collapsible);
		setNamespacedAttribute(request, "constrain", _constrain);
		setNamespacedAttribute(request, "constrain2view", _constrain2view);
		setNamespacedAttribute(request, "contentBox", _contentBox);
		setNamespacedAttribute(request, "cssClass", _cssClass);
		setNamespacedAttribute(request, "destroyOnClose", _destroyOnClose);
		setNamespacedAttribute(request, "destroyed", _destroyed);
		setNamespacedAttribute(request, "disabled", _disabled);
		setNamespacedAttribute(request, "dragInstance", _dragInstance);
		setNamespacedAttribute(request, "draggable", _draggable);
		setNamespacedAttribute(request, "fillHeight", _fillHeight);
		setNamespacedAttribute(request, "focused", _focused);
		setNamespacedAttribute(request, "footerContent", _footerContent);
		setNamespacedAttribute(request, "headerContent", _headerContent);
		setNamespacedAttribute(request, "height", _height);
		setNamespacedAttribute(request, "hideClass", _hideClass);
		setNamespacedAttribute(request, "icons", _icons);
		setNamespacedAttribute(request, "dialogId", _dialogId);
		setNamespacedAttribute(request, "initialized", _initialized);
		setNamespacedAttribute(request, "modal", _modal);
		setNamespacedAttribute(request, "preventOverlap", _preventOverlap);
		setNamespacedAttribute(request, "render", _render);
		setNamespacedAttribute(request, "rendered", _rendered);
		setNamespacedAttribute(request, "resizable", _resizable);
		setNamespacedAttribute(request, "resizableInstance", _resizableInstance);
		setNamespacedAttribute(request, "shim", _shim);
		setNamespacedAttribute(request, "srcNode", _srcNode);
		setNamespacedAttribute(request, "stack", _stack);
		setNamespacedAttribute(request, "strings", _strings);
		setNamespacedAttribute(request, "tabIndex", _tabIndex);
		setNamespacedAttribute(request, "title", _title);
		setNamespacedAttribute(request, "visible", _visible);
		setNamespacedAttribute(request, "width", _width);
		setNamespacedAttribute(request, "x", _x);
		setNamespacedAttribute(request, "xy", _xy);
		setNamespacedAttribute(request, "y", _y);
		setNamespacedAttribute(request, "zIndex", _zIndex);
		setNamespacedAttribute(request, "afterAlignChange", _afterAlignChange);
		setNamespacedAttribute(request, "afterBodyContentChange", _afterBodyContentChange);
		setNamespacedAttribute(request, "afterBoundingBoxChange", _afterBoundingBoxChange);
		setNamespacedAttribute(request, "afterButtonsChange", _afterButtonsChange);
		setNamespacedAttribute(request, "afterCenteredChange", _afterCenteredChange);
		setNamespacedAttribute(request, "afterCloseChange", _afterCloseChange);
		setNamespacedAttribute(request, "afterCollapsedChange", _afterCollapsedChange);
		setNamespacedAttribute(request, "afterCollapsibleChange", _afterCollapsibleChange);
		setNamespacedAttribute(request, "afterConstrain2viewChange", _afterConstrain2viewChange);
		setNamespacedAttribute(request, "afterConstrainChange", _afterConstrainChange);
		setNamespacedAttribute(request, "afterContentBoxChange", _afterContentBoxChange);
		setNamespacedAttribute(request, "afterCssClassChange", _afterCssClassChange);
		setNamespacedAttribute(request, "afterDestroy", _afterDestroy);
		setNamespacedAttribute(request, "afterDestroyOnCloseChange", _afterDestroyOnCloseChange);
		setNamespacedAttribute(request, "afterDestroyedChange", _afterDestroyedChange);
		setNamespacedAttribute(request, "afterDisabledChange", _afterDisabledChange);
		setNamespacedAttribute(request, "afterDragInstanceChange", _afterDragInstanceChange);
		setNamespacedAttribute(request, "afterDraggableChange", _afterDraggableChange);
		setNamespacedAttribute(request, "afterFillHeightChange", _afterFillHeightChange);
		setNamespacedAttribute(request, "afterFocusedChange", _afterFocusedChange);
		setNamespacedAttribute(request, "afterFooterContentChange", _afterFooterContentChange);
		setNamespacedAttribute(request, "afterHeaderContentChange", _afterHeaderContentChange);
		setNamespacedAttribute(request, "afterHeightChange", _afterHeightChange);
		setNamespacedAttribute(request, "afterHideClassChange", _afterHideClassChange);
		setNamespacedAttribute(request, "afterIconsChange", _afterIconsChange);
		setNamespacedAttribute(request, "afterIdChange", _afterIdChange);
		setNamespacedAttribute(request, "afterInit", _afterInit);
		setNamespacedAttribute(request, "afterInitializedChange", _afterInitializedChange);
		setNamespacedAttribute(request, "afterModalChange", _afterModalChange);
		setNamespacedAttribute(request, "afterPreventOverlapChange", _afterPreventOverlapChange);
		setNamespacedAttribute(request, "afterRenderChange", _afterRenderChange);
		setNamespacedAttribute(request, "afterRenderedChange", _afterRenderedChange);
		setNamespacedAttribute(request, "afterResizableChange", _afterResizableChange);
		setNamespacedAttribute(request, "afterResizableInstanceChange", _afterResizableInstanceChange);
		setNamespacedAttribute(request, "afterShimChange", _afterShimChange);
		setNamespacedAttribute(request, "afterSrcNodeChange", _afterSrcNodeChange);
		setNamespacedAttribute(request, "afterStackChange", _afterStackChange);
		setNamespacedAttribute(request, "afterStringsChange", _afterStringsChange);
		setNamespacedAttribute(request, "afterTabIndexChange", _afterTabIndexChange);
		setNamespacedAttribute(request, "afterTitleChange", _afterTitleChange);
		setNamespacedAttribute(request, "afterVisibleChange", _afterVisibleChange);
		setNamespacedAttribute(request, "afterContentUpdate", _afterContentUpdate);
		setNamespacedAttribute(request, "afterRender", _afterRender);
		setNamespacedAttribute(request, "afterWidthChange", _afterWidthChange);
		setNamespacedAttribute(request, "afterXChange", _afterXChange);
		setNamespacedAttribute(request, "afterXyChange", _afterXyChange);
		setNamespacedAttribute(request, "afterYChange", _afterYChange);
		setNamespacedAttribute(request, "afterZIndexChange", _afterZIndexChange);
		setNamespacedAttribute(request, "onAlignChange", _onAlignChange);
		setNamespacedAttribute(request, "onBodyContentChange", _onBodyContentChange);
		setNamespacedAttribute(request, "onBoundingBoxChange", _onBoundingBoxChange);
		setNamespacedAttribute(request, "onButtonsChange", _onButtonsChange);
		setNamespacedAttribute(request, "onCenteredChange", _onCenteredChange);
		setNamespacedAttribute(request, "onCloseChange", _onCloseChange);
		setNamespacedAttribute(request, "onCollapsedChange", _onCollapsedChange);
		setNamespacedAttribute(request, "onCollapsibleChange", _onCollapsibleChange);
		setNamespacedAttribute(request, "onConstrain2viewChange", _onConstrain2viewChange);
		setNamespacedAttribute(request, "onConstrainChange", _onConstrainChange);
		setNamespacedAttribute(request, "onContentBoxChange", _onContentBoxChange);
		setNamespacedAttribute(request, "onCssClassChange", _onCssClassChange);
		setNamespacedAttribute(request, "onDestroy", _onDestroy);
		setNamespacedAttribute(request, "onDestroyOnCloseChange", _onDestroyOnCloseChange);
		setNamespacedAttribute(request, "onDestroyedChange", _onDestroyedChange);
		setNamespacedAttribute(request, "onDisabledChange", _onDisabledChange);
		setNamespacedAttribute(request, "onDragInstanceChange", _onDragInstanceChange);
		setNamespacedAttribute(request, "onDraggableChange", _onDraggableChange);
		setNamespacedAttribute(request, "onFillHeightChange", _onFillHeightChange);
		setNamespacedAttribute(request, "onFocusedChange", _onFocusedChange);
		setNamespacedAttribute(request, "onFooterContentChange", _onFooterContentChange);
		setNamespacedAttribute(request, "onHeaderContentChange", _onHeaderContentChange);
		setNamespacedAttribute(request, "onHeightChange", _onHeightChange);
		setNamespacedAttribute(request, "onHideClassChange", _onHideClassChange);
		setNamespacedAttribute(request, "onIconsChange", _onIconsChange);
		setNamespacedAttribute(request, "onIdChange", _onIdChange);
		setNamespacedAttribute(request, "onInit", _onInit);
		setNamespacedAttribute(request, "onInitializedChange", _onInitializedChange);
		setNamespacedAttribute(request, "onModalChange", _onModalChange);
		setNamespacedAttribute(request, "onPreventOverlapChange", _onPreventOverlapChange);
		setNamespacedAttribute(request, "onRenderChange", _onRenderChange);
		setNamespacedAttribute(request, "onRenderedChange", _onRenderedChange);
		setNamespacedAttribute(request, "onResizableChange", _onResizableChange);
		setNamespacedAttribute(request, "onResizableInstanceChange", _onResizableInstanceChange);
		setNamespacedAttribute(request, "onShimChange", _onShimChange);
		setNamespacedAttribute(request, "onSrcNodeChange", _onSrcNodeChange);
		setNamespacedAttribute(request, "onStackChange", _onStackChange);
		setNamespacedAttribute(request, "onStringsChange", _onStringsChange);
		setNamespacedAttribute(request, "onTabIndexChange", _onTabIndexChange);
		setNamespacedAttribute(request, "onTitleChange", _onTitleChange);
		setNamespacedAttribute(request, "onVisibleChange", _onVisibleChange);
		setNamespacedAttribute(request, "onContentUpdate", _onContentUpdate);
		setNamespacedAttribute(request, "onRender", _onRender);
		setNamespacedAttribute(request, "onWidthChange", _onWidthChange);
		setNamespacedAttribute(request, "onXChange", _onXChange);
		setNamespacedAttribute(request, "onXyChange", _onXyChange);
		setNamespacedAttribute(request, "onYChange", _onYChange);
		setNamespacedAttribute(request, "onZIndexChange", _onZIndexChange);
	}

	protected static final String _ATTRIBUTE_NAMESPACE = "alloy:dialog:";

	private static final String _PAGE =
		"/html/taglib/alloy/dialog/page.jsp";

	protected java.lang.Object _align;
	protected java.lang.String _dialogBodyContent;
	protected java.lang.String _boundingBox;
	protected java.lang.Object _buttons;
	protected java.lang.Object _centered;
	protected java.lang.Boolean _close;
	protected java.lang.Boolean _collapsed;
	protected java.lang.Boolean _collapsible;
	protected java.lang.Object _constrain;
	protected java.lang.Object _constrain2view;
	protected java.lang.String _contentBox;
	protected java.lang.String _cssClass;
	protected java.lang.Boolean _destroyOnClose;
	protected java.lang.Boolean _destroyed;
	protected java.lang.Boolean _disabled;
	protected java.lang.Object _dragInstance;
	protected java.lang.Boolean _draggable;
	protected java.lang.Object _fillHeight;
	protected java.lang.Boolean _focused;
	protected java.lang.Object _footerContent;
	protected java.lang.Object _headerContent;
	protected java.lang.Object _height;
	protected java.lang.String _hideClass;
	protected java.lang.Object _icons;
	protected java.lang.String _dialogId;
	protected java.lang.Boolean _initialized;
	protected java.lang.Boolean _modal;
	protected java.lang.Boolean _preventOverlap;
	protected java.lang.Object _render;
	protected java.lang.Boolean _rendered;
	protected java.lang.Boolean _resizable;
	protected java.lang.Object _resizableInstance;
	protected java.lang.Boolean _shim;
	protected java.lang.String _srcNode;
	protected java.lang.Boolean _stack;
	protected java.lang.Object _strings;
	protected java.lang.Object _tabIndex;
	protected java.lang.Object _title;
	protected java.lang.Boolean _visible;
	protected java.lang.Object _width;
	protected java.lang.Object _x;
	protected java.lang.Object _xy;
	protected java.lang.Object _y;
	protected java.lang.Object _zIndex;
	protected java.lang.Object _afterAlignChange;
	protected java.lang.Object _afterBodyContentChange;
	protected java.lang.Object _afterBoundingBoxChange;
	protected java.lang.Object _afterButtonsChange;
	protected java.lang.Object _afterCenteredChange;
	protected java.lang.Object _afterCloseChange;
	protected java.lang.Object _afterCollapsedChange;
	protected java.lang.Object _afterCollapsibleChange;
	protected java.lang.Object _afterConstrain2viewChange;
	protected java.lang.Object _afterConstrainChange;
	protected java.lang.Object _afterContentBoxChange;
	protected java.lang.Object _afterCssClassChange;
	protected java.lang.Object _afterDestroy;
	protected java.lang.Object _afterDestroyOnCloseChange;
	protected java.lang.Object _afterDestroyedChange;
	protected java.lang.Object _afterDisabledChange;
	protected java.lang.Object _afterDragInstanceChange;
	protected java.lang.Object _afterDraggableChange;
	protected java.lang.Object _afterFillHeightChange;
	protected java.lang.Object _afterFocusedChange;
	protected java.lang.Object _afterFooterContentChange;
	protected java.lang.Object _afterHeaderContentChange;
	protected java.lang.Object _afterHeightChange;
	protected java.lang.Object _afterHideClassChange;
	protected java.lang.Object _afterIconsChange;
	protected java.lang.Object _afterIdChange;
	protected java.lang.Object _afterInit;
	protected java.lang.Object _afterInitializedChange;
	protected java.lang.Object _afterModalChange;
	protected java.lang.Object _afterPreventOverlapChange;
	protected java.lang.Object _afterRenderChange;
	protected java.lang.Object _afterRenderedChange;
	protected java.lang.Object _afterResizableChange;
	protected java.lang.Object _afterResizableInstanceChange;
	protected java.lang.Object _afterShimChange;
	protected java.lang.Object _afterSrcNodeChange;
	protected java.lang.Object _afterStackChange;
	protected java.lang.Object _afterStringsChange;
	protected java.lang.Object _afterTabIndexChange;
	protected java.lang.Object _afterTitleChange;
	protected java.lang.Object _afterVisibleChange;
	protected java.lang.Object _afterContentUpdate;
	protected java.lang.Object _afterRender;
	protected java.lang.Object _afterWidthChange;
	protected java.lang.Object _afterXChange;
	protected java.lang.Object _afterXyChange;
	protected java.lang.Object _afterYChange;
	protected java.lang.Object _afterZIndexChange;
	protected java.lang.Object _onAlignChange;
	protected java.lang.Object _onBodyContentChange;
	protected java.lang.Object _onBoundingBoxChange;
	protected java.lang.Object _onButtonsChange;
	protected java.lang.Object _onCenteredChange;
	protected java.lang.Object _onCloseChange;
	protected java.lang.Object _onCollapsedChange;
	protected java.lang.Object _onCollapsibleChange;
	protected java.lang.Object _onConstrain2viewChange;
	protected java.lang.Object _onConstrainChange;
	protected java.lang.Object _onContentBoxChange;
	protected java.lang.Object _onCssClassChange;
	protected java.lang.Object _onDestroy;
	protected java.lang.Object _onDestroyOnCloseChange;
	protected java.lang.Object _onDestroyedChange;
	protected java.lang.Object _onDisabledChange;
	protected java.lang.Object _onDragInstanceChange;
	protected java.lang.Object _onDraggableChange;
	protected java.lang.Object _onFillHeightChange;
	protected java.lang.Object _onFocusedChange;
	protected java.lang.Object _onFooterContentChange;
	protected java.lang.Object _onHeaderContentChange;
	protected java.lang.Object _onHeightChange;
	protected java.lang.Object _onHideClassChange;
	protected java.lang.Object _onIconsChange;
	protected java.lang.Object _onIdChange;
	protected java.lang.Object _onInit;
	protected java.lang.Object _onInitializedChange;
	protected java.lang.Object _onModalChange;
	protected java.lang.Object _onPreventOverlapChange;
	protected java.lang.Object _onRenderChange;
	protected java.lang.Object _onRenderedChange;
	protected java.lang.Object _onResizableChange;
	protected java.lang.Object _onResizableInstanceChange;
	protected java.lang.Object _onShimChange;
	protected java.lang.Object _onSrcNodeChange;
	protected java.lang.Object _onStackChange;
	protected java.lang.Object _onStringsChange;
	protected java.lang.Object _onTabIndexChange;
	protected java.lang.Object _onTitleChange;
	protected java.lang.Object _onVisibleChange;
	protected java.lang.Object _onContentUpdate;
	protected java.lang.Object _onRender;
	protected java.lang.Object _onWidthChange;
	protected java.lang.Object _onXChange;
	protected java.lang.Object _onXyChange;
	protected java.lang.Object _onYChange;
	protected java.lang.Object _onZIndexChange;

}