<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<%@ include file="/includes/iframe_header.jsp"%>
<script language="JavaScript">
	function validateNO()
	{   
		var gatewayTypeNO=$("#gatewayType_add_action_gatewayType_id").val();
	}
</script>
<div id="add_edit_accordion">
	<c:choose>
	<c:when test="${submitType == 'edit'}">
		<h3><a href="#">编辑网关设备类型</a></h3>
	</c:when>
	<c:otherwise>
		<h3><a href="#">添加网关设备类型</a></h3>
	</c:otherwise>
	</c:choose>
	<div style="padding-top:4px; padding-bottom:0;">
		<s:form id="gatewayType_add_action" action='gatewayType_add.action' validate="true" labelposition="top" requiredposition="right" theme="fengfan">
			<c:if test="${not empty gatewayType.id}">
				<input type="hidden" name="id" value="${gatewayType.id}" />
			</c:if>
			<s:textfield name="gatewayType.id" label="类型代码" onblur="validateNO();" />
            <s:textfield name="gatewayType.manufactory" label="设备厂商" />
            <s:textfield name="gatewayType.model" label="设备型号"/>
            <s:textarea name="gatewayType.description" label="配置描述" cols="60" rows="3" />
		</s:form>
		<HR>
		<s:div id="add_edit_form_buttonbar">
			<s:a href="#" id="gatewayType_add_action_submit">提交</s:a>
			<s:a href="#" id="gatewayType_add_action_cancel">返回</s:a>
		</s:div>
	</div>
</div>
<script type="text/javascript" language="javascript">
	$(function() {
		$("input[type='text']").css("width", "150px");
		$("select").css("width", "150px");
		$("#add_edit_accordion").accordion({
			autoHeight: false,
			navigation: true
		});
		
		$("#gatewayType_add_action").attr("action", 'gatewayType_<c:out value="${submitType}" default="add" />.action');
		<c:choose>
		<c:when test="${submitType == 'edit'}">
		$("#gatewayType_add_action_gatewayType_id").attr('readonly', true);
		</c:when>
		<c:otherwise>
		
		</c:otherwise>
		</c:choose>
		 
		$("#gatewayType_add_action_submit").button({icons: {primary: "ui-icon-ok"}});
		$("#gatewayType_add_action_cancel").button({icons: {primary: "ui-icon-cancel"}});
		$("#gatewayType_add_action_submit").click(function() {
			$("#gatewayType_add_action").submit();
		});
		$("#gatewayType_add_action_cancel").click(function() {
			location="<%=request.getContextPath()%>/gatewayType_list.action";
		});
	});
</script>
<%@ include file="/includes/iframe_footer.jsp"%>
