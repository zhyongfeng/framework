<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %> 
<html>
<head>
<title>top</title>
<link href="<%=request.getContextPath()%>/skin/css/base.css" rel="stylesheet" type="text/css">
<style>
body { padding:0px; margin:0px; }
#tpa {
	color: #009933;
	margin:0px;
	padding:0px;
	float:right;
	padding-right:10px;
}

#tpa dd {
	margin:0px;
	padding:0px;
	float:left;
	margin-right:2px;
}

#tpa dd.ditem {
	margin-right:8px;
}

#tpa dd.img {
  padding-top:6px;
}

div.item
{
  text-align:center;
	background:url(./../skin/images/frame/topitembg.gif) 0px 3px no-repeat;
	width:82px;
	height:26px;
	line-height:28px;
}

.itemsel {
  width:80px;
  text-align:center;
  background:#226411;
	border-left:1px solid #c5f097;
	border-right:1px solid #c5f097;
	border-top:1px solid #c5f097;
	height:26px;
	line-height:28px;
}

*html .itemsel {
	height:26px;
	line-height:26px;
}

a:link,a:visited {
 text-decoration: underline;
}

.item a:link, .item a:visited {
	font-size: 12px;
	color: #ffffff;
	text-decoration: none;
	font-weight: bold;
}

.itemsel a:hover {
	color: #ffffff;
	font-weight: bold;
	border-bottom:2px solid #E9FC65;
}

.itemsel a:link, .itemsel a:visited {
	font-size: 12px;
	color: #ffffff;
	text-decoration: none;
	font-weight: bold;
}

.itemsel a:hover {
	color: #ffffff;
	border-bottom:2px solid #E9FC65;
}

.rmain {
  padding-left:10px;
  /* background:url(./../skin/images/frame/toprightbg.gif) no-repeat; */
}
.STYLE1 {
	font-size: large;
	font-weight: bold;
	font-family: "华文隶书";
}
</style>
</head>
<body bgColor='#ffffff'>
<table width="100%" border="0" cellpadding="0" cellspacing="0" background="<%=request.getContextPath()%>/skin/images/frame/topbg.gif">
  <tr>
    <td width='20%' height="60"><span class="STYLE1">计费管理系统</span></td>
    <td width='80%' align="right" valign="bottom">
    	<table width="750" border="0" cellspacing="0" cellpadding="0">
      <tr>
      <td align="right" height="26" style="padding-right:10px;line-height:26px;">您好：<span class="username"><sec:authentication property="name"></sec:authentication></span>
        	[<a href="user_changePassword.action" target="_top"> 修改密码</a>]
        	[<a href="logout" target="_top">退出系统</a>]&nbsp;
      </td>
      </tr>
     
    </table></td>
  </tr>
</table>
</body>
</html>