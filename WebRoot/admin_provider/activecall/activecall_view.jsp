<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div id="entity_detail">
	<div style="padding-top:4px; padding-bottom:0;">
		<s:form id="view_detail_form" action='#' validate="false" labelposition="top" requiredposition="right" theme="fengfan">
				<s:label name="activeCall.id" label="Session标识号" />
				<s:label name="activeCall.custName" label="登录名" />
	            <s:label name="activeCall.startTime" label="起始时间" value="%{getText('global.format.time',{null!=activeCall.startTime?activeCall.startTime:''})}"/>
	            <s:label name="activeCall.endTime" label="下线时间"  value="%{getText('global.format.time',{null!=activeCall.endTime?activeCall.endTime:''})}"/>		        
		        <s:label name="activeCall.callingID" label="主叫号码"/>
	            <s:label name="activeCall.status" label="在线状态"/>
	            <s:label name="activeCall.providerAsString" label="运营商" />
				<s:label name="activeCall.nasId" label="网关名称" />
				<s:label name="activeCall.nasIp" label="网关IP" />
				<s:label name="activeCall.realm" label="漫游域名" />
				<s:label name="activeCall.nasPort" label="NAS端口" />
				<s:label name="activeCall.billingType" label="计费包类型" />
				<s:label name="activeCall.calledID" label="被叫号" />
				<s:label name="activeCall.framedIp" label="客户端IP" />
				<s:label name="activeCall.proxyState" label="漫游标识" />
				<s:label name="activeCall.nasPortType" label="端口类型" />
		</s:form>
	</div>
</div>
