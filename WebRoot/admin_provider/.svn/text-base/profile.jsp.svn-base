<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ include file="/includes/iframe_header.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>main</title>
<base target="_self">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/skin/css/base.css" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/skin/css/main.css" />
</head>
<body leftmargin="8" topmargin='8'>
<table width="98%" border="0" align="center" cellpadding="0" cellspacing="0">
 <tr>
    <td height="1" background="<%=request.getContextPath()%>/skin/images/frame/sp_bg.gif" style='padding:0px'></td>
  </tr>
</table>
<table width="98%" align="center" border="0" cellpadding="3" cellspacing="1" bgcolor="#CBD8AC" style="margin-bottom:8px;margin-top:8px;">
  <tr>
    <td background="<%=request.getContextPath()%>/skin/images/frame/wbg.gif" bgcolor="#EEF4EA" class='title'>您好：<span class="username"><sec:authentication property="name"></sec:authentication></span></td>
  </tr>
  <tr bgcolor="#FFFFFF">
    <td>&nbsp;</td>
  </tr>
</table>
<table width="98%" align="center" border="0" cellpadding="4" cellspacing="1" bgcolor="#CBD8AC" style="margin-bottom:8px">
  <tr>
    <td colspan="2" background="<%=request.getContextPath()%>/skin/images/frame/wbg.gif" bgcolor="#EEF4EA" class='title'>
    	<div style='float:left'><span>快捷操作</span></div>
    	<div style='float:right;padding-right:10px;'></div>
   </td>
  </tr>
  <tr bgcolor="#FFFFFF">
    <td height="30" colspan="2" align="center" valign="bottom"><table width="100%" border="0" cellspacing="1" cellpadding="1">
        <tr>
          <td width="15%" height="31" align="center"><img src="<%=request.getContextPath()%>/skin/images/frame/qc.gif" width="90" height="30" /></td>
          <td width="85%" valign="bottom"><div class='icoitem'>
              <div class='ico'><img src='<%=request.getContextPath()%>/skin/images/frame/addnews.gif' width='16' height='16' /></div>
              <div class='txt'><a href='provider_list.action'><u>运营商管理</u></a></div>
            </div>
            <div class='icoitem'>
              <div class='ico'><img src='<%=request.getContextPath()%>/skin/images/frame/menuarrow.gif' width='16' height='16' /></div>
              <div class='txt'><a href='gateway_list.action'><u>网关设备管理</u></a></div>
            </div>
            <div class='icoitem'>
              <div class='ico'><img src='<%=request.getContextPath()%>/skin/images/frame/manage1.gif' width='16' height='16' /></div>
              <div class='txt'><a href='customer_list.action'><u>用户管理</u></a></div>
            </div>
            <div class='icoitem'>
              <div class='ico'><img src='<%=request.getContextPath()%>/skin/images/frame/file_dir.gif' width='16' height='16' /></div>
              <div class='txt'><a href='pay_list.action'><u>缴费管理</u></a></div>
            </div>
            <div class='icoitem'>
              <div class='ico'><img src='<%=request.getContextPath()%>/skin/images/frame/part-index.gif' width='16' height='16' /></div>
              <div class='txt'><a href='settle_list.action'><u>结算管理</u></a></div>
            </div>
            <div class='icoitem'>
              <div class='ico'><img src='<%=request.getContextPath()%>/skin/images/frame/manage1.gif' width='16' height='16' /></div>
              <div class='txt'><a href='udr_list.action'><u>话单管理</u></a></div>
            </div></td>
        </tr>
      </table></td>
  </tr>
</table>
<table width="98%" align="center" border="0" cellpadding="4" cellspacing="1" bgcolor="#CBD8AC" style="margin-bottom:8px">
  <form method="post" action="user_update.action">
  <input type="hidden" name="users.username" value="<c:out value="${SessionUser.username}"/>">
  <input type="hidden" name="users.providerId" value="<c:out value="${SessionUser.providerId}"/>">
  <tr bgcolor="#EEF4EA">
    <td colspan="2" background="<%=request.getContextPath()%>/skin/images/frame/wbg.gif" class='title'><span>个人信息维护</span></td>
  </tr>
  <tr bgcolor="#FFFFFF">
    <td width="25%" bgcolor="#FFFFFF">用户名:</td>
    <td width="75%" bgcolor="#FFFFFF"><c:out value="${SessionUser.username}"/></td>
  </tr>
  <tr bgcolor="#FFFFFF">
    <td width="25%" bgcolor="#FFFFFF">Email:</td>
    <td width="75%" bgcolor="#FFFFFF"><input type="text" name="users.email" value="<c:out value="${SessionUser.email}"/>"></td>
  </tr>
  <tr bgcolor="#FFFFFF">
    <td width="25%" bgcolor="#FFFFFF">个人描述：</td>
    <td width="75%" bgcolor="#FFFFFF"><input type="text" name="users.description" value="<c:out value="${SessionUser.description}"/>"></td>
  </tr>
   <tr bgcolor="#FFFFFF">
    <td width="25%" bgcolor="#FFFFFF">所属运营商：</td>
    <td width="75%" bgcolor="#FFFFFF"><c:out value="${SessionUser.providerId}"/></td>
  </tr>
   <tr bgcolor="#FFFFFF">
    <td width="25%" bgcolor="#FFFFFF" colspan="2"><input type="submit" id="submit_button" value="确定" /></td>
  </tr>
  </form>
</table>
<script type="text/javascript">
jQuery(document).ready(function(){
	$( "#submit_button" ).button({icons: {primary: "ui-icon-ok"}});
});
</script>
</body>
</html>