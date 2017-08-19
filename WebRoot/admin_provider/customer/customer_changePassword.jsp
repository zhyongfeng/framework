<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<%@ include file="/includes/iframe_header.jsp"%>
<div id="process_password_accordion">
	<h3><a href="#">修改密码</a></h3>
	
	<div style="padding-top:4px; padding-bottom:0;">
		<s:form id="customer_process_password_action" action="customer_processPassword.action" validate="false" labelposition="top" requiredposition="right" theme="fengfan">
			<c:if test="${not empty customer.id}">
				<input type="hidden" name="id" value="${customer.id}" />
			</c:if>
			<s:label name="customer.id" label="帐号" />
			<s:label name="customer.loginName" label="登录名" />
			<s:password name="customer.password" label="旧密码" maxlength="20" required="true"/>
			<s:password name="password1" label="新密码" maxlength="20" required="true"/>
			<s:password name="password2" label="确认密码" maxlength="20" required="true"/>
		</s:form>
		<TABLE id=table2 cellSpacing=1 cellPadding=0 width="100%"
											border=0>
											<TBODY>
											<c:if test="${error eq 'WrongPassword'}">
											<TR>
												<font color="red">您输入的原密码不匹配!<BR>
											</TR>
											</c:if>
											<c:if test="${error eq 'PasswordNotEqual'}">
											<TR>
												<font color="red">您两次输入的密码不匹配!<BR>
											</TR>
											</c:if>
										</TBODY>
							</TABLE>
<HR>
<s:div id="process_password_form_buttonbar">
	<s:a href="#" id="customer_process_password_action_submit">提交</s:a>
	<s:a href="#" id="customer_process_password_action_cancel">返回</s:a>
</s:div>
</div>
</div>
<script type="text/javascript" language="javascript">
	$(function() {
		$("input[type='text']").css("width", "150px");
		$("#process_password_accordion").accordion({
			autoHeight: false,
			navigation: true
		});
		
		$("#customer_process_password_action_submit").button({icons: {primary: "ui-icon-ok"}});
		$("#customer_process_password_action_cancel").button({icons: {primary: "ui-icon-cancel"}});
		$("#customer_process_password_action_submit").click(function() {
			$("#customer_process_password_action").submit();
		});
		$("#customer_process_password_action_cancel").click(function() {
			location="<%=request.getContextPath()%>/customer_list.action";
		});
	});
</script>
<%@ include file="/includes/iframe_footer.jsp"%>
