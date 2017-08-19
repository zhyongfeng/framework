<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div id="entity_detail">
	<div style="padding-top:4px; padding-bottom:0;">
		<s:form id="view_detail_form" action='#' validate="false" labelposition="top" requiredposition="right" theme="fengfan">
				<s:label name="customer.id" label="帐号" />
				<s:label name="customer.loginName" label="登录名" />
	            <s:label name="customer.providerAsString" label="所属运营商" />
	            <s:label name="customer.dueDate" label="到期日期"  value="%{getText('global.format.time',{null!=customer.dueDate?customer.dueDate:''})}"/>		        
		        <s:label name="customer.statusAsString" label="状态"/>
	            <s:label name="customer.maxOnlineNum" label="最大同时在线用户数"/>
	            <s:label name="customer.bindingTypeAsString" label="绑定类型" />
				<s:label name="customer.bindingMac" label="绑定的MAC地址" />
				<s:label name="customer.roamingFlagAsString" label="漫游标识" />
				<s:label name="customer.billingTypeAsString" label="计费类型" />
				<c:if test="${not empty customer.lotId}">
					<s:label name="customer.lotAsString" label="卡批次号" />
				</c:if>
				<s:label name="customer.availableDuration" label="剩余时长" />
				<s:label name="customer.groupAsString" label="用户所属组" />
				<s:label name="customer.customerTypeAsString" label="用户类型" />
				<s:label name="customer.name" label="姓名" />
				<s:label name="customer.genderAsString" label="性别" />
				<s:label name="customer.address" label="地址" />
				<s:label name="customer.country" label="国家" />
				<s:label name="customer.state" label="省" />
				<s:label name="customer.city" label="市" />
				<s:label name="customer.zip" label="邮编" />
				<s:label name="customer.telephone" label="电话" />
				<s:label name="customer.fax" label="传真" />
				<s:label name="customer.email" label="电子邮箱" />
				<s:label name="customer.mobile" label="手机" />
				<s:label name="customer.passportType" label="证件类型" />
				<s:label name="customer.passportNum" label="证件号码" />
				<s:label name="customer.allowedDueDate" label="允许欠费最大天数" />
				<s:label name="customer.cycleCode" label="周期编号" />
				<s:label name="customer.description" label="注释" />
		</s:form>
	</div>
</div>
