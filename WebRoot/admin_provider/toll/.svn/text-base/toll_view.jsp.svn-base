<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div id="entity_detail">
	<div style="padding-top:4px; padding-bottom:0;">
		<s:form id="view_detail_form" action='#' validate="false" labelposition="top" requiredposition="right" theme="fengfan">
				<s:label name="toll.id" label="资费代码" />
				<s:label name="toll.tollName" label="资费名称" />
	            <s:label name="toll.description" label="描述" />
	            <s:label name="toll.startDate" label="起始日期" value="%{getText('global.format.time',{null!=toll.startDate?toll.startDate:''})}"/>		        
		        <s:label name="toll.endDate" label="结束日期" value="%{getText('global.format.time',{null!=toll.endDate?toll.endDate:''})}"/>
	            <s:label name="toll.setupFee" label="一次性费用"/>
	            <s:label name="toll.providerAsString" label="所属运营商" />
	            <s:label name="toll.billingTypeAsString" label="计费类型" />
	            <s:label name="toll.monthAmount" label="月数" />
	            <s:label name="toll.periodBasicRate" label="周期性基本费率" />
	            <s:label name="toll.durationAmount" label="单月封顶时长(秒)" />
		</s:form>
	</div>
</div>
