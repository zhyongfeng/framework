<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ include file="/includes/iframe_header.jsp"%>
<script language="JavaScript">
	function validateNO()
	{   
		var settleRecordNO=$("#settleRecord_add_action_settleRecord_id").val();
	}
</script>
<div id="add_edit_accordion">
	<c:choose>
	<c:when test="${submitType == 'edit'}">
		<h3><a href="#">编辑结算记录</a></h3>
	</c:when>
	<c:otherwise>
		<h3><a href="#">添加结算记录</a></h3>
	</c:otherwise>
	</c:choose>
	
	<div style="padding-top:4px; padding-bottom:0;">
	<s:form id="settleRecord_add_action" action='settleRecord_add.action' validate="true" labelposition="top" requiredposition="right" theme="fengfan">
			<c:if test="${not empty settleRecord.id}">
				<input type="hidden" name="id" value="${settleRecord.id}" />
			</c:if>
			<s:textfield name="settleRecord.id" label="流水号" onblur="validateNO();" required="true"/>
			<s:select tooltip="所属运营商"
	            label="所属运营商"
	            list="providers"
	            name="settleRecord.providerId"
	            listKey="id"
	            listValue="providerName"
	            emptyOption="false"/>
			<s:textfield name="settleRecord.startDate" cssClass='datepicker' label="开始时间" required="true" value="%{getText('global.format.date',{null!=settleRecord.startDate?settleRecord.startDate:''})}"/>
			<s:textfield name="settleRecord.endDate" cssClass='datepicker' label="截止时间" required="true" value="%{getText('global.format.date',{null!=settleRecord.endDate?settleRecord.endDate:''})}"/>
			<s:textfield name="settleRecord.totalFee" label="总金额(元)" required="true" cols="60" rows="3" value="%{getText('global.format.money',{null!=settleRecord.totalFee?settleRecord.totalFee:''})}"/>
			<s:textfield name="settleRecord.marketFee" label="市场推广费(元)" required="true" cols="60" rows="3" value="%{getText('global.format.money',{null!=settleRecord.marketFee?settleRecord.marketFee:''})}"/>
			<s:textfield name="settleRecord.mgtFee" label="收费管理费(元)" required="true" cols="60" rows="3" value="%{getText('global.format.money',{null!=settleRecord.mgtFee?settleRecord.mgtFee:''})}"/>
			<s:select tooltip="缴费类型"
	            label="缴费类型"
	            list="payType"
	            name="settleRecord.payType"
	            listKey="id"
	            listValue="name"
	            emptyOption="false"/>
			<s:radio list="yesNoRadio" listKey="id" listValue="name" name="settleRecord.isInvoiced" label="是否已开发票" />
			<s:textfield name="settleRecord.invoiceName" label="发票抬头" required="false" />
	        <s:textfield name="settleRecord.execUser" label="收费操作员" value="%{#session.SessionUser.username}"/>
            <s:textarea name="settleRecord.remark" label="注释" required="false" cols="60" rows="3"/>
	</s:form>
	<s:div id="add_edit_form_buttonbar">
		<s:a href="#" id="settleRecord_add_action_submit">提交</s:a>
		<s:a href="#" id="settleRecord_add_action_cancel">返回</s:a>
	</s:div>
</div>
</div>
<%@ include file="/includes/datepicker_script.jsp"%>
<script type="text/javascript" language="javascript">
	$(function() {
		$("input[type='text']").css("width", "150px");
		$("select").css("width", "150px");
		$("#add_edit_accordion").accordion({
			autoHeight: false,
			navigation: true
		});
		$("#settleRecord_add_action_settleRecord_payDate").datepicker({dateFormat:"yyyy-mm-dd"});
		$("#settleRecord_add_action").attr("action", 'settleRecord_<c:out value="${submitType}" default="add" />.action');
		$("#settleRecord_add_action_settleRecord_id").attr('readonly', true);
		$("#settleRecord_add_action_settleRecord_execUser").attr('readonly', true);
		$('#settleRecord_add_action_settleRecord_id').watermark('将自动生成');
		
		<c:choose>
		<c:when test="${submitType == 'edit'}">
		$("#settleRecord_add_action_settleRecord_id").attr('readonly', true);
		</c:when>
		<c:otherwise>
			$('#settleRecord_add_action_settleRecord_isInvoiced0').attr('checked', true);
		</c:otherwise>
		</c:choose>
		
		$("#settleRecord_add_action_submit").button({icons: {primary: "ui-icon-ok"}});
		$("#settleRecord_add_action_cancel").button({icons: {primary: "ui-icon-cancel"}});
		$("#settleRecord_add_action_submit").click(function() {
			$("#settleRecord_add_action").submit();
		});
		$("#settleRecord_add_action_cancel").click(function() {
			location="<%=request.getContextPath()%>/settleRecord_list.action";
		});
	});
</script>
<%@ include file="/includes/iframe_footer.jsp"%>
