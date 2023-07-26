<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Tacos</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
<form:form class="d-flex mt-3 col-6" action="/products/new" method="post" modelAttribute="Production">
   <div><form:label path="num">Numéro:</form:label>
        
        <form:select path="num">
        
        	<c:forEach var="eachname_artist" items="${prod}">
	        
	        	<option value="${eachname_artist.id}"><c:out value="${eachname_artist.num}"/></option>
	        
        	</c:forEach>
        	
        </form:select></div> <br/>
        <div><form:label path="article">Unité:</form:label>
        
        <form:select path="article">
        
        	<c:forEach var="eachname_artist" items="${prod}">
	        
	        	<option value="${eachname_artist.id}"><c:out value="${eachname_artist.article}"/></option>
	        
        	</c:forEach>
        	
        </form:select></div> <br/>
        <div><form:label path="qte">Qté:</form:label>
        
        <form:select path="qte">
        
        	<c:forEach var="eachname_artist" items="${prod}">
	        
	        	<option value="${eachname_artist.id}"><c:out value="${eachname_artist.qte}"/></option>
	        
        	</c:forEach>
        	
        </form:select></div> <br/>
        <div><form:label path="piece">Prix:</form:label>
        
        <form:select path="piece">
        
        	<c:forEach var="eachname_artist" items="${prod}">
	        
	        	<option value="${eachname_artist.id}"><c:out value="${eachname_artist.piece}"/></option>
	        
        	</c:forEach>
        	
        </form:select></div> <br/>
        <div><form:label path="desig">Dépot:</form:label>
        
        <form:select path="desig">
        
        	<c:forEach var="eachname_artist" items="${prod}">
	        
	        	<option value="${eachname_artist.id}"><c:out value="${eachname_artist.desig}"/></option>
	        
        	</c:forEach>
        	
        </form:select></div> <br/>
        <div><form:label path="desiglieu">Motifs:</form:label>
        
        <form:select path="desiglieu">
        
        	<c:forEach var="eachname_artist" items="${prod}">
	        
	        	<option value="${eachname_artist.id}"><c:out value="${eachname_artist.desiglieu}"/></option>
	        
        	</c:forEach>
        	
        </form:select></div>
       <br/>
        
	<div><input type="submit" value="Entrée Stock" class="btn btn-primary mb-3"/>
</div>
</form:form>
	
</body>
</html>

