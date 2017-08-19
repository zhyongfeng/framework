<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %> 
<html>
<head>
<title>menu</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/skin/css/base.css" type="text/css" />
<link rel="stylesheet" href="<%=request.getContextPath()%>/skin/css/menu.css" type="text/css" />
<script language='javascript'>var curopenItem = '1';</script>
<script language="javascript" type="text/javascript" src="<%=request.getContextPath()%>/skin/js/frame/menu.js"></script>
<base target="main" />
</head>
<body target="main">
<table width='99%' height="100%" border='0' cellspacing='0' cellpadding='0'>
  <tr>
    <td style='padding-left:3px;padding-top:8px' valign="top">
	<!-- Item 1 Strat -->
      <dl class='bitem'>
        <dt onClick='showHide("items1_1")'><b>信息中心</b></dt>
        <dd style='display:block' class='sitem' id='items1_1'>
          <ul class='sitemu'>
            <li>
              <a href='provider_view.action?id=${SessionUser.providerId}' target='main'>运营商</a>
            </li>
          </ul>
        </dd>
      </dl>
      <dl class='bitem'>
        <dt onClick='showHide("items2_1")'><b>用户管理</b></dt>
        <dd style='display:block' class='sitem' id='items2_1'>
          <ul class='sitemu'>
            <li>
              <a href='customer_list.action' target='main'>用户列表</a>
            </li>
            <li><a href='activecall_list.action' target='main'>在线用户</a></li>
            <li>
              <a href='udr_list.action' target='main'>话单查询</a>
            </li>
            <li>
              <a href='payRecord_list.action' target='main'>用户缴费</a>
            </li>			
          </ul>
        </dd>
      </dl>
      <dl class='bitem'>
        <dt onClick='showHide("items6_1")'><b>系统管理</b></dt>
        <dd style='display:block' class='sitem' id='items6_1'>
          <ul class='sitemu'>
            <li>
            	<a href='sysLog_list.action' target='main'>系统日志</a> 
            </li>
          </ul>
        </dd>
      </dl>
      <dl class='bitem'>
        <dt onClick='showHide("items6_1")'><b>个人信息管理</b></dt>
        <dd style='display:block' class='sitem' id='items6_1'>
          <ul class='sitemu'>
            <li>
            	<a href='user_profile.action' target='main'>个人信息</a>
            </li>
          </ul>
        </dd>
      </dl>
	  </td>
  </tr>
</table>
</body>
</html>