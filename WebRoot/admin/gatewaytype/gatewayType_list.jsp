<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/includes/iframe_header.jsp"%>
<div id="search_bar">
<div id="search_accordion">
	<h3><a href="#">网关设备类型查询</a></h3>
	<div style="padding-top:4px; padding-bottom:0;">
	<form name="search_form" action="gatewayType_list.action" method="post">
		<table id="search_form_table">
			<tr>
				<td width="80px" align="right">设备厂商：</td>
				<td><input type="text" name="searchCondition.manufactory"
					value="<c:out value="${searchCondition.manufactory}"/>">
				</td>
				<td width="10px" align="right">
					<input id="search_sumbit" type='submit' value='查询' />
				</td>
				<td width="10px">
					<input id="search_reset" type='reset' value='重置' />
				</td>
			</tr>
		</table>
	</form>
</div>
</div>

<div id="list_accordion">
	<h3><a href="#">网关设备类型列表</a></h3>
	<div>
		<a href="gatewayType_add.action" id="addbutton"
			class="ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-primary"><span
			class="ui-button-icon-primary ui-icon ui-icon-document"></span><span
			class="ui-button-text">添加</span>
		</a>
		
		<table id="list_talbe">
			<tr class="th_line" align="center">
				<th width="15%">类型代码</th>
				<th width="20%">设备厂商</th>
				<th width="20%">设备型号</th>
				<th width="20%">配置描述</th>
				<th width="25%">操作</th>
			</tr>
			<c:forEach var="item" items="${RESULT.content}" varStatus="idx">
				<tr class="tr_line alternative_${idx.index % 2}" align="center">
					<td><c:out value="${item.id}" />
					</td>
					<td><c:out value="${item.manufactory}" />
					</td>
					<td><c:out value="${item.model}" />
					</td>
					<td><c:out value="${item.description}" />
					</td>
					<td>
						<a name="edit.action" 	href="#gatewayType_edit.action?id=${item.id}" 	id="edit_${item.id}">编辑</a>
						<a name="remove.action" href="#gatewayType_remove.action?id=${item.id}" id="remove_${item.id}">删除</a>
						<a name="view.action" 	href="#gatewayType_view.action?id=${item.id}" 	id="view_${item.id}">查看</a>
					</td>
				</tr>
			</c:forEach>
		</table>
		<div>
			<!--翻页代码 -->
			<c:import url="/component/pager.jsp" charEncoding="UTF-8">
				 <c:param name="action" value="/gatewayType_list.action"/>
				 <c:param name="formName" value="search_form"/>
			</c:import>
		</div>
		<div id="dialog" title="删除">
			<p>确实要删除这个网关设备类型吗？</p>
		</div>
</div>
</div>
</div>


<%@ include file="/includes/list_page_script.jsp"%>
<script type="text/javascript" language="javascript">
	var viewDialogTitle = "网关设备类型信息";
</script>
<%@ include file="/includes/view_dialog.jsp"%>
<%@ include file="/includes/iframe_footer.jsp"%>