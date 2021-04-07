<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<spring:url value="/resources/css/main.css" var="mainCss" />
	<link href="${mainCss}" rel="stylesheet" />
	<style>
		* {
			align-items: center;
			text-align: center;
		}
		h2 {
			color: white;
			font-family: sans-serif;
			padding: 10% 2% 5%;
		}
	</style>
	<title>Error</title>
</head>
<body>
	<h2>Oops! A miscellaneous error has occurred.</h2>
	<nav>
		<a href="./home" class="button1">Back to Home page</a>
	</nav>
</body>
</html>