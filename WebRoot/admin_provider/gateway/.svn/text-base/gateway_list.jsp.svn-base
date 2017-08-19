<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/includes/iframe_header.jsp"%>
<div id="search_bar">
<div id="search_accordion">
	<h3><a href="#">网关设备查询</a></h3>
	<div style="padding-top:4px; padding-bottom:0;">
	<s:form id="search_form" action='gateway_list.action' validate="false" theme="simple">
		<table id="search_form_table">
			<tr>
				<td width="80px" align="right">编号：</td>
				<td><s:textfield name="searchCondition.id"/></td>
				<td width="80px" align="right">运营商：</td>
				<td><s:select list="providers"
		            name="searchCondition.providerId"
		            listKey="id"
		            listValue="providerName"
		            emptyOption="true"/></td>
				<td width="80px" align="right">名称：</td>
				<td><s:textfield name="searchCondition.gatewayName"/></td>
				<td width="10px" align="right">
				</td>
				<td width="10px">
				</td>
			</tr>
			<tr>
				<td width="10px" align="right">状态:</td>
				<td width="10px"><s:select list="gatewayStatuses"
		            name="searchCondition.status"
		            listKey="id"
		            listValue="name"
		            emptyOption="true"/></td>
				<td width="80px" align="right">是否允许漫游：</td>
				<td><s:select list="useTypes"
		            name="searchCondition.proxyEnabled"
		            listKey="id"
		            listValue="name"
		            emptyOption="true"/></td>
				<td width="80px" align="right">是否公用：</td>
				<td><s:select list="useTypes"
		            name="searchCondition.isPublic"
		            listKey="id"
		            listValue="name"
		            emptyOption="true"/></td>
				<td width="10px" align="right">
				</td>
				<td width="10px">
				</td>
			</tr>
			<tr>
				<td width="80px" align="right">网关类型：</td>
				<td><s:select list="gatewayTypes"
		            name="searchCondition.gatewayTypeId"
		            listKey="id"
		            listValue="id"
		            emptyOption="true"/></td>
				<td width="80px" align="right">设备详细地址：</td>
				<td><s:textfield name="searchCondition.location"/></td>
				<td width="80px" align="right"></td>
				<td></td>
				<td width="80px" align="right"></td>
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
	<h3><a href="#">网关设备列表</a></h3>
	<div>
		<a href="gateway_add.action" id="addbutton"
			class="ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-primary"><span
			class="ui-button-icon-primary ui-icon ui-icon-document"></span><span
			class="ui-button-text">添加</span>
		</a>

		<table id="list_talbe">
			<tr class="th_line" align="center">
				<th width="15%">网关设备编号</th>
				<th width="20%">域名</th>
				<th width="20%">IP地址</th>
				<th width="20%">通讯密码</th>
				<th width="20%">所属运营商</th>
				<th width="20%">名称</th>
				<th width="20%">状态</th>
				<th width="20%">是否允许漫游</th>
				<th width="20%">公用</th>
				<th width="20%">网关类型</th>
				<th width="20%">详细地址</th>
				<th width="20%">经纬度</th>
				<th width="20%">Portal URL</th>
				<th width="20%">上行带宽</th>
				<th width="20%">下行带宽</th>
				<th width="25%">操作</th>
			</tr>
			<c:forEach var="item" items="${RESULT.content}" varStatus="idx">
				<tr class="tr_line alternative_${idx.index % 2}" align="center">
					<td><c:out value="${item.id}" />
					</td>
					<td><c:out value="${item.domain}" />
					</td>
					<td><c:out value="${item.ipAddr}" />
					</td>
					<td><c:out value="${item.secretKey}" />
					</td>
					<td><c:out value="${item.providerAsString}" />
					</td>
					<td><c:out value="${item.gatewayName}" />
					</td>
					<td><c:out value="${item.statusAsString}" />
					</td>
					<td><c:out value="${item.proxyEnabledAsString}" />
					</td>
					<td><c:out value="${item.isPublicAsString}" />
					</td>
					<td><c:out value="${item.gatewayTypeAsString}" />
					</td>
					<td><c:out value="${item.location}" />
					</td>
					<td><c:out value="${item.coordinateAsString}" />
					</td>
					<td><c:out value="${item.portalUrl}" />
					</td>
					<td><c:out value="${item.inBandwidth}" />
					</td>
					<td><c:out value="${item.outBandwidth}" />
					</td>
					<td><a name="edit.action" 	href="#gateway_edit.action?id=${item.id}" 	id="edit_${item.id}">编辑</a>
						<a name="remove.action" href="#gateway_remove.action?id=${item.id}" id="remove_${item.id}">删除</a>
						<a name="view.action" 	href="#gateway_view.action?id=${item.id}" 	id="view_${item.id}">查看</a>
					</td>
				</tr>
			</c:forEach>
		</table>
		<div>
			<!--翻页代码 -->
			<c:import url="/component/pager.jsp" charEncoding="UTF-8">
				 <c:param name="action" value="/gateway_list.action"/>
				 <c:param name="formName" value="search_form"/>
			</c:import>
		</div>
		<div id="dialog" title="删除">
			<p>确实要删除这个网关设备吗？</p>
		</div>
</div>
</div>
</div>

<%@ include file="/includes/list_page_script.jsp"%>
<script type="text/javascript" language="javascript">
	var viewDialogTitle = "网关设备信息";
</script>
<%@ include file="/includes/view_dialog.jsp"%>
<%@ include file="/includes/iframe_footer.jsp"%>