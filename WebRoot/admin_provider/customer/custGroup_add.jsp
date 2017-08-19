<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<%@ include file="/includes/iframe_header.jsp"%>
<script language="JavaScript">
	function validateNO()
	{   
		var custGroupNO=$("#custGroup_add_action_custGroup_id").val();
	}
</script>
<div id="add_edit_accordion">
	<c:choose>
	<c:when test="${submitType == 'edit'}">
		<h3><a href="#">编辑用户组</a></h3>
	</c:when>
	<c:otherwise>
		<h3><a href="#">添加用户组</a></h3>
	</c:otherwise>
	</c:choose>
	<div style="padding-top:4px; padding-bottom:0;">
		<s:form id="custGroup_add_action" action='custGroup_add.action' validate="true" labelposition="top" requiredposition="right" theme="simple">
			<c:if test="${not empty custGroup.id}">
				<input type="hidden" name="id" value="${custGroup.id}" />
			</c:if>
			  <TABLE class="wwFormTable" style="width:100%;">
			  <TR>
				<TD class="tdLabel errorsBg">组类型编号：</TD>
				<TD width="180px"><s:textfield name="custGroup.id" label="组类型编号" onblur="validateNO();" /></TD>
				<TD class="errorsBg"><span class="errorMessage"><c:out value='${fieldErrors["custGroup.Id"][0]}' /></span></TD>
			  </TR>
			  <TR>
				<TD class="tdLabel errorsBg">描述：</TD>
				<TD width="180px"><s:textarea name="custGroup.description" label="描述"  cols="60" rows="3"/></TD>
				<TD class="errorsBg"><span class="errorMessage"><c:out value='${fieldErrors["custGroup.description"][0]}' /></span></TD>
			  </TR>
			  <TR>
				<TD class="tdLabel errorsBg">组属性：</TD>
				<TD colspan="2">
						<table id="list_talbe" width="100%">
						<tr id="list_talbe_0" tr_index="0" class="th_line" align="center">
							<th width="25%">属性名称</th>
							<th width="25%">属性值</th>
							<th width="40%">属性说明</th>
							<th width="10%"><a name="append_attribute" 	href="javascript:void(0);" 	id="append_attribute">添加</a></th>
						</tr>
						<c:forEach var="item" items="${custAttributes}" varStatus="idx">
							<tr id="list_talbe_${idx.index + 1}" tr_index="${idx.index + 1}" class="tr_line alternative_${idx.index % 2}" align="center">
								<c:if test="${not empty item.id}">
									<input type="hidden" name="custAttributes[${idx.index}].id" value="<c:out value='${item.id}'/>" />
								</c:if>
								<td><input class="editor_cell" type="text" name="custAttributes[${idx.index}].attrName" value="<c:out value='${item.attrName}'/>" id="custAttributes_${idx.index}_attrName" ></td>
								<td><input class="editor_cell" type="text" name="custAttributes[${idx.index}].attrValue" value="<c:out value='${item.attrValue}'/>" id="custAttributes_${idx.index}_attrValue" ></td>
								<td><input class="editor_cell" type="text" name="custAttributes[${idx.index}].attrDesc" value="<c:out value='${item.attrDesc}'/>" id="custAttributes_${idx.index}_attrDesc" ></td>
								<td>
									<a name="remove.action" href="javascript:void(0);" 	id="remove_${idx.index}">删除</a>
									
								</td>
							</tr>
						</c:forEach>
						</table>
				</TD>
			  </TR>
			  </TABLE>
			
		</s:form>
		<HR>
		<s:div id="add_edit_form_buttonbar">
			<s:a href="#" id="custGroup_add_action_submit">提交</s:a>
			<s:a href="#" id="custGroup_add_action_cancel">返回</s:a>
		</s:div>
	</div>
</div>
<script type="text/javascript" language="javascript">
	$(function() {
		$("input[type='text']").css("width", "150px");
		$("select").css("width", "150px");
		$("#add_edit_accordion").accordion({
			autoHeight: false,
			navigation: true
		});
		
		$("#custGroup_add_action").attr("action", 'custGroup_<c:out value="${submitType}" default="add" />.action');
		<c:choose>
		<c:when test="${submitType == 'edit'}">
		$("#custGroup_add_action_custGroup_id").attr('readonly', true);
		</c:when>
		<c:otherwise>
		</c:otherwise>
		</c:choose>
		 
		$("#custGroup_add_action_submit").button({icons: {primary: "ui-icon-ok"}});
		$("#custGroup_add_action_cancel").button({icons: {primary: "ui-icon-cancel"}});
		$("#custGroup_add_action_submit").click(function() {
			$("#custGroup_add_action").submit();
		});
		$("#custGroup_add_action_cancel").click(function() {
			location="<%=request.getContextPath()%>/custGroup_list.action";
		});
		
		$("#append_attribute").button({icons: {primary: "ui-icon-document"}});
		$("#append_attribute").click(function() {
			var tr_index = parseInt($("#list_talbe>tbody>tr:last").attr("tr_index")) + 1;
			str = "<TR id=\"list_talbe_" + tr_index + "\" tr_index=\"" + tr_index + "\" class=\"tr_line alternative_" +(tr_index%2) +  "\" align=\"center\">"
				+ "<td><input class=\"editor_cell\" type=\"text\" name=\"custAttributes[" + (tr_index - 1) + "].attrName\" value=\"\" id=\"custAttributes_" + (tr_index - 1) + "_attrName\" ></td>" 
				+ "<td><input class=\"editor_cell\" type=\"text\" name=\"custAttributes[" + (tr_index - 1) + "].attrValue\" value=\"\" id=\"custAttributes_" + (tr_index - 1) + "_attrValue\" ></td>"
				+ "<td><input class=\"editor_cell\" type=\"text\" name=\"custAttributes[" + (tr_index - 1) + "].attrDesc\" value=\"\" id=\"custAttributes_" + (tr_index - 1) + "_attrDesc\" ></td>"
				+ "<TD><a name=\"remove.action\" href=\"javascript:void(0);\" 	id=\"remove_" + (tr_index - 1) + "\">删除</a></TD></TR>";
			$("#list_talbe>tbody").append(str);
			polishAttrButtons();
		});
		
		function polishAttrButtons(){
			$(".editor_cell").css("width", "100%");
			$("[name='remove.action']").button({
				icons : {
					primary : "ui-icon-trash"
				},
				text: false
			}).click(function(){
				$(this).parent().parent().remove();
			});
		}
		polishAttrButtons();
		
		/**$("[name='add.action']").button({
			icons : {
				primary : "ui-icon-document"
			},
			text: false
		}).click(function(){
			
		});*/
	});
</script>
<%@ include file="/includes/iframe_footer.jsp"%>
