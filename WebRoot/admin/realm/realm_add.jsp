<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<%@ include file="/includes/iframe_header.jsp"%>

<div id="add_edit_accordion">
	<c:choose>
	<c:when test="${submitType == 'edit'}">
		<h3><a href="#">编辑漫游域</a></h3>
	</c:when>
	<c:otherwise>
		<h3><a href="#">添加漫游域</a></h3>
	</c:otherwise>
	</c:choose>
	<div style="padding-top:4px; padding-bottom:0;">
		<s:form id="realm_add_action" action='realm_add.action' validate="true" labelposition="top" requiredposition="right" theme="fengfan">
            <c:if test="${not empty realm.id}">
				<input type="hidden" name="id" value="${realm.id}" />
			</c:if>
            <s:textfield name="realm.realmName" label="漫游域名" />
            <s:textfield name="realm.operName" label="漫游运营商名称"/>
            <s:textfield name="realm.ipAddr" label="IP地址"></s:textfield>
            <s:textfield name="realm.authPort" label="认证端口"></s:textfield>
            <s:textfield name="realm.acctPort" label="计费端口"></s:textfield>
            <s:radio list="yesNoTypes" listKey="id" listValue="name" name="realm.noStrip" label="转发时是否剔除后面的域名" />
            <s:radio list="yesNoTypes" listKey="id" listValue="name" name="realm.isSuperRealm" label="是否超级域名" />
		</s:form>
		<HR>
		<s:div id="add_edit_form_buttonbar">
			<s:a href="#" id="realm_add_action_submit">提交</s:a>
			<s:a href="#" id="realm_add_action_cancel">返回</s:a>
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
		
		$("#realm_add_action").attr("action", 'realm_<c:out value="${submitType}" default="add" />.action');
		<c:choose>
		<c:when test="${submitType == 'edit'}">
		
		</c:when>
		<c:otherwise>
		$('input[name="realm.noStrip"]').get(0).checked = true;
		$('input[name="realm.isSuperRealm"]').get(0).checked = true;
		</c:otherwise>
		</c:choose>
		 
		$("#realm_add_action_submit").button({icons: {primary: "ui-icon-ok"}});
		$("#realm_add_action_cancel").button({icons: {primary: "ui-icon-cancel"}});
		$("#realm_add_action_submit").click(function() {
			$("#realm_add_action").submit();
		});
		$("#realm_add_action_cancel").click(function() {
			location="<%=request.getContextPath()%>/realm_list.action";
		});
	});
</script>
<%@ include file="/includes/iframe_footer.jsp"%>
