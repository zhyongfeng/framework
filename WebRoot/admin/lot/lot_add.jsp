<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<%@ include file="/includes/iframe_header.jsp"%>
<script language="JavaScript">
	function validateNO()
	{   
		var lotNO=$("#lot_add_action_lot_id").val();
	}
</script>
<div id="add_edit_accordion">
	<c:choose>
	<c:when test="${submitType == 'edit'}">
		<h3><a href="#">编辑批量卡</a></h3>
	</c:when>
	<c:otherwise>
		<h3><a href="#">添加批量卡</a></h3>
	</c:otherwise>
	</c:choose>
	
	<div style="padding-top:4px; padding-bottom:0;">
		<s:form id="lot_add_action" action='lot_add.action' validate="true" labelposition="top" requiredposition="right" theme="fengfan">
			<c:if test="${not empty lot.id}">
				<input type="hidden" name="id" value="${lot.id}" />
			</c:if>
			<s:textfield name="lot.id" label="批次号" onblur="validateNO();" required="false"/>
			<s:select tooltip="所属运营商"
	            label="所属运营商"
	            list="providers"
	            name="lot.providerId"
	            listKey="id"
	            listValue="providerName"
	            emptyOption="false"/>
	        <s:textfield name="lot.value" label="面值" required="true"/>
			<s:textfield name="lot.amount" label="数量" required="true"/>
			<s:textfield name="lot.duration" label="上网时长" required="true"/>
	        <s:textfield name="lot.issueDate" label="制卡日期" />
	        <s:textfield name="lot.expDate" label="失效日期" />
	        <s:textfield name="lot.activeDays" label="有效天数" />
	        <s:select tooltip="状态"
	            label="状态"
	            list="lotStatuses"
	            name="lot.status"
	            listKey="id"
	            listValue="name"
	            emptyOption="false"/>
            <s:textarea name="lot.description" label="注释" cols="60" rows="3"/>
		</s:form>
		<HR>
		<s:div id="add_edit_form_buttonbar">
			<s:a href="#" id="lot_add_action_submit">提交</s:a>
			<s:a href="#" id="lot_add_action_cancel">返回</s:a>
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
		$("#lot_add_action_lot_dueDate").datepicker({dateFormat:"yyyy-mm-dd"});
		$("#lot_add_action").attr("action", 'lot_<c:out value="${submitType}" default="add" />.action');
		$("#lot_add_action_lot_id").attr('readonly', false);
		
		$("#lot_add_action_lot_issueDate").datepicker({dateFormat:"yyyy-mm-dd"});
		$("#lot_add_action_lot_expDate").datepicker({dateFormat:"yyyy-mm-dd"});
		<c:choose>
		<c:when test="${submitType == 'edit'}">
		
		</c:when>
		<c:otherwise>
		

		</c:otherwise>
		</c:choose>

		$("#lot_add_action_submit").button({icons: {primary: "ui-icon-ok"}});
		$("#lot_add_action_cancel").button({icons: {primary: "ui-icon-cancel"}});
		$("#lot_add_action_submit").click(function() {
			$("#lot_add_action").submit();
		});
		$("#lot_add_action_cancel").click(function() {
			location="<%=request.getContextPath()%>/lot_list.action";
		});
	});
</script>
<%@ include file="/includes/iframe_footer.jsp"%>
