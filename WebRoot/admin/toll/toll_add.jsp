<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<%@ include file="/includes/iframe_header.jsp"%>
<script language="JavaScript">
	function validateNO()
	{   
		var tollNO=$("#toll_add_action_toll_id").val();
	}
</script>
<div id="add_edit_accordion">
	<c:choose>
	<c:when test="${submitType == 'edit'}">
		<h3><a href="#">编辑资费策略</a></h3>
	</c:when>
	<c:otherwise>
		<h3><a href="#">添加资费策略</a></h3>
	</c:otherwise>
	</c:choose>
	
	<div style="padding-top:4px; padding-bottom:0;">
		<s:form id="toll_add_action" action='toll_add.action' validate="true" labelposition="top" requiredposition="right" theme="fengfan">
			<c:if test="${not empty toll.id}">
				<input type="hidden" name="id" value="${toll.id}" />
			</c:if>
			<s:textfield name="toll.id" label="资费代码" onblur="validateNO();" required="true"/>
			<s:textfield name="toll.tollName" label="资费名称" required="true"/>
			<s:textarea name="toll.description" label="描述" required="false" cols="60" rows="3"/>
			<s:textfield name="toll.startDate" label="起始日期" required="true" value="%{getText('global.format.time',{null!=toll.startDate?toll.startDate:''})}"/>
			<s:textfield name="toll.endDate" label="结束日期" required="false" value="%{getText('global.format.time',{null!=toll.endDate?toll.endDate:''})}"/>
			<s:textfield name="toll.setupFee" label="一次性费用(元)" required="false" value="%{getText('global.format.money',{null!=toll.setupFee?toll.setupFee:''})}"/>
			<s:select tooltip="所属运营商"
	            label="所属运营商"
	            list="providers"
	            name="toll.providerId"
	            listKey="id"
	            listValue="providerName"
	            emptyOption="false"/>
            <s:select tooltip="计费类型"
	            label="计费类型"
	            list="billingTypes"
	            name="toll.billingType"
	            listKey="id"
	            listValue="name"
	            emptyOption="false"/>
	        <s:textfield name="toll.monthAmount" label="月数" required="false" />
	        <s:textfield name="toll.periodBasicRate" label="周期性基本费率(元)" required="false" value="%{getText('global.format.money',{null!=toll.periodBasicRate?toll.periodBasicRate:''})}"/>
            <s:textfield name="toll.durationAmount" label="单月封顶时长(秒)" required="false" />
	</s:form>
	<HR>
	<s:div id="add_edit_form_buttonbar">
		<s:a href="#" id="toll_add_action_submit">提交</s:a>
		<s:a href="#" id="toll_add_action_cancel">返回</s:a>
	</s:div>
</div>
</div>
<script type="text/javascript" language="javascript">
	$(function() {
		var billingTypeChanged = function(){
			if($(this).val() == 1 || $(this).val() == 4){
				$("#toll_add_action_toll_monthAmount").attr('readonly', true).attr('value', "-1");
			}else{
				if($("#toll_add_action_toll_monthAmount").attr("value") == -1){
					$("#toll_add_action_toll_monthAmount").attr('readonly', false).attr('value', "");
				}
			}
			
			if($(this).val() == 3){
				$("#label_toll_add_action_toll_durationAmount").text("单月封顶时长(秒)");
				$("#toll_add_action_toll_durationAmount").attr('readonly', false);
			}else if($(this).val() == 4){
				$("#label_toll_add_action_toll_durationAmount").text("时长(秒)");
				$("#toll_add_action_toll_durationAmount").attr('readonly', false);
			}else{
				$("#toll_add_action_toll_durationAmount").attr('readonly', true).attr('value', "");
			}
		};
		billingTypeChanged();
		
		$("input[type='text']").css("width", "150px");
		$("select").css("width", "150px");
		$("#add_edit_accordion").accordion({
			autoHeight: false,
			navigation: true
		});
		$("#toll_add_action_toll_startDate").datepicker({dateFormat:"yy-mm-dd"});
		$("#toll_add_action_toll_endDate").datepicker({dateFormat:"yy-mm-dd"});
		$("#toll_add_action").attr("action", 'toll_<c:out value="${submitType}" default="add" />.action');
		
		<c:choose>
		<c:when test="${submitType == 'edit'}">
		$("#toll_add_action_toll_id").attr('readonly', true);
		</c:when>
		<c:otherwise>
		

		</c:otherwise>
		</c:choose>
		
		$("#toll_add_action_toll_billingType").change(billingTypeChanged);

		$("#toll_add_action_submit").button({icons: {primary: "ui-icon-ok"}});
		$("#toll_add_action_cancel").button({icons: {primary: "ui-icon-cancel"}});
		$("#toll_add_action_submit").click(function() {
			$("#toll_add_action").submit();
		});
		$("#toll_add_action_cancel").click(function() {
			location="<%=request.getContextPath()%>/toll_list.action";
		});
	});
</script>
<%@ include file="/includes/iframe_footer.jsp"%>
