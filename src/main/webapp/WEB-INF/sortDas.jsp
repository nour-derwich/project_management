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
    <title>Product</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
   <nav class="navbar navbar-expand-lg navbar-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="/dashboard">list Des entrees stock</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse d-flex"
				id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a 
						href="/sort/new">Ajoiter Sortie Stock</a></li>
					<li class="nav-item"><a class="nav-link" href="/search/topTen">Top
							Stock</a></li>
				</ul>
				<form class="d-flex" action="/search">
					<input class="form-control me-2" name="article" type="search" placeholder="Search"
						aria-label="Search">
					<button class="btn btn-outline-light me-3 search-btn" type="submit">Search
						article</button>
				</form>
			</div>
		</div>
	</nav>
	<table class="table align-middle  mb-0 bg-white">
		<thead class="bg-light">
			<tr>
				<th>Code</th>
				<th>Designation</th>
				<th>Unite</th>
				<th>Qté</th>
				<th>Prix</th>
				<th>Montant</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="s" items="${prods}">
			<tr>
				<td class="col-sm-3">
					<div class="d-flex align-items-center">
					
						<div class="ms-3">
							<p class="fw-bold mb-1"><a href="/prods/${s.id}">${s.num}</a>/2023</p>
							
						</div>
					</div>
				</td>
              <td class="col-sm-3">${s.desig}</td>
               <td class="col-sm-3">${s.desig}</td>
				<td class="col-sm-3">${s.createdAt}</td>
				<td class="col-sm-3">${s.qte}</td>
				<td class="col-sm-3">${s.piece}</td>
				
				<td class="col-sm-3">
				<form action="/songs/${s.id}/delete" method="post" style="Display:inline-block">
				<input type="hidden" name="_method" value="delete">
				 <input type="submit" value="Delete" class="btn btn-outline-danger">
			</form></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>

