<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>

<body>
	<nav>
		<a href="./register">Register</a>
	</nav>
	<h1>Login Page!</h1>
	<h3>${loginFailedMessage}</h3>
	
	<form:form action="./login" method="post">
		<!-- modelAttribute="user" --> 
		  <!--  the action here has to match the post mapping in the controller -->
		<div>
			<label>Email</label> <input type="text" name="email">
		</div>
		<div>
			<label>Password</label> <input type="password" name="password" />
		</div>
		<div>
			<input type="submit" value="Login" />
		</div>
	</form:form>

</body>
</html>