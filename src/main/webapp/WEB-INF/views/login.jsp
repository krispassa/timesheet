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

		<form action="login" method="POST">
		<div>
			<label>User Name</label>
			<input type="text" id="username" name="username"/>
		</div>
		
		<div>
			<label>Password</label>
			<input type="password" id="password" name="password"/>
		</div>
		
		<button id="studentLoginBtn"> Login </button>
		
		</form>
		${error}
	</div>
</body>
</html>