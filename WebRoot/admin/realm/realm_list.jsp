<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/includes/iframe_header.jsp"%>
<div id="search_bar">
<div id="search_accordion">
	<h3><a href="#">漫游域查询</a></h3>
	<s:form id="search_form" action='realm_list.action' validate="false" theme="simple">
	</s:form>
</div>


<div id="list_accordion">
	<h3><a href="#">漫游域列表</a></h3>
	<div>
		<a href="realm_add.action" id="addbutton"
			class="ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-primary"><span
			class="ui-button-icon-primary ui-icon ui-icon-document"></span><span
			class="ui-button-text">添加</span>
		</a>
		<table id="list_talbe">
			<tr class="th_line" align="center">
				<th width="10%">漫游域名</th>
				<th width="15%">漫游运营商名称</th>
				<th width="10%">IP地址</th>
				<th width="10%">认证端口</th>
				<th width="10%">计费端口</th>
				<th width="15%">转发时是否剔除后面的域名</th>
				<th width="10%">超级域名</th>
				<th width="15%">操作</th>
			</tr>
			<c:forEach var="item" items="${RESULT.content}" varStatus="idx">
				<tr class="tr_line alternative_${idx.index % 2}" align="center">
					<td><c:out value="${item.realmName}" />
					</td>
					<td><c:out value="${item.operName}" />
					</td>
					<td><c:out value="${item.ipAddr}" />
					</td>
					<td><c:out value="${item.authPort}" />
					</td>
					<td><c:out value="${item.acctPort}" />
					</td>
					<td><c:out value="${item.noStripAsString}" />
					</td>
					<td><c:out value="${item.isSuperRealmAsString}" />
					</td>
					<td>
						<a name="edit.action" 	href="#realm_edit.action?id=${item.id}" 	id="edit_${item.id}">编辑</a>
						<a name="remove.action" href="#realm_remove.action?id=${item.id}" 	id="remove_${item.id}">删除</a>
						<a name="view.action" 	href="#realm_view.action?id=${item.id}" 	id="view_${item.id}">查看</a>
					</td>
				</tr>
			</c:forEach>
		</table>
<div>
	<!--翻页代码 -->
	<c:import url="/component/pager.jsp" charEncoding="UTF-8">
		 <c:param name="action" value="/realm_list.action"/>
		 <c:param name="formName" value="search_form"/>
	</c:import>
</div>
<div id="dialog" title="删除">
	<p>确实要删除这个漫游域吗？</p>
</div>
</div>
</div>
</div>


<%@ include file="/includes/list_page_script.jsp"%>
<script type="text/javascript" language="javascript">
	var viewDialogTitle = "漫游域信息";
</script>
<%@ include file="/includes/view_dialog.jsp"%>
<%@ include file="/includes/iframe_footer.jsp"%>