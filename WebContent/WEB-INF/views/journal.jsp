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
	<!-- Can probably take this out?
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	 -->
	<link rel="stylesheet"
		href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
		integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
		crossorigin="anonymous">
	<spring:url value="/resources/css/navbar.css" var="navbarCss" />
	<link href="${navbarCss}" rel="stylesheet" />
	<spring:url value="/resources/css/main.css" var="mainCss" />
	<link href="${mainCss}" rel="stylesheet" />
	<spring:url value="/resources/css/form.css" var="formCss" />
	<link href="${formCss}" rel="stylesheet" />
	<title>National Parks Journal</title>
	<style>
		* {
			font-family: 'Kufam', cursive;
			box-sizing: border-box;
		}
		/*
		a {
	 		cursor: pointer;
		}
		*/
		.journalBtn {
			display: inline-block;
		}
	</style>
</head>
<body>

	<%@ include file="nav_bar2.html" %>
  <div id="tableContainer">
  <!-- Park name goes here (updated dynamically) -->
    <h2 class="white">${park.getName()}
      <br />
    </h2>
    <p class="white" id="entry">${journalEntry}</p>
	<br /><br />
    
    <%-- This is a button to write/edit --%>
	<a class="button1 journalBtn" id="addBtn" onclick="add();"> ${bbPark.getJournal_id()==null ? "Write" : "Edit"}</a>
	 
	<%-- This is a delete button that only shows up if a journal entry exists --%>
	<c:if test="${bbPark.getJournal_id()!=null}">
		<form:form id="form2" action="./deletejournal?park_id=${park.getId()}" method="post">
			<a class="button1 journalBtn" id="deleteBtn" style="margin-bottom: 20px" onclick="deleteJournal();"><input style="margin: 0" type="submit" value="Delete" /></a>
		</form:form>
	</c:if> 
	
	<%-- This is a textarea and save button for writing or editing the park, which only shows up when the write/edit button is clicked. --%>
	<form:form id="form" style="display: none; margin: 0 auto" action="./journalentry?park_id=${park.getId()}" method="post">
	<%-- futile attempts to get the existing journal entry to show up in the textarea --%>
		<textarea <%--type="text"--%> path="entry" name="newEntry" value="${textareaText}"></textarea>
		<!-- <textarea type="text" path="entry" name="newEntry" value="${journal.getEntry()!=null ? '' : journalEntry}"></textarea> -->
		<br />
		<div style="text-align: center">
			<a class="button1" style="margin-bottom: 20px"><input style="margin: 0" type="submit" value="Save" /></a>
		</div>
	</form:form>
	
  </div>
  
  <script type="text/javascript">
  function add() {

	  document.getElementById("addBtn").style.display = "none";
	  document.getElementById("entry").style.color = "gray"; //change this to display = "none" if you get entry displaying in textarea
	  document.getElementById("form").style.display = "block";
	  document.getElementById("form2").style.display = "none";
  }
<%--
	  var form = document.createElement("form:form");
	  form.setAttribute("action", "./bucketjournalentry?park_id=${park.getId()}");
	  form.setAttribute("method", "post");

	  var textarea = document.createElement("textarea");
	  textarea.setAttribute("type", "text");
	  textarea.setAttribute("path", "entry");
	  textarea.setAttribute("name", "newEntry");
	  textarea.setAttribute("value", "${textareaText}");

	  var br = document.createElement("br");

	  //var anchor = document.createElement("a");
	  //anchor.setAttribute("class", "button1");

	  var submit = document.createElement("input");
	  submit.setAttribute("type", "submit");
	  submit.setAttribute("value", "save");

	  var container = document.getElementById("tableContainer");
	  container.appendChild(form);
	  form.appendChild(textarea);

	  form.appendChild(br);
	  form.appendChild(submit);
	  //form.appendChild(anchor);
	  //anchor.appendChild(submit);
--%>
	
  
  	function deleteJournal() {
  	  document.getElementById("form2").style.display = "none";
  	  document.getElementById("addBtn").style.display = "none";
  	  document.getElementById("entry").style.display = "block";
  	}

  </script>

</body>
</html>
