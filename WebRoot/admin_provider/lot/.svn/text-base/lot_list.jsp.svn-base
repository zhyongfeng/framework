<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/includes/iframe_header.jsp"%>
<div id="search_bar">
<div id="search_accordion">
	<h3><a href="#">批量卡</a></h3>
	<s:form id="search_form" action='lot_list.action' validate="false" theme="simple">
	</s:form>
</div>

<div id="list_accordion">
	<h3><a href="#">批量卡列表</a></h3>
	<div>
		<a href="lot_add.action" id="addbutton"
			class="ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-primary"><span
			class="ui-button-icon-primary ui-icon ui-icon-document"></span><span
			class="ui-button-text">添加</span>
		</a>


		<table id="list_talbe">
			<tr class="th_line" align="center">
				<th width="5%">批次号</th>
				<th width="10%">所属运营商</th>
				<th width="8%">面值(元)</th>
				<th width="8%">数量</th>
				<th width="8%">上网时长(秒)</th>
				<th width="10%">制卡日期</th>
				<th width="11%">失效日期</th>
				<th width="10%">有效天数</th>
				<th width="15%">注释</th>
				<th width="15%">操作</th>
			</tr>
			<c:forEach var="item" items="${RESULT.content}" varStatus="idx">
				<tr class="tr_line alternative_${idx.index % 2}" align="center">
					<td><c:out value="${item.id}" />
					</td>
					<td><c:out value="${item.providerAsString}" />
					</td>
					<td><c:out value="${item.value}" />
					</td>
					<td><c:out value="${item.amount}" />
					</td>
					<td><c:out value="${item.duration}" />
					</td>
					<td><fmt:formatDate value="${item.issueDate}" type="both" pattern="yyyy-MM-dd hh:mm"/>
					</td>
					<td><fmt:formatDate value="${item.expDate}" type="both" pattern="yyyy-MM-dd hh:mm" />
					</td>
					<td><c:out value="${item.activeDays}" />
					</td>
					<td><c:out value="${item.description}" />
					</td>
					<td>
						<a name="view.action" 	href="#lot_view.action?id=${item.id}" 	id="view_${item.id}">查看</a>
					</td>
				</tr>
			</c:forEach>
		</table>
		<div>
			<!--翻页代码 -->
			<c:import url="/component/pager.jsp" charEncoding="UTF-8">
				 <c:param name="action" value="/lot_list.action"/>
				 <c:param name="formName" value="search_form"/>
			</c:import>
		</div>
		
		<div id="dialog" title="删除">
			<p>确实要删除这个批量卡吗？</p>
		</div>
</div>
</div>
</div>


<%@ include file="/includes/list_page_script.jsp"%>
<script type="text/javascript" language="javascript">
	var viewDialogTitle = "批量卡信息";
</script>
<%@ include file="/includes/view_dialog.jsp"%>
<%@ include file="/includes/iframe_footer.jsp"%>