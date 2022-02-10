<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css">
<link href="css/style.css" rel="stylesheet" type="text/css"></link>
<style>
<%@include file="/welfare_web/css/style.css"%>
</style>
<title>Career Analysis System</title>
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
				<li class="nav-item active"><a class="nav-link" href="#">Home
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
	<section class="home">
		<div class="max-width">
			<div class="home-content">
				<div class="text-1">Hello</div>
				<div class="text-2">YOU WANT TO LOGIN OR REGISTER</div>
				<div class="text-3">
					NOW<span class="typing"></span>
				</div>
				<a href="loginpage" target="blank">LOGIN</a> <a href="registerpage">REGISTER</a>
			</div>
		</div>
	</section>
	<section class="contact" id="contact">
		<div class="max-width">
			<h2 class="title">Contact Us</h2>
			<div class="contact-content">
				<div class="column left">
					<div class="text">Get in Touch</div>
					<p>Lorem, ipsum dolor sit amet consectetur adipisicing elit.
						Dignissimos harum corporis fuga corrupti. Doloribus quis soluta
						nesciunt veritatis vitae nobis?</p>
					<div class="icons">
						<div class="row">
							<i class="fas fa-user"></i>
							<div class="info">
								<div class="head">Name</div>
								<div class="sub-title">Career Analysis Center</div>
							</div>
						</div>
						<div class="row">
							<i class="fas fa-map-marker-alt"></i>
							<div class="info">
								<div class="head">Address</div>
								<div class="sub-title">Mumbai Center</div>
							</div>
						</div>
						<div class="row">
							<i class="fas fa-envelope"></i>
							<div class="info">
								<div class="head">Email</div>
								<div class="sub-title">career@gmail.com</div>
							</div>
						</div>
					</div>
				</div>
				<div class="column right">
					<div class="text">Message Us</div>
					<form action="contact" method="post">
						<div class="fields">
							<div class="field name">
								<input type="text" placeholder="Name" name="name" required>
							</div>
							<div class="field email">
								<input type="email" placeholder="Email" name="email" required>
							</div>
						</div>
						<div class="field">
							<input type="text" placeholder="Subject" name="subject" required>
						</div>
						<div class="field textarea">
							<textarea cols="20" rows="5" placeholder="Message.."
								name="message" required>
                            </textarea>
						</div>
						<div class="button">
							<button type="submit">Send message</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</section>
	<footer>
		<span>Created By Group 11 | <span class="far fa-copyright"></span>
			2020 All rights reserved.
		</span>
	</footer>
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js"></script>
</body>
</html>