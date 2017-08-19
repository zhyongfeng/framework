<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<html>
<head>
<title>Framework UI</title>
<meta content="text/html; charset=utf-8" http-equiv="Content-Type">
<link type="text/css" href="<%=request.getContextPath()%>/css/ui-lightness/jquery-ui-1.8.13.custom.css" rel="stylesheet" />
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.5.2.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-ui-1.8.13.custom.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.jstree.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.cookie.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.hotkeys.js"></script>
<link type="text/css" href="<%=request.getContextPath()%>/css/main.css" rel="stylesheet" />

	<script type="text/javascript">
	$(function() {
		
		$('.left-nav a').click(function(ev) {
			var anchorIndex = this.href.indexOf('#');
			if(anchorIndex >= 0){
				var relativePath = this.href.substring(anchorIndex);
				window.location.hash = relativePath + '|default';
				var path = "<%=request.getContextPath()%>/" + relativePath.substring(1);
				loadPage(path);
				$('.left-nav a.selected').removeClass('selected');
				$(this).addClass('selected');
			}
			ev.preventDefault();
		});
		
		if (window.location.hash) {
			var path = "<%=request.getContextPath()%>/" + window.location.hash.substring(1);
			var sepIndex = window.location.hash.indexOf('|');
			if (sepIndex === -1) {
				window.location.hash += '|default';	
			}else{
				path = "<%=request.getContextPath()%>/" + window.location.hash.substring(1, sepIndex);
			}
			loadPage(path);
		}		

		function loadPage(path) {
			$("#main_content",parent.document.body).attr("src", path);
		}
	});
	</script>
</head>
<body>
<TABLE style="width: 100%; height: 100%; border-spacing: 0px;">
	<TR style="height: 3em;">
		<TD colspan="2">
			<div>
				<div class="MIG"></div>
				<div class="MJG">
					<div>
						<b>欢迎回来, foo@example.com</b>
					</div>
					<div class="MHG">
						<a href="javascript:;">Sign Out</a> &nbsp; <a href="javascript:;">关于</a>
					</div>
				</div>
			</div></TD>
	</TR>
	<TR style="height: 45px; vertical-align:bottom;"">
		<TD colspan="2">
		</TD>
	</TR>
	<TR>
		<TD style="width:7em; vertical-align:top;">
		<div class="left-nav">
		<div class="leftbar-section">
			<dl class="demos-nav">
				<dt>运营商管理</dt>
				<dd>
					<a href="#provider_list.action">运营商</a>
				</dd>
				<dd>
					<a href="#sysLog.action">#lstSysLog_execute()</a>
				</dd>
				<dd>
					<a href="#resizable/index.html">Resizable</a>
				</dd>
				<dd>
					<a href="#selectable/index.html">Selectable</a>
				</dd>
				<dd>
					<a href="#sortable/index.html">Sortable</a>
				</dd>
				<dt>导航栏2</dt>
				<dd>
					<a href="#accordion/index.html">Accordion</a>
				</dd>
				<dd>
					<a href="#datepicker/index.html">Datepicker</a>
				</dd>
				<dd>
					<a href="#dialog/index.html">Dialog</a>
				</dd>
				<dd>
					<a href="#progressbar/index.html">Progressbar</a>
				</dd>
				<dd>
					<a href="#slider/index.html">Slider</a>
				</dd>
				<dd>
					<a href="#tabs/index.html">Tabs</a>
				</dd>
				<dt>导航栏3</dt>
				<dd>
					<a href="#addClass/index.html">Add Class</a>
				</dd>
				<dd>
					<a href="#removeClass/index.html">Remove Class</a>
				</dd>
				<dd>
					<a href="#animate/index.html">Animate</a>
				</dd>
				<dd>
					<a href="#effect/index.html">Effect</a>
				</dd>
				<dd>
					<a href="#hide/index.html">Hide</a>
				</dd>
				<dd>
					<a href="#show/index.html">Show</a>
				</dd>
				<dd>
					<a href="#switchClass/index.html">Switch Class</a>
				</dd>
				<dd>
					<a href="#toggle/index.html">Toggle</a>
				</dd>
				<dd>
					<a href="#toggleClass/index.html">Toggle Class</a>
				</dd>
			</dl>
			</div></div>
		</TD>
		<TD style="vertical-align:top;">
			<iframe id="main_content" frameborder="0" scrolling="no"></iframe>
		</TD>
	</TR>
	
</TABLE>
</body>
</html>