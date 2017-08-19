<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<%@ include file="/includes/iframe_header.jsp"%>
<script language="JavaScript">
	function validateNO()
	{   
		var gatewayNO=$("#gateway_add_action_gateway_id").val();
	}
</script>
<div id="add_edit_accordion">
	<c:choose>
	<c:when test="${submitType == 'edit'}">
		<h3><a href="#">编辑网关设备</a></h3>
	</c:when>
	<c:otherwise>
		<h3><a href="#">添加网关设备</a></h3>
	</c:otherwise>
	</c:choose>
	<div style="padding-top:4px; padding-bottom:0;">
		<s:form id="gateway_add_action" action='gateway_add.action' validate="true" labelposition="top" requiredposition="right" theme="fengfan">
			<c:if test="${not empty gateway.id}">
				<input type="hidden" name="id" value="${gateway.id}" />
			</c:if>
			<s:textfield name="gateway.id" label="网关设备编号" onblur="validateNO();" />
            <s:textfield name="gateway.domain" label="域名" />
            <s:textfield name="gateway.ipAddr" label="IP地址"/>
            <s:textfield name="gateway.secretKey" label="通讯密码"/>
            <s:select tooltip="所属运营商"
	            label="所属运营商"
	            list="providers"
	            name="gateway.providerId"
	            listKey="id"
	            listValue="providerName"
	            emptyOption="false"/>
            <s:textfield name="gateway.gatewayName" label="名称"/>
            
            <s:select tooltip="状态"
	            label="状态"
	            list="gatewayStatuses"
	            name="gateway.status"
	            listKey="id"
	            listValue="name"
	            emptyOption="false"/>
            <s:radio list="useTypes" listKey="id" listValue="name" name="gateway.proxyEnabled" label="是否允许漫游" />
            <s:radio list="useTypes" listKey="id" listValue="name" name="gateway.isPublic" label="公用" />
            <s:select tooltip="网关类型"
	            label="网关类型"
	            list="gatewayTypes"
	            name="gateway.gatewayTypeId"
	            listKey="id"
	            listValue="id"
	            emptyOption="false"/>
            <s:textfield name="gateway.location" label="详细地址"/>
            <s:textfield name="gateway.longitude" label="经度"/>
            <s:textfield name="gateway.latitude" label="纬度"/>
            
            <s:textfield name="gateway.portalUrl" label="Portal URL"/>
            <s:textfield name="gateway.inBandwidth" label="上行带宽(M)"/>
            <s:textfield name="gateway.outBandwidth" label="下行带宽(M)"/>
		</s:form>
		<HR>
		<s:div id="add_edit_form_buttonbar">
			<s:a href="#" id="gateway_add_action_submit">提交</s:a>
			<s:a href="#" id="gateway_add_action_cancel">返回</s:a>
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
		
		$("#gateway_add_action").attr("action", 'gateway_<c:out value="${submitType}" default="add" />.action');
		<c:choose>
		<c:when test="${submitType == 'edit'}">
			$("#gateway_add_action_gateway_id").attr('readonly', true);
		</c:when>
		<c:otherwise>
			$('input[name="gateway.proxyEnabled"]').get(0).checked = true;
			$('input[name="gateway.isPublic"]').get(0).checked = true;
		</c:otherwise>
		</c:choose>

		$("#gateway_add_action_submit").button({icons: {primary: "ui-icon-ok"}});
		$("#gateway_add_action_cancel").button({icons: {primary: "ui-icon-cancel"}});
		$("#gateway_add_action_submit").click(function() {
			$("#gateway_add_action").submit();
		});
		$("#gateway_add_action_cancel").click(function() {
			location="<%=request.getContextPath()%>/gateway_list.action";
		});
	});
</script>
<%@ include file="/includes/iframe_footer.jsp"%>
