<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<%@ include file="/includes/iframe_header.jsp"%>
<script language="JavaScript">
	function validateNO()
	{   
		var userNO=$("#users_add_action_users_username").val();
	}
</script>
<div id="add_edit_accordion">
	<c:choose>
	<c:when test="${submitType == 'edit'}">
		<h3><a href="#">编辑系统用户</a></h3>
	</c:when>
	<c:otherwise>
		<h3><a href="#">添加系统用户</a></h3>
	</c:otherwise>
	</c:choose>
	
	<div style="padding-top:4px; padding-bottom:0;">
		<s:form id="users_add_action" action='user_add.action' validate="true" labelposition="top" requiredposition="right" theme="fengfan">
			<c:if test="${not empty users.username}">
				<input type="hidden" name="id" value="${users.username}" />
			</c:if>
			<s:textfield name="users.username" label="用户名" onblur="validateNO();" />
			<c:if test="${submitType != 'edit'}">
				<s:password label="密码" name="password" size="10" maxlength="16" />
				<s:password label="确认密码" name="verify_password" size="10" maxlength="16" />
			</c:if>
			<s:select tooltip="所属运营商"
	            label="所属运营商"
	            list="providers"
	            name="users.providerId"
	            listKey="id"
	            listValue="providerName"
	            emptyOption="true"/>
	        <s:radio list="yesNoRadios" listKey="id" listValue="name" name="users.enabled" label="是否可用" />
            <s:textfield name="users.email" label="邮箱" />
			<s:textarea name="users.description" label="备注" cols="60" rows="3" />
</s:form>
<HR>
<s:div id="add_edit_form_buttonbar">
	<s:a href="#" id="users_add_action_submit">提交</s:a>
	<s:a href="#" id="users_add_action_cancel">返回</s:a>
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
		
		$("#users_add_action").attr("action", 'user_<c:out value="${submitType}" default="add" />.action');
		<c:choose>
		<c:when test="${submitType == 'edit'}">
			$("#users_add_action_users_username").attr('readonly', true);
				<c:choose>
				<c:when test="${users.enabled == 'true'}">
					$('input[name="users.enabled"]').get(0).checked = false;
					$('input[name="users.enabled"]').get(1).checked = true;
				</c:when>
				<c:otherwise>
					$('input[name="users.enabled"]').get(0).checked = true;
					$('input[name="users.enabled"]').get(1).checked = false;
				</c:otherwise>
				</c:choose>
		</c:when>
		<c:otherwise>
		$("#users_add_action_users_enabled").attr('checked', true);
		</c:otherwise>
		</c:choose>
		 
		$("#users_add_action_submit").button({icons: {primary: "ui-icon-ok"}});
		$("#users_add_action_cancel").button({icons: {primary: "ui-icon-cancel"}});
		$("#users_add_action_submit").click(function() {
			$("#users_add_action").submit();
		});
		$("#users_add_action_cancel").click(function() {
			location="<%=request.getContextPath()%>/user_list.action";
		});
	});
</script>
<%@ include file="/includes/iframe_footer.jsp"%>
