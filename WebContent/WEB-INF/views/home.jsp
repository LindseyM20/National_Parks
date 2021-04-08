<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<html lang="en">
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
	<spring:url value="/resources/css/navbar.css" var="navbarCss" />
	<link href="${navbarCss}" rel="stylesheet" />
	<spring:url value="/resources/css/main.css" var="mainCss" />
	<link href="${mainCss}" rel="stylesheet" />
	<title>National Parks Bucket/Been List | Home</title>
	<style>
		* {
			font-family: 'Kufam', cursive;
		}
		form {
			display: inline-block;
		}
		form.beenBtn {
			margin: -5px -10px 20px;
	
		}
		@media all and (max-width:30em){
		  form {
		    display: block;
		    margin :0.4em auto;
		  }
		}
		
	</style>
</head>
<body>
	<div id="page-container">
		<div id="content-wrap">
			<%@ include file="nav_bar1.html" %>
			<%-- <h1>Welcome, ${currentUser.getName()}!!</h1>
			<%= new java.util.Date() %> --%>
			<div id="hero">
				<h1 id="mainTitle">National Parks</h1>
				<nav>
					<a href="./bucket" class="button1"> Bucket List </a> 
					<a href="./been" class="button1" id="beenListBtn"> Been List </a>
				</nav>
			</div>
			
			<!-- take this back out later - just a test
			<a href="./login" id="loginBtn" class="button1"> Log In </a>
		  -->
		
			<div id="container">
				<ul id="parkList" class="thumbnails">
					<c:forEach items="${parks}" var="park">
						<spring:url value="/resources${park.getPhotoLocal()}" var="photoLocal" />
						<li class="parkLi" style="margin: 30px">
							<div class="thumbnail">
								<img src="${photoLocal}" alt="${park.getName()}">
								<h2 class="parkTitle">${park.getName()}</h2>
								<p class="parkSummary">${park.getSummary()}</p>
		
								<form:form action="./home1?park_id=${park.getId()}" method="POST">
									<a class="button1 button2"> 
										<i class="fas fa-plus"></i>
										<input name="park_id"
											type="submit" 
											value=" Bucket List" />
									</a>
								</form:form>
								<form:form class="beenBtn" action="./home2?park_id=${park.getId()}" method="POST">
									<a class="button1 button2 beenBtn"> 
										<i class="fas fa-plus"></i>
										<input name="park_id"
											type="submit" 
											value=" Been List" />
									</a>
								</form:form>
							</div>
						</li>
					</c:forEach>
				</ul>
			</div>
		</div>
		<%@ include file="footer.html"%>
	</div>
</body>
</html>