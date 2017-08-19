<%@ taglib prefix='c' uri='http://java.sun.com/jstl/core_rt'%>
<%@ page
	import="org.springframework.security.web.authentication.AuthenticationProcessingFilter"%>
<html>
<head>
<title>Exception</title>
</head>
<body>
<h2>Exception</h2>
<br />
<c:if test="${not empty exception}">
	<font color="red">${exception}</font>
</c:if>
</body>
</html>
