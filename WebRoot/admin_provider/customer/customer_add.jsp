<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<%@ include file="/includes/iframe_header.jsp"%>

<script language="JavaScript">
	function validateNO()
	{   
		var customerNO=$("#customer_add_action_customer_id").val();
	}
</script>
<div id="add_edit_accordion">
	<c:choose>
	<c:when test="${submitType == 'edit'}">
		<h3><a href="#">编辑用户</a></h3>
	</c:when>
	<c:otherwise>
		<h3><a href="#">添加用户</a></h3>
	</c:otherwise>
	</c:choose>
	
	<div style="padding-top:4px; padding-bottom:0;">
			<s:form id="customer_add_action" action='customer_add.action' validate="true" labelposition="top" requiredposition="right" theme="fengfan">
			<c:if test="${not empty customer.id}">
				<input type="hidden" name="id" value="${customer.id}" />
			</c:if>
			<s:textfield name="customer.id" label="登录名" onblur="validateNO();" required="true"/>
			<c:choose>
				<c:when test="${submitType == 'edit'}">
				</c:when>
				<c:otherwise>
					<s:password name="customer.password" label="密码" maxlength="20" required="true"/>
					<s:password name="customer.password2" label="确认密码" maxlength="20"/>
				</c:otherwise>
			</c:choose>
			
			<s:select tooltip="所属运营商"
	            label="所属运营商"
	            list="providers"
	            name="customer.providerId"
	            listKey="id"
	            listValue="providerName"
	            emptyOption="false"/>
	        <s:textfield name="customer.dueDate" label="到期日期" value="%{getText('global.format.time',{null!=customer.dueDate?customer.dueDate:''})}"/>
	        <s:select tooltip="状态"
	            label="状态"
	            list="customerStatuses"
	            name="customer.status"
	            listKey="id"
	            listValue="name"
	            emptyOption="false"/>
	        <s:textfield name="customer.maxOnlineNum" label="最大同时在线用户数" readonly="false"/>
            <s:select tooltip="绑定类型"
	            label="绑定类型"
	            list="bindingTypes"
	            name="customer.bindingType"
	            listKey="id"
	            listValue="name"
	            emptyOption="false"/>
            <s:textfield name="customer.bindingMac" label="绑定的MAC地址" />
            <s:select tooltip="漫游标识"
	            label="漫游标识"
	            list="roamingFlags"
	            name="customer.roamingFlag"
	            listKey="id"
	            listValue="name"
	            emptyOption="false"/>
            <s:select tooltip="计费类型"
	            label="计费类型"
	            list="billingTypes"
	            name="customer.billingType"
	            listKey="id"
	            listValue="name"
	            emptyOption="false"/>
            <s:select tooltip="选择用户所属组"
	            label="用户所属组"
	            list="custGroups"
	            name="customer.groupId"
	            listKey="id"
	            listValue="id"
	            emptyOption="false"/>
			<s:select tooltip="用户类型"
	            label="用户类型"
	            list="customerTypes"
	            name="customer.custType"
	            listKey="id"
	            listValue="name"
	            emptyOption="false"/>
	        <s:textfield name="customer.name" label="姓名" />
            <s:radio list="genders" listKey="id" listValue="name" name="customer.gender" label="性别" />
            <s:textfield name="customer.address" label="地址" />
			<s:textfield name="customer.country" label="国家" />
			<s:textfield name="customer.state" label="省" />
			<s:textfield name="customer.city" label="市" />
			<s:textfield name="customer.zip" label="邮编" />
			<s:textfield name="customer.telephone" label="电话" />
			<s:textfield name="customer.fax" label="传真" />
			<s:textfield name="customer.email" label="电子邮箱" />
			<s:textfield name="customer.mobile" label="手机" />
			<s:textfield name="customer.passportType" label="证件类型" />
			<s:textfield name="customer.passportNum" label="证件号码" />
			<s:textfield name="customer.allowedDueDate" label="允许欠费最大天数"/>
			<s:textfield name="customer.cycleCode" label="周期编号" />
			<s:textarea name="customer.description" label="注释" cols="60" rows="3"/>
</s:form>
<HR>
<s:div id="add_edit_form_buttonbar">
	<s:a href="#" id="customer_add_action_submit">提交</s:a>
	<s:a href="#" id="customer_add_action_cancel">返回</s:a>
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
		$("#customer_add_action_customer_dueDate").datepicker({dateFormat:"yy-mm-dd"});
		$("#customer_add_action").attr("action", 'customer_<c:out value="${submitType}" default="add" />.action');
		
		<c:choose>
		<c:when test="${submitType == 'edit'}">
			$("#customer_add_action_customer_id").attr('readonly', true);
		</c:when>
		<c:otherwise>
			$('input[name="customer.gender"]').get(0).checked = true;
		</c:otherwise>
		</c:choose>
		
		<c:choose>
		<c:when test="${adminRole}">
			
			
		</c:when>
		<c:otherwise>
			$("#customer_add_action_customer_maxOnlineNum").attr('readonly', true);
			$("#customer_add_action_customer_allowedDueDate").attr('readonly', true);
		</c:otherwise>
		</c:choose>

		$("#customer_add_action_submit").button({icons: {primary: "ui-icon-ok"}});
		$("#customer_add_action_cancel").button({icons: {primary: "ui-icon-cancel"}});
		$("#customer_add_action_submit").click(function() {
			$("#customer_add_action").submit();
		});
		$("#customer_add_action_cancel").click(function() {
			location="<%=request.getContextPath()%>/customer_list.action";
		});
	});
</script>
<%@ include file="/includes/iframe_footer.jsp"%>
