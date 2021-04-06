<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<spring:url value="/resources/css/reset.css" var="resetCss" />
	<link href="${resetCss}" rel="stylesheet" />
	<script src="https://kit.fontawesome.com/c5b83037af.js" crossorigin="anonymous"></script>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<link rel="stylesheet"
		href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
		integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
		crossorigin="anonymous">
	<spring:url value="/resources/css/main.css" var="mainCss" />
	<link href="${mainCss}" rel="stylesheet" />
	<spring:url value="/resources/css/form.css" var="formCss" />
	<link href="${formCss}" rel="stylesheet" />
	<title>Insert title here</title>
</head>
<body>
	<%@ include file="nav_bar2.html" %>
  <div id="tableContainer">
    <h2 class="white">
      <!-- Park name goes here (updated dynamically) -->
      ${park.getName()}
      <br />
    </h2>
    <form:form action="./journal" method="post" modelAttribute="journal">
		
    </form:form>

    <textarea></textarea>
  </div>
</body>
</html>