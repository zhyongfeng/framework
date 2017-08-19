<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<%@ include file="/includes/iframe_header.jsp"%>
<div id="reset_password_accordion">
	<h3><a href="#">重置密码</a></h3>
	
	<div style="padding-top:4px; padding-bottom:0;">
		<s:form id="users_reset_password_action" action="user_processResetPassword.action" validate="false" labelposition="top" requiredposition="right" theme="fengfan">
			<s:label name="users.username" label="用户帐号" />
			<input type="hidden" name="users.username" value="<c:out value="${users.username}"/>"/>
			<input type="hidden" name="users.email" value="<c:out value="${users.email}"/>"/>
			<s:password name="newPassword" label="新密码" maxlength="20" required="true"/>
			<s:password name="confirmPassword" label="确认密码" maxlength="20" required="true" equalTo="#newPassword"/>
		</s:form>
		<TABLE id=table2 cellSpacing=1 cellPadding=0 width="100%"
											border=0>
											<TBODY>
											<c:if test="${error eq 'PasswordNotEqual'}">
											<TR>
												<font color="red">您两次输入的密码不匹配!<BR>
											</TR>
											</c:if>
										</TBODY>
							</TABLE>
<HR>
<s:div id="reset_password_form_buttonbar">
	<s:a href="#" id="users_reset_password_action_submit">提交</s:a>
	<s:a href="#" id="users_reset_password_action_cancel">返回</s:a>
</s:div>
</div>
</div>
<script type="text/javascript" language="javascript">
	$(function() {
		$("input[type='text']").css("width", "150px");
		$("#reset_password_accordion").accordion({
			autoHeight: false,
			navigation: true
		});
		
		$("#users_reset_password_action_submit").button({icons: {primary: "ui-icon-ok"}});
		$("#users_reset_password_action_cancel").button({icons: {primary: "ui-icon-cancel"}});
		$("#users_reset_password_action_submit").click(function() {
			$("#users_reset_password_action").submit();
		});
		$("#users_reset_password_action_cancel").click(function() {
			location="<%=request.getContextPath()%>/users_list.action";
		});
	});
</script>
<%@ include file="/includes/iframe_footer.jsp"%>
