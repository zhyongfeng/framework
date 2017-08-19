<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix='c' uri='http://java.sun.com/jstl/core_rt'%>
<c:set var="WebRoot" value="${pageContext.request.contextPath}" />
<html>
<HEAD>
<script type="text/javascript">
	if (top.location != self.location) {
		top.location = self.location;
	}
</script>
</HEAD>
<BODY bgColor=#eef8e0 leftMargin=0 topMargin=0 MARGINWIDTH="0"
	MARGINHEIGHT="0">
	<FORM id="login_form" method="POST" action="">
		<TABLE align="center" style="width:1004px; height:552px;background: url('${WebRoot}/images/login_background.jpg') no-repeat scroll center center transparent;">
			<TR height="280px">
				<TD width="170px"></TD>
				<TD></TD>
				<TD></TD>
			</TR>
			<TR height="57px">
				<TD></TD>
				<TD>
					<TABLE id=table2 cellSpacing=1 cellPadding=0 width="100%" border=0>
						<TBODY>
							<TR>
								<TD align=middle width=81><FONT color=#ffffff size=2>用户名：</FONT></TD>
								<TD><INPUT class=regtxt maxLength=16 size=16 value=admin
									name=j_username></TD>
							</TR>
							<TR>
								<TD align=middle width=81><FONT color=#ffffff size=2>密 码：</FONT></TD>
								<TD><INPUT class=regtxt type=password maxLength=16 size="16"
									value=admin name=j_password></TD>
							</TR>
							<TR>
								<TD align=middle width=81><FONT color=#ffffff size=2>登录模式：</FONT></TD>
								<TD>
									<select name="action" id="action">
 										<option value="${WebRoot}/login_admin" selected>系统管理</option>
 										<option value="${WebRoot}/login_provider">业务管理</option>
									</select>
								</TD>
								
							</TR>
							<c:if test="${not empty param.error}">
							<TR>
								<font color="red">请输入正确的用户名和密码<BR>
							</TR>
							</c:if>
						</TBODY>
					</TABLE>
				</TD>
				<TD></TD>
			</TR>
			<TR>
				<TD></TD>
				<TD style="vertical-align: top;">
					<INPUT style="margin-left:20px;margin-top:37px;" type=image height=48 alt="" width="86" src="${WebRoot}/images/crm_17.gif" name=image onclick="Submit()"> 
					<IMG style="margin-left:10px;" height=48	alt="" src="${WebRoot}/images/crm_19.gif" width=84 border=0>
				</TD>
				<TD></TD>
			</TR>
			<TR>
				<TD></TD>
				<TD></TD>
				<TD></TD>
			</TR>
		</TABLE>
	</FORM>
</BODY>

<script type="text/javascript">
	function Submit(){
		var login_form = document.getElementById('login_form');
		login_form.action = document.getElementById('action')[document.getElementById('action').selectedIndex].value;
		login_form.method = "post";
		login_form.submit();
	}
	
</script>
</HTML>
