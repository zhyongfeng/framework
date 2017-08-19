<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div id="entity_detail">
	<div style="padding-top:4px; padding-bottom:0;">
		<s:form id="view_detail_form" action='#' validate="false" labelposition="top" requiredposition="right" theme="fengfan">
				
				<s:label name="udr.id" label="流水号" />
				<s:label name="udr.custId" label="用户账号" />
	            <s:label name="udr.providerAsString" label="所属运营商" />
	            <s:label name="udr.calledId" label="主叫号"/>	
	            <s:label name="udr.callingId" label="被叫号码"/>	        
		        <s:label name="udr.proxyState" label="漫游标识"/>
	            <s:label name="udr.framedIp" label="客户端IP"/>
	            <s:label name="udr.nasId" label="网关名称" />
	            <s:label name="udr.nasIp" label="网关IP" />
				<s:label name="udr.nasPort" label="NAS端口" />
				<s:label name="udr.nasPort" label="端口类型" />
				<s:label name="udr.startTime" label="起始时间" value="%{getText('global.format.time',{null!=udr.startTime?udr.startTime:''})}"/>
	            <s:label name="udr.endTime" label="下线时间"  value="%{getText('global.format.time',{null!=udr.endTime?udr.endTime:''})}"/>		        
		        
				<s:label name="udr.upStream" label="上行字节数" />
				<s:label name="udr.downStream" label="下行字节数" />
				<s:label name="udr.errType" label="Error Type" />
				<s:label name="udr.insertTime" label="起始时间" value="%{getText('global.format.time',{null!=udr.insertTime?udr.insertTime:''})}"/>
		</s:form>
	</div>
</div>
