<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<spring:url value="/resources/css/main.css" var="mainCss" />
	<link href="${mainCss}" rel="stylesheet" />
	<spring:url value="/resources/css/login.css" var="loginCss" />
	<link href="${loginCss}" rel="stylesheet" />
	<title>National Parks Login</title>
</head>

<body>
	<div id="titleContainer">
		<h1 class="title">National Parks</h1>
		<h2 class="title">Bucket List | Been List</h2>
	</div>
	<div id="box" class="center">
   		<!-- logo here? -->
      <h1 class="center">User Login</h1>
      <h3>${loginFailedMessage}</h3>
		<form:form action="./login" method="post">
			<!-- modelAttribute="user" --> 
			<div>
				<input class="center input" type="text" name="email" placeholder="Email" />
			</div> <br/> 
			<div>
				<input class="center input" type="password" name="password" placeholder="Password" />
			</div> <br/> <br/>
			<div>
				<input class="sub" type="submit" value="Login" />
			</div>
		</form:form> <br/>
		<nav>
			<p>New user? <a href="./register">Register</a></p>
		</nav>
 	</div>
</body>
</html>