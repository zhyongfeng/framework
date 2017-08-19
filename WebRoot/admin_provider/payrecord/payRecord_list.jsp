<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/includes/iframe_header.jsp"%>
<div id="search_bar">
<div id="search_accordion">
	<h3><a href="#">缴费记录查询</a></h3>
	<div style="padding-top:4px; padding-bottom:0;">
	<s:form id="search_form" action='payRecord_list.action' validate="false" theme="simple">
		<table id="search_form_table">
			<tr>
				<td width="80px" align="right">用户账号：</td>
				<td><s:textfield name="searchCondition.custId"/>
				</td>
				<td width="80px" align="right">运营商：</td>
				<td><c:choose>
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
	<h3><a href="#">缴费记录列表</a></h3>
	<div>
		<a href="payRecord_add.action" id="addbutton"
			class="ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-primary"><span
			class="ui-button-icon-primary ui-icon ui-icon-document"></span><span
			class="ui-button-text">添加</span>
		</a>

		<table id="list_talbe">
			<tr class="th_line" align="center">
				<th width="5%">编号</th>
				<th width="5%">用户账号</th>
				<th width="15%">所属运营商</th>
				<th width="8%">资费代码/名称</th>
				<th width="8%">单价</th>
				<th width="8%">购买数量</th>
				<th width="8%">折扣率</th>
				<th width="8%">总金额</th>
				<th width="10%">交费日期</th>
				<th width="10%">是否已结算</th>
				<th width="10%">收费操作员</th>
				<th width="10%">修改内容</th>
				<th width="10%">修改原因</th>
				<th width="15%">操作</th>
			</tr>
			<c:forEach var="item" items="${RESULT.content}" varStatus="idx">
				<tr class="tr_line alternative_${idx.index % 2}" align="center">
					<td><c:out value="${item.id}" />
					</td>
					<td><c:out value="${item.custId}" />
					</td>
					<td><c:out value="${item.providerAsString}" />
					</td>
					<td><c:out value="${item.tollId}" />/<c:out value="${item.tollAsString}" />
					</td>
					<td><fmt:formatNumber value="${item.price}" pattern="####0.00" />
					</td>
					<td><c:out value="${item.amount}" />
					</td>
					<td><c:out value="${item.discount}%" />
					</td>
					<td><fmt:formatNumber value="${item.totalAmount}" pattern="####0.00" />
					</td>
					<td><fmt:formatDate value="${item.payDate}" type="both" pattern="yyyy-MM-dd hh:mm"/>
					</td>
					<td><c:if test="${item.isSettled == 0}" >否</c:if><c:if test="${item.isSettled == 1}" >是</c:if>
					</td>
					<td><c:out value="${item.updateUser}" />
					</td>
					<td><c:out value="${item.updateContent}" />
					</td>
					<td><c:out value="${item.updateReason}" />
					</td>
					<td>
						<a name="edit.action" 	href="#payRecord_edit.action?id=${item.id}" 	id="edit_${item.id}">编辑</a>
						<a name="remove.action" href="#payRecord_remove.action?id=${item.id}" 	id="remove_${item.id}">删除</a>
						<a name="view.action" 	href="#payRecord_view.action?id=${item.id}" 	id="view_${item.id}">查看</a>
				</tr>
			</c:forEach>
			<tr class="th_line" align="center">
				<th width="5%"></th>
				<th width="5%"></th>
				<th width="15%"></th>
				<th width="8%"></th>
				<th width="8%"></th>
				<th width="8%"></th>
				<th width="8%"></th>
				<th width="8%"><c:out value="${PageSum}"/> of <c:out value="${Sum}"/></td>
				<th width="10%"></th>
				<th width="10%"></th>
				<th width="10%"></th>
				<th width="10%"></th>
				<th width="10%"></th>
				<th width="15%">
					 <form method="post" action="settleRecord_add.action">
					 	<table>
					 	 <input type="hidden" name="fromPayRecord" value="1">
						 <input type="hidden" name="settleRecord.totalFee" value="<c:out value="${Sum}"/>">
						 <input type="hidden" name="settleRecord.providerId" value="<c:out value="${providerId}"/>">
						 <input type="hidden" name="settleRecord.startDate" value="<fmt:formatDate value="${startDate}" pattern="yyyy-MM-dd"/>">
						 <input type="hidden" name="settleRecord.endDate" value="<fmt:formatDate value="${endDate}" pattern="yyyy-MM-dd"/>">
						 <tr >
						    <td width="25%"  colspan="2">
							<c:if test="${adminRole}">
						    	<input id="submit_button" type="button" onclick="submit()" value="结算" />
						    </c:if>	
						    </td>
						  </tr>
						</table>
						</form>
				</th>
			</tr>
		</table>
		<div>
			<!--翻页代码 -->
			<c:import url="/component/pager.jsp" charEncoding="UTF-8">
				 <c:param name="action" value="/payRecord_list.action"/>
				 <c:param name="formName" value="search_form"/>
			</c:import>
		</div>
		<div id="dialog" title="删除">
			<p>确实要删除这个缴费记录吗？</p>
		</div>
</div>
</div>
</div>
<%@ include file="/includes/datepicker_script.jsp"%>
<%@ include file="/includes/list_page_script.jsp"%>
<script type="text/javascript" language="javascript">
	var viewDialogTitle = "运营商信息";
	jQuery(document).ready(function(){
		$( "#submit_button" ).button({icons: {primary: "ui-icon-ok"}});
	});
	
	function submit(){
		alert(document.getElementById("searchCondition.startDate").value);
		alert(document.getElementById("searchCondition.endDate").value);
		return false;
	}
</script>
<%@ include file="/includes/view_dialog_only_cancel.jsp"%>
<%@ include file="/includes/iframe_footer.jsp"%>