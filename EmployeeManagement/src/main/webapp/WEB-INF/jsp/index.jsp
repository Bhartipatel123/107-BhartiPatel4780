<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Hello world!</h1>
	

	<form action="login" method="POST">
		<p> User Name :<input type="text" name="userName"><br>
		<p> Password  :<input type="text" name="password"><br>
		
		 <input
			type="submit" value="login">
	</form>
</body>
</html>