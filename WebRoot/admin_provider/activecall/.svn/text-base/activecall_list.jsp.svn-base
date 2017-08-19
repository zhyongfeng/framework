<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/includes/iframe_header.jsp"%>

<div id="search_bar">
<div id="search_accordion">
	<h3><a href="#">在线用户查询</a></h3>
	<div style="padding-top:4px; padding-bottom:0;">
	<s:form id="search_form" action='activecall_list.action' validate="false" theme="simple">
			<!-- 
	private java.lang.String callingID;
	private java.lang.String framedIp;
	private java.lang.String NasId;
		 -->
		<table id="search_form_table">
			<tr>
				<td width="80px" align="right">用户帐号：</td>
				<td><s:textfield name="searchCondition.custName"/></td>
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
				<td width="80px" align="right">开始时间：</td>
				<td><s:textfield cssClass="datepicker" name="searchCondition.startTime"/></td>
				<td width="80px" align="right">结束时间：</td>
				<td><s:textfield cssClass="datepicker" name="searchCondition.endTime"/></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td width="80px" align="right">主叫号码：</td>
				<td><s:textfield name="searchCondition.callingID"/></td>
				<td width="80px" align="right">客户端IP：</td>
				<td><s:textfield name="searchCondition.framedIp"/></td>
				<td width="80px" align="right">网关IP：</td>
				<td><s:textfield name="searchCondition.nasId"/></td>
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
	<h3><a href="#">在线用户列表</a></h3>
	<div>
	<table id="list_talbe">
		<tr class="th_line" align="center">
			<th width="5%">Session标识号</th>
			<th width="15%">起始时间</th>
			<th width="8%">下线时间</th>
			<th width="8%">登录名</th>
			<th width="8%">运营商</th>
			<th width="8%">主叫号码</th>
			<th width="8%">网关名称</th>
			<th width="10%">客户端IP</th>
			<th width="15%">操作</th>
		</tr>
		<c:forEach var="item" items="${RESULT.content}" varStatus="idx">
			<tr class="tr_line alternative_${idx.index % 2}" align="center">
				<td><c:out value="${item.id}" />
				</td>
				<td><fmt:formatDate value="${item.startTime}"  type="both" pattern="yyyy-MM-dd hh:mm"/>
				</td>
				<td><fmt:formatDate value="${item.endTime}"  type="both" pattern="yyyy-MM-dd hh:mm"/>
				</td>
				<td><c:out value="${item.custName}" />
				</td>
				<td><c:out value="${item.providerAsString}" />
				</td>
				<td><c:out value="${item.callingID}" />
				</td>
				<td><c:out value="${item.nasId}" />
				</td>
				<td><c:out value="${item.nasIp}" />
				</td>
				<td>
					<a name="view.action" 	href="#activecall_view.action?id=${item.id}" 	id="view_${item.id}">查看</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<div>
		<!--翻页代码 -->
		<c:import url="/component/pager.jsp" charEncoding="UTF-8">
			 <c:param name="action" value="/activecall_list.action"/>
			 <c:param name="formName" value="search_form"/>
		</c:import>
	</div>
	</div>
</div>
</div>
<%@ include file="/includes/datepicker_script.jsp"%>
<%@ include file="/includes/list_page_script.jsp"%>
<script type="text/javascript" language="javascript">
	var viewDialogTitle = "在线用户信息";
</script>
<script type="text/javascript" language="javascript">
	var viewDialogTitle = "话单信息";
</script>
<div id="view_dialog">
	<div id="view_content">
		<div class="loading"></div>
	</div>
</div>
<script>
	$(function() {
		$("[name='view.action']").button({
			icons : {
				primary : "ui-icon-zoomin"
			},
			text: false
		}).click(
				function() {
					
					//$("#view_dialog_frame").attr("width", $( "#view_dialog" ).attr("width"));
					//$("#view_dialog_frame").attr("height", $( "#view_dialog" ).attr("height"));
					$("#view_dialog").dialog( "open" );
					
					var url = $(this).attr("href").substring(1);
					
					//$("#view_dialog_frame").attr("src", $(this).attr("href").substring(1));
					$("#view_dialog").attr("edit_button", $(this).attr("id").replace("view", "edit"));
					
					$.ajax({
						type:"get",
						url:url,
						beforeSend: function(XMLHttpRequest){
							$("#view_content").html("<div class=\"loading\"></div>");
						},
						success: function(data, textStatus){
							$("#view_content").html(data);	
						},
						complete:function(XMLHttpRequest, textStatus){
							
						},
						error: function(){
							
						}
					});
				});
		
		$("#view_dialog").dialog({
			autoOpen: false,
			width: 600,
			height: 500,
			modal: true,
			title: viewDialogTitle,
			buttons: {
				Cancel: function() {
					$( this ).dialog( "close" );
				}
			}
		});
	});
</script>
<%@ include file="/includes/iframe_footer.jsp"%>