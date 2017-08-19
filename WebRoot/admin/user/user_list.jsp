<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/includes/iframe_header.jsp"%>

<div id="search_bar">
<div id="search_accordion">
	<h3><a href="#">系统用户查询</a></h3>
	<div style="padding-top:4px; padding-bottom:0;">
	<s:form id="search_form" action='user_list.action' validate="false" theme="simple">
		<table id="search_form_table">
			<tr>
				<td width="80px" align="right">登录名：</td>
				<td><s:textfield name="searchCondition.userName"/>
				</td>
				<td width="80px" align="right">所属运营商：</td>
				<td><s:select list="providers"
			            name="searchCondition.providerId"
			            listKey="id"
			            listValue="providerName"
			            emptyOption="true"/>
				</td>
				<td width="80px" align="right">状态：</td>
				<td><s:select list="userStatuses"
			            name="searchCondition.status"
			            listKey="id"
			            listValue="name"
			            emptyOption="true"/></td>
				<td></td>
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
	<h3><a href="#">系统用户列表</a></h3>
	<div>
	<a href="user_add.action" id="addbutton"
		class="ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-primary"><span
		class="ui-button-icon-primary ui-icon ui-icon-document"></span><span
		class="ui-button-text">添加</span>
	</a>
	
	<table id="list_talbe">
		<tr class="th_line" align="center">
			<th width="5%">用户名</th>
			<th width="8%">运营商</th>
			<th width="8%">是否可用</th>
			<th width="8%">邮箱</th>
			<th width="8%">备注</th>
			<th width="15%">操作</th>
		</tr>
		<c:forEach var="item" items="${RESULT.content}" varStatus="idx">
			<tr class="tr_line alternative_${idx.index % 2}" align="center">
				<td><c:out value="${item.username}" />
				</td>
				<td><c:out value="${item.providerAsString}" />
				</td>
				<td><c:out value="${item.enabledAsString}" />
				</td>
				<td><c:out value="${item.email}" />
				</td>
				<td><c:out value="${item.description}" />
				</td>
				<td>
						<a name="edit.action" 	href="#user_edit.action?id=${item.username}" 	id="edit_${item.username}">编辑</a>
						<a name="remove.action" href="#user_remove.action?id=${item.username}" 	id="remove_${item.username}">删除</a>
						<a name="view.action" 	href="#user_view.action?id=${item.username}" 	id="view_${item.username}">查看</a>
					
				</td>
			</tr>
		</c:forEach>
	</table>
	<div>
		<!--翻页代码 -->
		<c:import url="/component/pager.jsp" charEncoding="UTF-8">
			 <c:param name="action" value="/user_list.action"/>
			 <c:param name="formName" value="search_form"/>
		</c:import>
	</div>
	<div id="dialog" title="删除">
		<p>确实要删除这个系统用户吗？</p>
	</div>
	</div>
</div>
</div>
<%@ include file="/includes/list_page_script.jsp"%>
<script type="text/javascript" language="javascript">
	var viewDialogTitle = "系统用户信息";
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
					$("#view_dialog").attr("resetPassword_button", $(this).attr("id").replace("view", "resetPassword"));
					
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
				"编辑": function() {
					$("#" + $("#view_dialog").attr("edit_button")).click();
					$( this ).dialog( "close" );
				},
				"重置密码": function() {
					var entityId = $("#" + $("#view_dialog").attr("edit_button")).attr("id").substring(5);
					location = "user_resetPassword.action?id=" + entityId;
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