<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
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
	<title>National Parks Journal</title>
</head>
<body>

	<%@ include file="nav_bar2.html" %>
  <div id="tableContainer">
    <h2 class="white">
      <!-- Park name goes here (updated dynamically) -->
      ${park.getName()}
      <br />
    </h2>
    <p class="white" id="entry">${journalEntry}</p>
    <%--
    Display journal entry here if exists (doesn't work)
    <c:if test="${journalEntry}">
    	<p>${journalEntry}</p>
    </c:if>
    Display something else if journal doesn't exist
    <c:if test="!${journalEntry}">
    	<p>No journal entry yet!</p>
    </c:if>
    --%>
    
    <%-- This will be a button to write/edit --%>
	<%-- <nav> --%>
		<a class="button1" id="addBtn" onclick="add();"> ${buttonText} </a>
		<!-- href="./journal_edit"  --> 
	<%-- </nav> --%>
	
	<!--  -->
	<form:form action="./bucketjournalentry?park_id=${park.getId()}" method="post">
		<textarea type="text" path="entry" name="newEntry" value="${textareaText}"></textarea>
		<br />
		<input type="submit" value="save" />
	</form:form>
	
  </div>
  <!-- 
  <script type="text/javascript">
   function add() {
     document.getElementById("addBtn").style.display = "none";
     document.getElementById("entry").style.display = "none";
     
	 var form = document.createElement("form:form");
	 form.setAttribute("action", "./bucketjournal");
	 form.setAttribute("method", "post");
	 form.setAttribute("modelAttribute", "journal");
	 
	 var submit = document.createElement("input")
	 submit.setAttribute("type", "submit");
	 submit.setAttribute("value", "save");
	 
     var textarea = document.createElement("textarea");
     textarea.setAttribute("type", "text");
     textarea.setAttribute("path", "entry");
     textarea.setAttribute("name", "newEntry");
     textarea.value = "${textareaText}";
     
     var container = document.getElementById("tableContainer");
     container.appendChild(form);
     form.appendChild(textarea);
     form.appendChild(submit);
   }
</script>
 -->
</body>
</html>