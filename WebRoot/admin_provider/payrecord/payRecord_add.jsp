<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<%@ include file="/includes/iframe_header.jsp"%>
<script language="JavaScript">
	function validateNO()
	{   
		var payRecordNO=$("#payRecord_add_action_payRecord_id").val();
	}
</script>
<div id="add_edit_accordion">
	<c:choose>
	<c:when test="${submitType == 'edit'}">
		<h3><a href="#">编辑缴费记录</a></h3>
	</c:when>
	<c:otherwise>
		<h3><a href="#">添加缴费记录</a></h3>
	</c:otherwise>
	</c:choose>
	
	<div style="padding-top:4px; padding-bottom:0;">
	<s:form id="payRecord_add_action" action='payRecord_add.action' validate="true" labelposition="top" requiredposition="right" theme="fengfan">
			<c:if test="${not empty payRecord.id}">
				<input type="hidden" name="id" value="${payRecord.id}" />
			</c:if>
			<c:if test="${not empty customerId}">
				<input type="hidden" name="customerId" value="${customerId}" />
			</c:if>
			<s:textfield name="payRecord.id" label="流水号" onblur="validateNO();" required="true"/>
			<s:textfield name="payRecord.custId" label="用户账号" required="true"/>
			<s:select tooltip="所属运营商"
	            label="所属运营商"
	            list="providers"
	            name="payRecord.providerId"
	            listKey="id"
	            listValue="providerName"
	            emptyOption="false"/>
			<s:select tooltip="资费代码"
	            label="资费代码"
	            list="tolls"
	            name="payRecord.tollId"
	            listKey="id"
	            listValue="tollName"
	            emptyOption="false"/>
			<s:textfield name="payRecord.price" label="单价(元)" required="false" cols="60" rows="3" value="%{getText('global.format.money',{null!=payRecord.price?payRecord.price:''})}"/>
			<s:textfield name="payRecord.amount" label="购买数量" required="false" cols="60" rows="3"/>
			<s:textfield name="payRecord.discount" label="折扣率(%)" required="true" cols="60" rows="3"/>
			<s:textfield name="payRecord.totalAmount" label="总金额(元)" required="true" cols="60" rows="3" value="%{getText('global.format.money',{null!=payRecord.totalAmount?payRecord.totalAmount:''})}"/>
			<s:select tooltip="缴费类型"
	            label="缴费类型"
	            list="payType"
	            name="payRecord.payType"
	            listKey="id"
	            listValue="name"
	            emptyOption="false"/>
			<s:radio list="yesNoRadio" listKey="id" listValue="name" name="payRecord.isInvoiced" label="是否已开发票" />
			<c:if test="${adminRole}">
			<s:radio list="yesNoRadio" listKey="id" listValue="name" name="payRecord.isSettled" label="是否已结算" />
				</c:if>
			<s:radio list="yesNoRadio" listKey="id" listValue="name" name="payRecord.isPrinted" label="是否打印" />
			<s:textfield name="payRecord.invoiceName" label="发票抬头" required="false" />
			<c:if test="${SessionUserRole eq 'ADMIN'}">
		        <s:textarea name="payRecord.UpdateContent" label="修改内容" required="false" cols="60" rows="3" />
		        <s:textarea name="payRecord.UpdateReason" label="修改原因" required="false" cols="60" rows="3" />
	        </c:if>
            <s:textarea name="payRecord.remark" label="注释" required="false"  cols="60" rows="3" />
	</s:form>
	<HR>
	<s:div id="add_edit_form_buttonbar">
		<s:a href="#" id="payRecord_add_action_submit">提交</s:a>
		<s:a href="#" id="payRecord_add_action_cancel">返回</s:a>
	</s:div>
</div>
</div>

<script type="text/javascript" language="javascript">
	$(function() {
		
		
		
		$("input[type='text']").css("width", "150px");
		$("select").css("width", "150px");
		$("#add_edit_accordion").accordion({
			autoHeight: false,
			navigation: true
		});
		var submitURL = 'payRecord_<c:out value="${submitType}" default="add" />.action';
		
		$("#payRecord_add_action").attr("action", submitURL);
		$("#payRecord_add_action_payRecord_id").attr('readonly', true);
		$('#payRecord_add_action_payRecord_id').watermark('将自动生成');
		
		<c:choose>
		<c:when test="${submitType == 'edit'}">
			$("#payRecord_add_action_payRecord_id").attr('readonly', true);
		</c:when>
		</c:choose>
		
		$("#payRecord_add_action_payRecord_custId").attr('readonly', (""+location).indexOf("customerId") > 0);

		$("#payRecord_add_action_submit").button({icons: {primary: "ui-icon-ok"}});
		$("#payRecord_add_action_cancel").button({icons: {primary: "ui-icon-cancel"}});
		$("#payRecord_add_action_submit").click(function() {
			$("#payRecord_add_action").submit();
		});
		$("#payRecord_add_action_cancel").click(function() {
			if((""+location).indexOf("customerId") > 0){
				location="<%=request.getContextPath()%>/customer_list.action";
			}else{
				location="<%=request.getContextPath()%>/payRecord_list.action";
			}
		});
		
		<c:choose>
		<c:when test="${adminRole}">

		</c:when>
		<c:otherwise>
			$("#payRecord_add_action_payRecord_discount").attr('readonly', true);
		</c:otherwise>
		</c:choose>
		
		var calculateTotal = function(){
			try{
				var price = parseInt($("#payRecord_add_action_payRecord_price").attr("value"));
				var amount = parseInt($("#payRecord_add_action_payRecord_amount").attr("value"));
				var discount = parseInt($("#payRecord_add_action_payRecord_discount").attr("value"));
				var totalamount = price*amount*discount/100;
				return Math.floor(totalamount);
			}catch(err){
				return "";
			}
		};
		
		var tollMap = ${tollsMap};
		
		//var tollID = tollMap[$("#payRecord_add_action_payRecord_tollId").val()];
		
		
		$("#payRecord_add_action_payRecord_price").attr("value", tollMap["A_"+$("#payRecord_add_action_payRecord_tollId").attr("value")]);
		$("#payRecord_add_action_payRecord_tollId").change(function(){
			$("#payRecord_add_action_payRecord_price").attr("value", tollMap["A_"+this.value]);
			
			$("#payRecord_add_action_payRecord_totalAmount").attr("value", calculateTotal());
		});
		$("#payRecord_add_action_payRecord_price").attr("readonly", true);
		
		$("#payRecord_add_action_payRecord_discount").change(function(){
			$("#payRecord_add_action_payRecord_totalAmount").attr("value", calculateTotal());
		});
		$("#payRecord_add_action_payRecord_amount").change(function(){
			$("#payRecord_add_action_payRecord_totalAmount").attr("value", calculateTotal());
		});
		//
	});
</script>
<%@ include file="/includes/iframe_footer.jsp"%>
