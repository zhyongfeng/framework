<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix='c' uri='http://java.sun.com/jstl/core_rt'%>
<c:set var="WebRoot" value="${pageContext.request.contextPath}" />
<html>
<HEAD>
<script type="text/javascript">
	if (top.location != self.location){     
		top.location=self.location;     
	}
</script>
</HEAD>
<BODY bgColor=#eef8e0 leftMargin=0 topMargin=0 MARGINWIDTH="0"
	MARGINHEIGHT="0">
	<FORM action="${pageContext.request.contextPath}/login_provider" method="POST">
		<TABLE align="center" style="width:1004px; height:552px;background: url('${WebRoot}/images/login_background.jpg') no-repeat scroll center center transparent;">
			<TR height="280px">
				<TD width="170px"></TD>
				<TD></TD>
				<TD></TD>
			</TR>
			<TR height="57px">
				<TD></TD>
				<TD>
						<TABLE id=table1 cellSpacing=0 cellPadding=0 width="98%" border=0>
							<TBODY>
								<TR>
									<TD>
										<TABLE id=table2 cellSpacing=1 cellPadding=0 width="100%"
											border=0>
											<TBODY>
												<TR>
													<TD align=middle width=81><FONT color=#ffffff>用户名：</FONT>
													</TD>
													<TD><INPUT class=regtxt maxLength=16
														size=16 value=user name=j_username>
													</TD>
												</TR>
												<TR>
													<TD align=middle width=81><FONT color=#ffffff>密 码：</FONT>
													</TD>
													<TD><INPUT class=regtxt type=password
														maxLength=16 size=16 value=user name=j_password>
													</TD>
												</TR>
											</TBODY>
										</TABLE>
									</TD>
								</TR>
							</TBODY>
						</TABLE>
					</TD>
				<TD></TD>
			</TR>
			<TR>
				<TD></TD>
				<TD style="vertical-align: top;">
					<INPUT style="margin-left:20px;margin-top:37px;" type=image height=48 alt="" width="86" src="${WebRoot}/images/crm_17.gif" name=image> 
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
</HTML>
