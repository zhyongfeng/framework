<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/includes/iframe_header.jsp"%>

<div id="search_bar">
<div id="search_accordion">
	<h3><a href="#">系统日志查询</a></h3>
	<div style="padding-top:4px; padding-bottom:0;">
	<s:form id="search_form" action='sysLog_list.action' validate="false" theme="simple">
		<table id="search_form_table">
			<tr>
				<td width="80px" align="right">操作对象：</td>
				<td><s:textfield name="searchCondition.objectName"/></td>
				<td width="80px" align="right">操作类型：</td>
				<td><s:select list="logTypes"
			            name="searchCondition.logType"
			            listKey="id"
			            listValue="name"
			            emptyOption="true"/>
				</td>
				<td width="80px" align="right">执行操作员：</td>
				<td><s:textfield name="searchCondition.execUser"/></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td width="80px" align="right">开始时间：</td>
				<td><s:textfield cssClass="datepicker" name="searchCondition.startDate" label="结束日期" required="false" value="%{getText('global.format.date',{null!=searchCondition.startDate?searchCondition.startDate:''})}"/></td>
				<td width="80px" align="right">结束时间：</td>
				<td><s:textfield cssClass="datepicker" name="searchCondition.endDate" label="结束日期" required="false" value="%{getText('global.format.date',{null!=searchCondition.endDate?searchCondition.endDate:''})}"/></td>
				<td></td>
				<td></td>
				<td>
					<input id="search_sumbit" type='submit' value='查询' />
				</td>
				<td>
					<input id="search_reset" type='reset' value='重置' />
				</td>
			</tr>
		</table>
	</s:form>
</div>
</div>

<div id="list_accordion">
	<h3><a href="#">系统日志列表</a></h3>
	<div>
	<table id="list_talbe">
		<tr class="th_line" align="center">
			<th width="15%">操作对象</th>
			<th width="15%">操作对象标识</th>
			<th width="8%">操作类型</th>
			<th width="8%">执行操作员</th>
			<th width="10%">执行日期</th>
			<th width="15%">日志简述</th>
			<th width="15%">操作</th>
		</tr>
		<c:forEach var="item" items="${RESULT.content}" varStatus="idx">
			<tr class="tr_line alternative_${idx.index % 2}" align="center">
				<td><c:out value="${item.objectName}" />
				</td>
				<td><c:out value="${item.objectId}" />
				</td>
				<td><c:out value="${item.logType}" />
				</td>
				<td><c:out value="${item.execUser}" />
				</td>
				<td><fmt:formatDate value="${item.updateTime}" type="both" pattern="yyyy-MM-dd hh:mm"/>
				</td>
				<td><c:out value="${item.description}" />
				</td>
				<td>
					<a name="view.action" 	href="#sysLog_view.action?id=${item.id}" 	id="view_${item.id}">查看</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<div>
		<!--翻页代码 -->
		<c:import url="/component/pager.jsp" charEncoding="UTF-8">
			 <c:param name="action" value="/sysLog_list.action"/>
			 <c:param name="formName" value="search_form"/>
		</c:import>
	</div>
	<div id="dialog" title="删除">
		<p>确实要删除这个系统日志吗？</p>
	</div>
	</div>
</div>
</div>

<%@ include file="/includes/datepicker_script.jsp"%>
<%@ include file="/includes/list_page_script.jsp"%>
<script type="text/javascript" language="javascript">
	var viewDialogTitle = "系统日志信息";
</script>
<%@ include file="/includes/view_dialog.jsp"%>
<%@ include file="/includes/iframe_footer.jsp"%>