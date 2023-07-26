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
   <div class="container">
<a href="/dashboard" style="float:right">Dashboard</a>
<div class="d-flex mt-3 col-6">

<form:form action="/products/new" method="post" modelAttribute="prod">
<legend>Add Prodect</legend>

<div class="mb-3">

<form:label path="num" class="form-label">Numéro</form:label>
<form:errors path="num" class="text-danger"/>
<form:input path="num" type="text" class= "form-control"/><p>/2023</p>


<form:label path="article" class="form-label">Unité</form:label>
<form:errors path="article" class="text-danger"/>
<form:input path="article" type="text" class="form-control" />
<form:label path="qte" class="form-label">Qté</form:label>
<form:errors path="qte" class="text-danger"/>
<form:input path="qte" type="text" class="form-control" />
<form:label path="piece" class="form-label">Prix</form:label>
<form:errors path="piece" class="text-danger"/>
<form:input path="piece" type="number" class="form-control" />

<form:label path="desig" class="form-label">Dépot</form:label>
<form:errors path="desig" class="text-danger"/>
<form:input path="desig" type="text" class="form-control" step=".5"/>

<form:label path="desiglieu" class="form-label">Motifs: </form:label>
<form:errors path="desiglieu" class="text-danger"/>
<form:textarea path="desiglieu" rows="3" class="form-control"></form:textarea><br />


<input type="submit" value="Entrée Stock" class="btn btn-primary mb-3"/>
</div>
</form:form>
</div>
</div>
</body>
</html>

