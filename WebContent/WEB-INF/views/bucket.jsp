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
	<spring:url value="/resources/css/reset.css" var="resetCss" />
	<link href="${resetCss}" rel="stylesheet" />
	<script src="https://kit.fontawesome.com/c5b83037af.js" crossorigin="anonymous"></script>
	
	<link rel="stylesheet"
		href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
		integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
		crossorigin="anonymous">
	
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

	<link href="https://fonts.googleapis.com/css2?family=Kufam&display=swap" rel="stylesheet">
	<spring:url value="/resources/css/navbar.css" var="navbarCss" />
	<link href="${navbarCss}" rel="stylesheet" />
  	<spring:url value="/resources/css/main.css" var="mainCss" />
	<link href="${mainCss}" rel="stylesheet" />
	<style>
		* {
			font-family: 'Kufam', cursive;
		}
		h1, h4 {
			text-align: center;
			color: white;
			margin: 42px;
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
	<title>National Parks Bucket List</title>
</head>
<body>
	<div id="page-container">
		<div id="content-wrap">
			<%@ include file="nav_bar2.html" %>
			<h1>Welcome to your Bucket List, ${user.getName()}!</h1>
			<h4>Here, you can view the parks you've added to your bucket list, add journal entries to keep track of travel tips, and check parks off once you've visited them! </h4>
			<div id="container">
				<ul id="parkList" class="thumbnails">
					<c:forEach items="${bucketParks}" var="park">
						<spring:url value="/resources${park.getPhotoLocal()}" var="photoLocal" />
						<li class="parkLi" style="margin:30px">
							<div class="thumbnail">
								<img src="${photoLocal}" alt="${park.getName()}">
								<h2 class="parkTitle">${park.getName()}</h2>
								<p class="parkSummary">${park.getSummary()}</p>
								
								<form:form action="./journal?park_id=${park.getId()}" method="POST">
									<a class="bucketBtn button1 button2">
										<i class="fas fa-pencil-alt"></i>
										<input name="park_id"
											type="submit"
											value=" Journal"> <!-- When I change to a GET method, the controller is putting the journal value into the URL and trying to use "Journal" as the parameter for park_id. Why? -->
									</a>
								</form:form>
								<form:form class="beenBtn" action="./bucket2?park_id=${park.getId()}" method="POST">
									<a class="beenBtn button1 button2">
										<i class="fas fa-check"></i>
										<input name="park_id"
											type="submit"
											value=" Move to Been">
									</a>
								</form:form>
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