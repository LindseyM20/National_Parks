<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>About Page</title>
	<spring:url value="/resources/css/example.css" var="exampleCss"/>
	<link href="${exampleCss}" rel="stylesheet" />
</head>
<body>
	<%@ include file="nav_bar2.html" %>
	<h1>About Page</h1>
</body>
</html>