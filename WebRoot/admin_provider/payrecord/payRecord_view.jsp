<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div id="entity_detail">
	<div style="padding-top:4px; padding-bottom:0;">
		<s:form id="view_detail_form" action='#' validate="false" labelposition="top" requiredposition="right" theme="fengfan">
				
				<s:label name="payRecord.id" label="流水号" />
				<s:label name="payRecord.custId" label="用户账号" />
	            <s:label name="payRecord.providerAsString" label="所属运营商" />
	            <s:label name="payRecord.tollId" label="资费代码"/>	
	            <s:label name="payRecord.tollAsString" label="资费名称"/>	        
		        <s:label name="payRecord.payTypeAsString" label="缴费类型"/>
	            <s:label name="payRecord.isInvoicedAsString" label="是否已开发票"/>
	            <s:label name="payRecord.isSettledAsString" label="是否已结算" />
				<s:label name="payRecord.isPrintedAsString" label="是否打印" />
				<s:label name="payRecord.invoiceName" label="发票抬头" />
				
				<s:label name="payRecord.UpdateUser" label="收费操作员" />
				<s:label name="payRecord.UpdateContent" label="修改内容" />
				<s:label name="payRecord.UpdateReason" label="修改原因" />
				<s:label name="payRecord.remark" label="注释" />
		</s:form>
	</div>
</div>
