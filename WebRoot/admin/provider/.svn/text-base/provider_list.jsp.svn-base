<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/includes/iframe_header.jsp"%>

<div id="search_bar">
<div id="search_accordion">
	<h3><a href="#">运营商查询</a></h3>
	<div style="padding-top:4px; padding-bottom:0;">
	<s:form id="search_form" action='provider_list.action' validate="false" theme="simple">
		<table id="search_form_table">
			<tr>
				<td width="80px" align="right">编号：</td>
				<td><s:textfield name="searchCondition.id"/></td>
				<td width="80px" align="right">状态：</td>
				<td><s:select list="providerStatuses"
			            name="searchCondition.status"
			            listKey="id"
			            listValue="name"
			            emptyOption="true"/>
				</td>
				<td width="80px" align="right">名称：</td>
				<td><s:textfield name="searchCondition.providerName"/></td>
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
	<h3><a href="#">运营商列表</a></h3>
	<div>
	<a href="provider_add.action" id="addbutton"
		class="ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-primary"><span
		class="ui-button-icon-primary ui-icon ui-icon-document"></span><span
		class="ui-button-text">添加</span>
	</a>
	
	<table id="list_talbe">
		<tr class="th_line" align="center">
			<th width="5%">编号</th>
			<th width="15%">名称</th>
			<th width="8%">类型</th>
			<th width="8%">最大用户数</th>
			<th width="8%">最大网关数</th>
			<th width="8%">状态</th>
			<th width="10%">联系人</th>
			<th width="15%">邮箱</th>
			<th width="10%">电话</th>
			<th width="10%">传真</th>
			<th width="10%">手机</th>
			<th width="15%">创建时间</th>
			<th width="15%">最后更新时间</th>
			<th width="15%">操作</th>
		</tr>
		<c:forEach var="item" items="${RESULT.content}" varStatus="idx">
			<tr class="tr_line alternative_${idx.index % 2}" align="center">
				<td><c:out value="${item.id}" />
				</td>
				<td><c:out value="${item.providerName}" />
				</td>
				<td><c:out value="${item.providerTypeAsString}" />
				</td>
				<td><c:out value="${item.maxUserAsString}" />
				</td>
				<td><c:out value="${item.maxGatewayAsString}" />
				</td>
				<td><c:out value="${item.statusAsString}" />
				</td>
				<td><c:out value="${item.contactName}" />
				</td>
				<td><c:out value="${item.email}" />
				</td>
				<td><c:out value="${item.phone}" />
				</td>
				<td><c:out value="${item.fax}" />
				</td>
				<td><c:out value="${item.mobile}" />
				</td>
				<td><fmt:formatDate value="${item.createTime}" type="both" pattern="yyyy-MM-dd hh:mm"/></td>
				<td><fmt:formatDate value="${item.lastUpdateTime}" type="both" pattern="yyyy-MM-dd hh:mm"/>
				</td>
				<td>
						<a name="edit.action" 	href="#provider_edit.action?id=${item.id}" 		id="edit_${item.id}">编辑</a>
						<a name="remove.action" href="#provider_remove.action?id=${item.id}" 	id="remove_${item.id}">删除</a>
						<a name="view.action" 	href="#provider_view.action?id=${item.id}" 		id="view_${item.id}">查看</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<div>
		<!--翻页代码 -->
		<c:import url="/component/pager.jsp" charEncoding="UTF-8">
			 <c:param name="action" value="/provider_list.action"/>
			 <c:param name="formName" value="search_form"/>
		</c:import>
	</div>
	<div id="dialog" title="删除">
		<p>确实要删除这个运营商吗？</p>
	</div>
	</div>
</div>
</div>
<%@ include file="/includes/list_page_script.jsp"%>
<script type="text/javascript" language="javascript">
	var viewDialogTitle = "运营商信息";
</script>
<%@ include file="/includes/view_dialog.jsp"%>
<%@ include file="/includes/iframe_footer.jsp"%>