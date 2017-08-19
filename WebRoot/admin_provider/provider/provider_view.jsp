<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<c:if test="${not empty currentProviderId}">
	<%@ include file="/includes/iframe_header.jsp"%>
	<div id="search_bar">
	<h3><a href="#">运营商信息</a></h3>
</c:if>

<div id="entity_detail">
	<div style="padding-top:4px; padding-bottom:0;">
		<s:form id="provider_add_action" action='provider_add.action' validate="true" labelposition="top" requiredposition="right" theme="fengfan">
				<s:label name="provider.id" label="编号" />
				<s:label name="provider.providerName" label="名称" />
		        <s:label name="provider.providerTypeAsString" label="类型"/>
	            <s:label name="provider.maxUser" label="最大用户数" />
	            <s:label name="provider.maxGateway" label="最大网关数"/>		        
		        <s:label name="provider.statusAsString" label="状态"/>
	            <s:label name="provider.contactName" label="联系人"/>
	            <s:label name="provider.email" label="邮箱" />
				<s:label name="provider.phone" label="电话" />
				<s:label name="provider.fax" label="传真" />
				<s:label name="provider.mobile" label="手机" />
				<s:label name="provider.createTime" label="创建时间" value="%{getText('global.format.time',{null!=provider.createTime?provider.createTime:''})}"/>
				<s:label name="provider.lastUpdateTime" label="最后修改时间" value="%{getText('global.format.time',{null!=provider.lastUpdateTime?provider.lastUpdateTime:''})}"/>
		</s:form>
	</div>
</div>
<c:if test="${not empty currentProviderId}">
	</div>
	<script type="text/javascript" language="javascript">
		jQuery(document).ready(function(){
			$( "#search_bar" ).accordion({
				autoHeight: false,
				navigation: true,
				icons: false
			});
		});
	</script>
	<%@ include file="/includes/iframe_footer.jsp"%>
</c:if>