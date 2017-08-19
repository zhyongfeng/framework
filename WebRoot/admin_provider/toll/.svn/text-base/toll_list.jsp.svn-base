<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/includes/iframe_header.jsp"%>
<div id="search_bar">
<div id="search_accordion">
	<h3><a href="#">资费策略查询</a></h3>
	<div style="padding-top:4px; padding-bottom:0;">
	<s:form id="search_form" action='toll_list.action' validate="false" theme="simple">
		<table id="search_form_table">
			<tr>
				<td width="80px" align="right">资费代码：</td>
				<td><s:textfield name="searchCondition.id"/>
				</td>
				<td width="80px" align="right">资费名称：</td>
				<td><s:textfield name="searchCondition.tollName"/>
				</td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td width="80px" align="right">起始日期：</td>
				<td><s:textfield cssClass="datepicker" name="searchCondition.startDate" label="起始日期" required="true" value="%{getText('global.format.date',{null!=searchCondition.startDate?searchCondition.startDate:''})}"/>
				</td>
				<td width="80px" align="right">结束日期：</td>
				<td><s:textfield cssClass="datepicker" name="searchCondition.endDate" label="结束日期" required="false" value="%{getText('global.format.date',{null!=searchCondition.endDate?searchCondition.endDate:''})}"/>
				</td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td width="80px" align="right">所属运营商：</td>
				<td><s:select list="providers"
			            name="searchCondition.providerId"
			            listKey="id"
			            listValue="providerName"
			            emptyOption="true"/>
				</td>
				<td width="80px" align="right">	资费计费类型：</td>
				<td><s:select list="billingTypes"
			            name="searchCondition.billingType"
			            listKey="id"
			            listValue="name"
			            emptyOption="true"/>
				</td>
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
	<h3><a href="#">资费策略列表</a></h3>
	<div>
		<a href="toll_add.action" id="addbutton"
			class="ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-primary"><span
			class="ui-button-icon-primary ui-icon ui-icon-document"></span><span
			class="ui-button-text">添加</span>
		</a>

		<table id="list_talbe">
			<tr class="th_line" align="center">
				<th width="5%">资费代码名</th>
				<th width="15%">资费名称</th>
				<th width="8%">所属运营商</th>
				<th width="8%">描述</th>
				<th width="8%">计费类型</th>
				<th width="8%">起始日期</th>
				<th width="10%">结束日期</th>
				<th width="10%">一次性费用(元)</th>
				<th width="15%">周期性基本费率(元)</th>
				<th width="15%">操作</th>
			</tr>
			<c:forEach var="item" items="${RESULT.content}" varStatus="idx">
				<tr class="tr_line alternative_${idx.index % 2}" align="center">
					<td><c:out value="${item.id}" />
					</td>
					<td><c:out value="${item.tollName}" />
					</td>
					<td><c:out value="${item.providerAsString}" />
					</td>
					<td><c:out value="${item.description}" />
					</td>
					<td><c:out value="${item.billingTypeAsString}" />
					</td>
					<td><fmt:formatDate value="${item.startDate}" type="both" pattern="yyyy-MM-dd hh:mm"/>
					</td>
					<td><fmt:formatDate value="${item.endDate}" type="both" pattern="yyyy-MM-dd hh:mm"/>
					</td>
					<td><fmt:formatNumber value="${item.setupFee}" pattern="####0.00" />
					</td>
					<td><fmt:formatNumber value="${item.periodBasicRate}" pattern="####0.00" />
					</td>
					<td>
						<a name="edit.action" 	href="#toll_edit.action?id=${item.id}" 		id="edit_${item.id}">编辑</a>
						<a name="remove.action" href="#toll_remove.action?id=${item.id}" 	id="remove_${item.id}">删除</a>
						<a name="view.action" 	href="#toll_view.action?id=${item.id}" 		id="view_${item.id}">查看</a>
					</td>
				</tr>
			</c:forEach>
		</table>
<div>
	<!--翻页代码 -->
	<c:import url="/component/pager.jsp" charEncoding="UTF-8">
		 <c:param name="action" value="/toll_list.action"/>
		 <c:param name="formName" value="search_form"/>
	</c:import>
</div>
<div id="dialog" title="删除">
	<p>确实要删除这个资费策略吗？</p>
</div>
</div>
</div>
</div>
<%@ include file="/includes/datepicker_script.jsp"%>
<%@ include file="/includes/list_page_script.jsp"%>
<script type="text/javascript" language="javascript">
	var viewDialogTitle = "资费策略信息";
</script>
<%@ include file="/includes/view_dialog.jsp"%>
<%@ include file="/includes/iframe_footer.jsp"%>