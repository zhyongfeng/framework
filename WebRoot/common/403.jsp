<%@ taglib prefix='c' uri='http://java.sun.com/jstl/core_rt'%>
<%@ page
	import="org.springframework.security.web.authentication.AuthenticationProcessingFilter"%>
<html>
<head>
<title> Access Denied </title>
</head>
<body>
<h2>Access is Denied xxx!</h2>
<br />
<a href="./logout">Please re-login.</a>
<c:if test="${not empty param.error}">
	<font color="red">${SPRING_SECURITY_LAST_EXCEPTION.message}<BR>
	</font>
</c:if>
</body>
</html>
