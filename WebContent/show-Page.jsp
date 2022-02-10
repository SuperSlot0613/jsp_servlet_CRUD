<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css">
<link href="css/style.css" rel="stylesheet" type="text/css"></link>
<title>Show Page</title>
</head>
<body>
	<nav class="navbar navbar-dark bg-dark navbar-expand-lg navbar-light">
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link" href="/">Home
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="view">view</a></li>
				<li class="nav-item"><a class="nav-link" href="new-student">New
						Student</a></li>
				<li class="nav-item"><a class="nav-link" href="edit-student">Edit
						Student</a></li>
			</ul>
			<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="search"
					placeholder="Search" aria-label="Search"> &nbsp;&nbsp;
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
			</form>
		</div>
	</nav>
	<div class="container">

		<table class="table">
			<thead>
				<tr>
					<th scope="col">#</th>
					<th scope="col">First Name</th>
					<th scope="col">Last Name</th>
					<th scope="col">College Name</th>
					<th scope="col">Mob No</th>
					<th scope="col">Email</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="signlestudent" items="${signlestudent}">
					<tr>
						<th scope="row">1</th>
						<td><c:out value="${signlestudent.name}"></c:out></td>
						<td><c:out value="${signlestudent.lastname}"></c:out></td>
						<td><c:out value="${signlestudent.clg_name}"></c:out></td>
						<td><c:out value="${signlestudent.mob_no}"></c:out></td>
						<td><c:out value="${signlestudent.email}"></c:out></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js"></script>
</body>
</html>