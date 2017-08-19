<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="/includes/iframe_header.jsp"%>
<div id="search_bar">
<div id="search_accordion">
	<h3><a href="#">结算查询</a></h3>
	<div style="padding-top:4px; padding-bottom:0;">
	<s:form id="search_form" action='settleRecord_list.action' validate="false" theme="simple">
		<table id="search_form_table">
			<tr>
				<td width="160px" align="right">运营商：</td>
				<td colspan="3"><s:select list="providers"
			            name="searchCondition.providerId"
			            listKey="id"
			            listValue="providerName"
			            emptyOption="true"/>
				</td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td width="80px" align="right">起始时间：</td>
				<td><s:textfield cssClass="datetimepicker" name="searchCondition.startDate" label="起始日期" required="true" value="%{getText('global.format.time',{null!=searchCondition.startDate?searchCondition.startDate:''})}"/>
				</td>
				<td width="80px" align="right">结束时间：</td>
				<td><s:textfield cssClass="datetimepicker" name="searchCondition.endDate" label="结束日期" required="false" value="%{getText('global.format.time',{null!=searchCondition.endDate?searchCondition.endDate:''})}"/>
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
	<h3><a href="#">结算列表</a></h3>
	<div>
		<a href="settleRecord_add.action" id="addbutton"
			class="ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-primary"><span
			class="ui-button-icon-primary ui-icon ui-icon-document"></span><span
			class="ui-button-text">添加</span>
		</a>

		<table id="list_talbe">
			<tr class="th_line" align="center">
				<th width="5%">编号</th>
				<th width="15%">所属运营商</th>
				<th width="8%">开始时间</th>
				<th width="8%">截止时间</th>
				<th width="8%">总金额(元)</th>
				<th width="8%">市场推广费(元)</th>
				<th width="10%">收费管理费(元)</th>
				<th width="15%">实收费用(元)</th>
				<th width="15%">缴费方式</th>
				<th width="15%">是否已开发票</th>
				<th width="15%">发票抬头</th>
				<th width="15%">注释</th>
				<th width="15%">收费操作员</th>
				<th width="15%">操作</th>
				
			</tr>
			<c:forEach var="item" items="${RESULT.content}" varStatus="idx">
				<tr class="tr_line alternative_${idx.index % 2}" align="center">
					<td><c:out value="${item.id}" />
					</td>
					<td><c:out value="${item.providerAsString}" />
					</td>
					<td><fmt:formatDate value="${item.startDate}" type="both" pattern="yyyy-MM-dd HH:mm"/>
					</td>
					<td><fmt:formatDate value="${item.endDate}" type="both" pattern="yyyy-MM-dd HH:mm"/>
					</td>
					<td><fmt:formatNumber value="${item.totalFee}" pattern="####0.00" />
					</td>
					<td><fmt:formatNumber value="${item.marketFee}"  pattern="####0.00" />
					</td>
					<td><fmt:formatNumber value="${item.mgtFee}"  pattern="####0.00" />
					</td>
					<td><fmt:formatNumber value="${item.actualFee}"  pattern="####0.00" />
					</td>
					<td><c:out value="${item.payTypeAsString}" />
					</td>
					<td><c:out value="${item.isInvoiced}" />
					</td>
					<td><c:out value="${item.invoiceName}" />
					</td>
					<td><c:out value="${item.remark}" />
					</td>
					<td><c:out value="${item.execUser}" />
					</td>
					<td>
						<a name="edit.action" 	href="#settleRecord_edit.action?id=${item.id}" 		id="edit_${item.id}">结算</a>
					</td>
				</tr>
			</c:forEach>
		</table>
		<div>
			<!--翻页代码 -->
			<c:import url="/component/pager.jsp" charEncoding="UTF-8">
				 <c:param name="action" value="/settleRecord_list.action"/>
				 <c:param name="formName" value="search_form"/>
			</c:import>
		</div>
		<div id="dialog" title="删除">
			<p>确实要删除这个结算吗？</p>
		</div>
	</div>
</div>
</div>
<%@ include file="/includes/datepicker_script.jsp"%>
<%@ include file="/includes/list_page_script.jsp"%>
<script type="text/javascript" language="javascript">
	var viewDialogTitle = "结算信息";
</script>
<%@ include file="/includes/view_dialog.jsp"%>
<%@ include file="/includes/iframe_footer.jsp"%>