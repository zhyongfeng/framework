<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %> 
<%@ include file="/includes/iframe_header.jsp"%>

<div id="search_bar">
<div id="search_accordion">
	<h3><a href="javascript:void(0);">您好：<span class="username"><sec:authentication property="name"></sec:authentication></span></a></h3>
	<div style="padding-top:4px; padding-bottom:0;">
</div>
</div>

<div id="shortcut_accordion">
	<h3><a href="javascript:void(0);">快捷操作</a></h3>
	<div style="padding-top:4px; padding-bottom:0;">
		<table width="98%" align="center" border="0" cellpadding="4" cellspacing="1" style="margin-bottom:8px">
		  <tr>
		    <td height="30" colspan="2" align="center" valign="bottom"><table width="100%" border="0" cellspacing="1" cellpadding="1">
		        <tr>
		          <td width="15%" height="31" align="center"><img src="<%=request.getContextPath()%>/skin/images/frame/qc.gif" width="90" height="30" /></td>
		          <td width="85%" valign="bottom">
		          <div class='icoitem'>
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
	</div>
</div>

<div id="personal_info_accordion">
	<h3><a href="javascript:void(0);">个人信息维护</a></h3>
	<div style="padding-top:4px; padding-bottom:0;">
	 <form method="post" action="user_update.action">
	 <input type="hidden" name="users.username" value="<c:out value="${SessionUser.username}"/>">
	<table width="98%" align="center" border="0" cellpadding="4" cellspacing="1" style="margin-bottom:8px">
	 
	  
	  <tr >
	    <td width="25%" >用户名:</td>
	    <td width="75%" ><c:out value="${SessionUser.username}"/></td>
	  </tr>
	  <tr >
	    <td width="25%" >Email:</td>
	    <td width="75%" ><input type="text" name="users.email" value="<c:out value="${SessionUser.email}"/>"></td>
	  </tr>
	  <tr >
	    <td width="25%" >个人描述：</td>
	    <td width="75%" ><input type="text" name="users.description" value="<c:out value="${SessionUser.description}"/>"></td>
	  </tr>   <tr >
	    <td width="25%"  colspan="2"><input id="submit_button" type="submit" value="确定" /></td>
	  </tr>
	  
	</table>
	</form>
	</div>
</div>
<script type="text/javascript">
jQuery(document).ready(function(){
	$( "#search_accordion" ).accordion({
		autoHeight: false,
		navigation: true,
		icons:false
	});
	
	$( "#shortcut_accordion" ).accordion({
		autoHeight: false,
		navigation: true,
		icons:false
	});
	
	$( "#personal_info_accordion" ).accordion({
		autoHeight: false,
		navigation: true,
		icons:false
	});
	
	$( "#submit_button" ).button({icons: {primary: "ui-icon-ok"}});
});
</script>
<%@ include file="/includes/iframe_footer.jsp"%>