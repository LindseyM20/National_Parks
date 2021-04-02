<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<html lang="en">
<head>
	<meta charset="ISO-8859-1">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<script src="https://kit.fontawesome.com/c5b83037af.js" crossorigin="anonymous"></script>
	<!-- <script defer src="./js/homepage.js"></script> -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
		integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
		crossorigin="anonymous">
	<!-- Optional theme -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
		integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
		crossorigin="anonymous">
	<!-- Latest compiled and minified JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
		integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
		crossorigin="anonymous"></script>
	<spring:url value="/resources/css/main.css" var="mainCss" />
	<link href="${mainCss}" rel="stylesheet" />
	<title>National Parks Bucket/Been List</title>
</head>
<body>
	<%-- <%@ include file="nav_bar1.html"%> --%>
	<div id="hero">
		<nav>
			<a href="./login" id="loginBtn" class="button1"> Log In </a>
		</nav>
		<h1 id="mainTitle">National Parks</h1>
	</div>
	<%--<% List parks =  --%>

	<!-- 
	<c:forEach items="${parks}" var="park">
	    <p><c:out value="${park}"/></p>
	</c:forEach>
	
	  <c:forEach var = "i" begin = "1" end = "5">
         Item <c:out value = "${i}"/><p>
      </c:forEach>

	<%-- A for loop, putting the data in a table --%>
	<table>
		<tr>
			<td>Parks</td>
		</tr>
		<c:forEach items="${parks}" var="park">
			<tr>
				<td>${park.getName()}</td>
			</tr>
		</c:forEach>
	</table>
-->
	<div id="container">
		<ul id="parkList" class="thumbnails">
			<c:forEach items="${parks}" var="park">
				<spring:url value="/resources${park.getPhotoLocal()}" var="photoLocal" />
				<li class="parkLi" style="margin:30px">
					<div class="thumbnail">
						<img src="${photoLocal}" alt="${park.getName()}">
						<h2 class="parkTitle">${park.getName()}</h2>
						<p class="parkSummary">${park.getSummary()}</p>
					</div>
				</li>
			</c:forEach>
		</ul>
	</div>
	<%@ include file="footer.html" %>


</body>
</html>