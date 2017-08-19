<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/includes/iframe_header.jsp"%>
<div id="search_bar">
<div id="search_accordion">
	<h3><a href="#">用户组查询</a></h3>
	<s:form id="search_form" action='custGroup_list.action' validate="false" theme="simple">
	</s:form>
</div>


<div id="list_accordion">
	<h3><a href="#">用户组列表</a></h3>
	<div>
		<a href="custGroup_add.action" id="addbutton"
			class="ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-primary"><span
			class="ui-button-icon-primary ui-icon ui-icon-document"></span><span
			class="ui-button-text">添加</span>
		</a>



	<table id="list_talbe">
	<tr class="th_line" align="center">
		<th width="15%">组类型编号</th>
		<th width="20%">描述</th>
		<th width="25%">操作</th>
	</tr>
	<c:forEach var="item" items="${RESULT.content}" varStatus="idx">
		<tr class="tr_line alternative_${idx.index % 2}" align="center">
			<td><c:out value="${item.id}" />
			</td>
			<td><c:out value="${item.description}" />
			</td>
			<td>
				<a name="edit.action" 	href="#custGroup_edit.action?id=${item.id}" 	id="edit_${item.id}">编辑</a>
				<a name="remove.action" href="#custGroup_remove.action?id=${item.id}" 	id="remove_${item.id}">删除</a>
				<a name="view.action" 	href="#custGroup_view.action?id=${item.id}" 	id="view_${item.id}">查看</a>
			</td>
		</tr>
	</c:forEach>
	</table>
<div>
	<!--翻页代码 -->
	<c:import url="/component/pager.jsp" charEncoding="UTF-8">
		 <c:param name="action" value="/custGroup_list.action"/>
		 <c:param name="formName" value="search_form"/>
	</c:import>
</div>
<div id="dialog" title="删除">
	<p>确实要删除这个用户组吗？</p>
</div>
</div>
</div>
</div>

<%@ include file="/includes/list_page_script.jsp"%>
<script type="text/javascript" language="javascript">
	var viewDialogTitle = "用户组信息";
</script>
<%@ include file="/includes/view_dialog.jsp"%>
<%@ include file="/includes/iframe_footer.jsp"%>