<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<div id="entity_detail">
	<div style="padding-top:4px; padding-bottom:0;">
		<s:form id="users_add_action" action='users_add.action' validate="true" labelposition="top" requiredposition="right" theme="fengfan">
				<s:label name="users.username" label="用户名" />
				<s:label name="users.providerAsString" label="所属供应商" />
		        <s:label name="users.enabledAsString" label="是否启用"/>
	            <s:label name="users.email" label="Email" />
	            <s:label name="users.description" label="描述"/>		        
		</s:form>
	</div>
</div>
