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
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
		integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
		crossorigin="anonymous">
	<spring:url value="/resources/css/main.css" var="mainCss" />
	<link href="${mainCss}" rel="stylesheet" />
	<style>
		ul { /* Added this b/c chrome's "user agent stylesheet" was adding 40px padding only to the left side */
		  -webkit-padding-start: 0px;
		  -webkit-padding-end: 0px;
		}
		img {
			margin-top: 1.5%;
		}
		@media all and (max-width:30em){
		  img {
			margin-top: 0;
		  }
		}
	</style>
	<title>National Parks Bucket/Been List</title>
</head>
<body>
	<div id="page-container">
		<div id="content-wrap">
			<div id="hero">
				<nav>
					<a href="./login" id="loginBtn" class="button1"> Log In </a>
				</nav>
				<h1 id="mainTitle">National Parks</h1>
			</div>

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
		</div>
		<%@ include file="footer.html" %>
	</div>
</body>
</html>