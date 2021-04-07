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
	<h2>Oops! An error occurred and you've accidentally been logged out.</h2>
	<nav>
		<a href="./login" class="button1">Log in again</a>
	</nav>
</body>
</html>