<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div id="entity_detail">
	<div style="padding-top:4px; padding-bottom:0;">
		<s:form id="view_detail_form" action='#' validate="false" labelposition="top" requiredposition="right" theme="fengfan">
				
				<s:label name="gateway.id" label="网关设备编号" />
				<s:label name="gateway.domain" label="域名" />
	            <s:label name="gateway.ipAddr" label="IP地址" />
	            <s:label name="gateway.secretKey" label="通讯密码"/>		        
		        <s:label name="gateway.providerAsString" label="所属运营商"/>
	            <s:label name="gateway.gatewayName" label="名称"/>
	            <s:label name="gateway.portalUrl" label="Portal URL" />
				<s:label name="gateway.bandwidth" label="接入带宽(M)" />
				<s:label name="gateway.status" label="状态" />
				
				<s:label name="gateway.proxyEnabledAsString" label="是否允许漫游" />
				<s:label name="gateway.isPublicAsString" label="公用" />
				<s:label name="gateway.gatewayTypeAsString" label="网关类型" />
				<s:label name="gateway.location" label="详细地址" />
				<s:label name="gateway.coordinateAsString" label="经纬度" />
				<s:label name="gateway.portalUrl" label="Portal URL" />
				<s:label name="gateway.inBandwidth" label="上行带宽" />
				<s:label name="gateway.outBandwidth" label="下行带宽" />
		</s:form>
	</div>
</div>
