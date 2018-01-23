<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Page</title>
</head>
<body>
<div align="center">
		<h1>Employee Login</h1>

		<form:form method="POST" action="login" modelAttribute="loginAttribute">
		    <form:label path="username">username</form:label>
		    <form:input path="username" type="text"/>
		     
		    <form:label path="password">password</form:label>
		    <form:input path="password" type="password" />
		     
		    <input type="submit" value="Login" />
	</form:form>
		${error}
	</div>	
	
</body>
</html>