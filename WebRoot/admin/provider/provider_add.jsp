<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<%@ include file="/includes/iframe_header.jsp"%>
<script language="JavaScript">
	function validateNO()
	{   
		var providerNO=$("#provider_add_action_provider_id").val();
	}
</script>
<div id="add_edit_accordion">
	<c:choose>
	<c:when test="${submitType == 'edit'}">
		<h3><a href="#">编辑运营商</a></h3>
	</c:when>
	<c:otherwise>
		<h3><a href="#">添加运营商</a></h3>
	</c:otherwise>
	</c:choose>
	
	<div style="padding-top:4px; padding-bottom:0;">
		<s:form id="provider_add_action" action='provider_add.action' validate="true" labelposition="top" requiredposition="right" theme="fengfan">
			<c:if test="${not empty provider.id}">
				<input type="hidden" name="id" value="${provider.id}" />
			</c:if>
			<s:textfield name="provider.id" label="编号" onblur="validateNO();" />
			<s:textfield name="provider.providerName" label="名称" />
			<s:select tooltip="选择运营商类型"
	            label="类型"
	            list="providerTypes"
	            name="provider.providerType"
	            listKey="id"
	            listValue="name"
	            emptyOption="false"/>
            <s:textfield name="provider.maxUser" label="最大用户数" />
            <s:textfield name="provider.maxGateway" label="最大网关数"/>
			<s:select tooltip="选择运营商状态"
	            label="状态"
	            list="providerStatuses"
	            name="provider.status"
	            listKey="id"
	            listValue="name"
	            emptyOption="false"/>
            <s:textfield name="provider.contactName" label="联系人"></s:textfield>
            <s:textfield name="provider.email" label="邮箱" />
			<s:textfield name="provider.phone" label="电话" />
			<s:textfield name="provider.fax" label="传真" />
			<s:textfield name="provider.mobile" label="手机" />
			<s:hidden name="provider.createTime" theme="simple"/>
</s:form>
<HR>
<s:div id="add_edit_form_buttonbar">
	<s:a href="#" id="provider_add_action_submit">提交</s:a>
	<s:a href="#" id="provider_add_action_cancel">返回</s:a>
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
		
		$("#provider_add_action").attr("action", 'provider_<c:out value="${submitType}" default="add" />.action');
		<c:choose>
		<c:when test="${submitType == 'edit'}">
		$("#provider_add_action_provider_id").attr('readonly', true);
		</c:when>
		<c:otherwise>
		$("#provider_add_action_provider_maxGateway").attr('value', 2);
		$("#provider_add_action_provider_maxUser").attr('value', 10);
		</c:otherwise>
		</c:choose>
		 
		$("#provider_add_action_submit").button({icons: {primary: "ui-icon-ok"}});
		$("#provider_add_action_cancel").button({icons: {primary: "ui-icon-cancel"}});
		$("#provider_add_action_submit").click(function() {
			$("#provider_add_action").submit();
		});
		$("#provider_add_action_cancel").click(function() {
			location="<%=request.getContextPath()%>/provider_list.action";
		});
	});
</script>
<%@ include file="/includes/iframe_footer.jsp"%>
