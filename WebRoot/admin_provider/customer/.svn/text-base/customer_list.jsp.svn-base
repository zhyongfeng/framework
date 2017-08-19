<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/includes/iframe_header.jsp"%>
<div id="search_bar">
<div id="search_accordion">
	<h3><a href="#">用户查询</a></h3>
	<div style="padding-top:4px; padding-bottom:0;">
	<s:form id="search_form" action='customer_list.action' validate="false" theme="simple">
		<table id="search_form_table">
			<tr>
				<td width="80px" align="right">登录名：</td>
				<td><s:textfield name="searchCondition.loginName"/>
				</td>
				<td width="80px" align="right">所属运营商：</td>
				<td>
					<c:choose>
						<c:when test="${adminRole}">
							<s:select list="providers"
					            name="searchCondition.providerId"
					            listKey="id"
					            listValue="providerName"
					            emptyOption="true"/>
						</c:when>
						<c:otherwise>
							<s:select list="providers"
					            name="searchCondition.providerId"
					            listKey="id"
					            listValue="providerName"/>
						</c:otherwise>
					</c:choose>
				</td>
				<td width="80px" align="right">状态：</td>
				<td><s:select list="customerStatuses"
			            name="searchCondition.status"
			            listKey="id"
			            listValue="name"
			            emptyOption="true"/></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td width="80px" align="right">到期日期：</td>
				<td><s:textfield name="searchCondition.dueDate" cssClass="datepicker" value="%{getText('global.format.date',{null!=searchCondition.dueDate?searchCondition.dueDate:''})}"/>
				</td>
				<td width="80px" align="right">卡批次号：</td>
				<td><s:select list="lots"
			            name="searchCondition.lotId"
			            listKey="id"
			            listValue="description"
			            emptyOption="true"/>
				</td>
				<td width="80px" align="right">计费类型：</td>
				<td><s:select list="billingTypes"
			            name="searchCondition.billingType"
			            listKey="id"
			            listValue="name"
			            emptyOption="true"/></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td width="80px" align="right">用户所属组：</td>
				<td><s:select list="custGroups"
			            name="searchCondition.groupId"
			            listKey="id"
			            listValue="id"
			            emptyOption="true"/>
				</td>
				<td width="80px" align="right">	剩余时长(秒)：</td>
				<td><s:textfield name="searchCondition.availableDuration"/>
				</td>
				<td width="80px" align="right">姓名：</td>
				<td><s:textfield name="searchCondition.name"/></td>
				<td width="10px" align="right">
					<input id="search_sumbit" type='submit' value='查询' />
				</td>
				<td width="10px">
					<input id="search_reset" type='reset' value='重置' />
				</td>
			</tr>
		</table>
	</s:form>
</div>
</div>

<div id="list_accordion">
	<h3><a href="#">用户列表</a></h3>
	<div>
		<a href="customer_add.action" id="addbutton"
			class="ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-primary"><span
			class="ui-button-icon-primary ui-icon ui-icon-document"></span><span
			class="ui-button-text">添加</span>
		</a>
	<table id="list_talbe">
		<tr class="th_line" align="center">
			<th width="5%">登录名</th>
			<th width="15%">姓名</th>
			<th width="8%">所属运营商</th>
			<th width="8%">状态</th>
			<th width="8%">计费类型</th>
			<th width="8%">到期日期</th>
			<th width="10%">剩余时长</th>
			<th width="10%">用户所属组</th>
			<th width="100">操作</th>
		</tr>
		<c:forEach var="item" items="${RESULT.content}" varStatus="idx">
			<tr class="tr_line alternative_${idx.index % 2}" align="center">
				<td><c:out value="${item.loginName}" />
				</td>
				<td><c:out value="${item.name}" />
				</td>
				<td><c:out value="${item.providerAsString}" />
				</td>
				<td><c:out value="${item.statusAsString}" />
				</td>
				<td><c:out value="${item.billingTypeAsString}" />
				</td>
				<td><fmt:formatDate value="${item.dueDate}" type="both" pattern="yyyy-MM-dd HH:mm"/>
				</td>
				<td><c:out value="${item.availableDuration}" />
				</td>
				<td><c:out value="${item.groupId}" />
				</td>
				<td>
					<a name="edit.action" 			href="#customer_edit.action?id=${item.id}" 			id="edit_${item.id}">编辑</a>
					<a name="view.action" 			href="#customer_view.action?id=${item.id}" 			id="view_${item.id}">查看</a>
					<a name="payRecord_add.action" 		href="#payRecord_add.action?customerId=${item.id}" 		id="view_${item.id}">缴费</a>
				</td>
			</tr>
		</c:forEach>
	</table>
<div>
	<!--翻页代码 -->
	<c:import url="/component/pager.jsp" charEncoding="UTF-8">
		 <c:param name="action" value="/customer_list.action"/>
		 <c:param name="formName" value="search_form"/>
	</c:import>
</div>
<div id="dialog" title="删除">
	<p>确实要删除这个用户吗？</p>
</div>
</div>
</div>
</div>

<%@ include file="/includes/datepicker_script.jsp"%>
<%@ include file="/includes/list_page_script.jsp"%>

<script type="text/javascript" language="javascript">
	jQuery(document).ready(function(){
		$("[name='payRecord_add.action']").button({
			icons : {
				primary : "ui-icon-calculator"
			},
			text: false
		}).click(
				function() {
					location = $(this).attr("href").substring(1);
				});
	});
</script>


<script type="text/javascript" language="javascript">
	var viewDialogTitle = "用户信息";
</script>

<div id="view_dialog">
	<div id="view_content">
		<div class="loading"></div>
	</div>
</div>
<script>
	$(function() {
		$("[name='view.action']").button({
			icons : {
				primary : "ui-icon-zoomin"
			},
			text: false
		}).click(
				function() {
					//$("#view_dialog_frame").attr("width", $( "#view_dialog" ).attr("width"));
					//$("#view_dialog_frame").attr("height", $( "#view_dialog" ).attr("height"));
					$("#view_dialog").dialog( "open" );
					var url = $(this).attr("href").substring(1);
					//$("#view_dialog_frame").attr("src", $(this).attr("href").substring(1));
					$("#view_dialog").attr("edit_button", $(this).attr("id").replace("view", "edit"));
					$.ajax({
						type:"get",
						url:url,
						beforeSend: function(XMLHttpRequest){
							$("#view_content").html("<div class=\"loading\"></div>");
						},
						success: function(data, textStatus){
							$("#view_content").html(data);	
						},
						complete:function(XMLHttpRequest, textStatus){
							
						},
						error: function(){
							
						}
					});
				});
		
		$("#view_dialog").dialog({
			autoOpen: false,
			width: 600,
			height: 500,
			modal: true,
			title: viewDialogTitle,
			buttons: {
				"停机": function() {
					var entityId = $("#" + $("#view_dialog").attr("edit_button")).attr("id").substring(5);
					location = "customer_down.action?id=" + entityId;
					$( this ).dialog( "close" );
				},
				"复机": function() {
					var entityId = $("#" + $("#view_dialog").attr("edit_button")).attr("id").substring(5);
					location = "customer_up.action?id=" + entityId;
					$( this ).dialog( "close" );
				},
				"销户": function() {
					var entityId = $("#" + $("#view_dialog").attr("edit_button")).attr("id").substring(5);
					location = "customer_cancel.action?id=" + entityId;
					$( this ).dialog( "close" );
				},
				"修改密码": function() {
					var entityId = $("#" + $("#view_dialog").attr("edit_button")).attr("id").substring(5);
					location = "customer_changePassword.action?id=" + entityId;
					$( this ).dialog( "close" );
				},
				"个人话单": function() {
					var entityId = $("#" + $("#view_dialog").attr("edit_button")).attr("id").substring(5);
					location = "udr_list.action?searchCondition.custName=" + entityId;
					$( this ).dialog( "close" );
				},
				"续费": function() {
					var entityId = $("#" + $("#view_dialog").attr("edit_button")).attr("id").substring(5);
					location = "payRecord_list.action?searchCondition.custId=" + entityId;
					$( this ).dialog( "close" );
				},
				"编辑": function() {
					$("#" + $("#view_dialog").attr("edit_button")).click();
					$( this ).dialog( "close" );
				},
				Cancel: function() {
					$( this ).dialog( "close" );
				}
			}
		});
	});
</script>

<%@ include file="/includes/iframe_footer.jsp"%>