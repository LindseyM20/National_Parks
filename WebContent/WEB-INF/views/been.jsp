<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<script src="https://kit.fontawesome.com/c5b83037af.js" crossorigin="anonymous"></script>
	<link rel="stylesheet"
		href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
		integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
		crossorigin="anonymous">
  	<spring:url value="/resources/css/main.css" var="mainCss" />
	<link href="${mainCss}" rel="stylesheet" />
	<spring:url value="/resources/css/lists.css" var="listCss" />
	<link href="${listCss}" rel="stylesheet" />
	<title>National Parks Been List</title>
</head>
<body>
	<%@ include file="nav_bar2.html" %>
	<!-- NEED TO GET user WORKING -->
	<h1 style="color: white">${user.getName()}'s Been List</h1>
	
	 	<div id="container">
		<ul id="parkList" class="thumbnails">
			<c:forEach items="${beenParks}" var="park">
				<spring:url value="/resources${park.getPhotoLocal()}" var="photoLocal" />
				<li class="parkLi" style="margin:30px">
					<div class="thumbnail">
						<img src="${photoLocal}" alt="${park.getName()}">
						<h2 class="parkTitle">${park.getName()}</h2>
						<p class="parkSummary">${park.getSummary()}</p>
						<%-- in javascript, buttons had an id for onclick functionality. How to do w/ java? --%>
						<form:form action="./been" method="post" modelAttribute="park">
							<a href="./journal" class="bucketBtn button1 button2" id="${park.getId()}">
								<i class="fas fa-plus"></i> Journal</a>
							<a class="beenBtn button1 button2" id="${park.getId()}">
								<i class="fas fa-minus"></i> Remove</a>
						</form:form>
					</div>
				</li>
			</c:forEach>
		</ul>
	</div>
	<%@ include file="footer.html" %>
</body>
</html>