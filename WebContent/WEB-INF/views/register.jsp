<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> <!-- We added this line -->
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> <!-- We added this line -->
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<spring:url value="/resources/css/main.css" var="mainCss" />
	<link href="${mainCss}" rel="stylesheet" />
	<spring:url value="/resources/css/login.css" var="loginCss" />
	<link href="${loginCss}" rel="stylesheet" />
	<title>National Parks Register</title>
</head>

<body>
	<div id="titleContainer">
		<h1 class="title">National Parks</h1>
		<h2 class="title">Bucket List | Been List</h2>
	</div>
	<div id="box" class="center">
   		<!-- logo here? -->
	    <h2 class="center">Register New User</h2>
		<form:form action="./register" method="post" modelAttribute="user"> 
			<div>
				<form:input path="name" class="center input" placeholder="Name"/>
				<form:errors path="name" />
			</div><br/>
			<div>
				<form:input path="email" class="center input" placeholder="Email"/>
				<form:errors path="email" />
			</div><br/>
			<div>
				<form:password path="password"  class="center input" placeholder="Password"/>
				<form:errors path="password" />
			</div><br/><br/>
			<div>
				<input class="sub" type="submit" value="Register" />
			</div>
		</form:form>
		<nav>
			<p>Not new? <a href="./login">Login</a></p>
		</nav>
	</div>
</body>
</html>