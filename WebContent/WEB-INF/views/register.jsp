<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> <!-- We added this line -->
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> <!-- We added this line -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>

<body>
	<nav>
		<a href="./login">Login</a>
	</nav>
	<h1>Register as a new user!</h1>
	<form:form action="./register" method="post" modelAttribute="user"> <!-- the action here has to match the post mapping in the controller (not necessarily this jsp file name)-->
		<div>
			<label>Name</label> 
			<form:input path="name" />
			<form:errors path="name" /> <!-- If there's a validation error based on what we configure in the class, the app will reject the input and the error will get displayed. -->
		</div>
		<div>
			<label>Email</label> 			
			<form:input path="email" />
			<form:errors path="email" />
		</div>
		<div>
			<label>Password</label> 			
			<form:password path="password" />
			<form:errors path="password" />
			<!-- <input type="password" /> figure out how to make the above line do the dots like this does --> 
		</div>
		<div>
			<input type="submit" value="Register" />
		</div>
	</form:form> <!-- Notice the form tags are slightly different for spring -->

</body>
</html>