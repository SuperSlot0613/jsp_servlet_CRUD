<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css">
<link href="css/style.css" rel="stylesheet" type="text/css"></link>
<title>Add New Student</title>
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
				<li class="nav-item"><a class="nav-link" href="view">view<span
						class="sr-only">(current)</span></a></li>
				<li class="nav-item"><a class="nav-link" href="new-student">New
						Student<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="edit-student">Edit
						Student<span class="sr-only">(current)</span>
				</a></li>
			</ul>
			<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="search"
					placeholder="Search" aria-label="Search"> &nbsp;&nbsp;
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
			</form>
		</div>
	</nav>

	<div class="container">
		<div class="row">
			<div class="col-3"></div>
			<div class="col-6">
				<form action="insert" method="post">
					<div class="form-group">
						<label for="name" class="form-label">Enter Your First Name
						</label> <input type="text" class="form-control" id="name" name="name"
							placeholder="Enter Your First Name" aria-describedby="emailHelp">
					</div>
					<div class="form-group">
						<label for="lastname" class="form-label">Enter Your Last
							Name</label> <input type="text" class="form-control"
							placeholder="Enter Your First Name" name="lastname" id="lastname">
					</div>
					<div class="form-group">
						<label for="clg_name" class="form-label">Enter Your
							College Name</label> <input type="text" class="form-control"
							id="collegename" name="clg_name"
							placeholder="Enter Your College Name">
					</div>
					<div class="form-group">
						<label for="mob_no" class="form-label">Enter Your Mobile
							Number</label> <input type="text" class="form-control" id="mob_no"
							name="mob_no" placeholder="Enter Your Mobile Number">
					</div>
					<div class="form-group">
						<label for="email" class="form-label">Enter Your Email
							Address</label> <input type="email" class="form-control" id="email"
							name="email" placeholder="Enter Your Email Address">
					</div>
					<button type="submit" class="btn btn-primary">Submit</button>
				</form>
			</div>

		</div>
	</div>
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js"></script>
</body>
</html>