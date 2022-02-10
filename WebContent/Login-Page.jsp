<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css">
<style>
body {
	margin: 0px;
	padding: 0px;
	background: url("2.jpg") no-repeat center;
	background-size: cover;
	background-attachment: fixed;
}

.box {
	border: 5px solid black;
	border-radius: 20px;
	width: 400px;
	padding: 50px;
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
	text-align: center;
	transition: all 4s ease-in-out;
}

.box h1 {
	color: black;
	text-decoration: underline;
	font-weight: 500;
}

.check {
	border: 0;
	background: none;
	display: block;
	margin: 20px auto;
	text-align: center;
	border: 2px solid #3498db;
	padding: 8px 17px;
	width: 200px;
	outline: none;
	color: black;
	font-size: large;
	font-weight: 500;
	border-radius: 24px;
	transition: 0.25s;
}

.check:focus {
	width: 280px;
	border-color: #2ecc71;
}

.check1 {
	border: 0;
	background: none;
	margin: 0px auto;
	text-align: center;
	border: 2px solid #2ecc71;
	padding: 8px 40px;
	outline: none;
	color: black;
	font-size: large;
	font-weight: 500;
	border-radius: 24px;
	transition: 0.25s;
	cursor: pointer;
	text-decoration: none;
}

.check1:hover {
	background: #2ecc71;
}
</style>
<title>Login Page</title>
</head>
<body>
	<form class="box" action="loginsys" method="post">
		<h1>User LOGIN</h1>
		<input class="check" type="text" name="email"
			placeholder="Email"> 
		<input class="check" type="number"
			name="phonenumber" placeholder="Enter Your Phone Number">
		<button class="check1" type="submit">
			Login
		</button>
	</form>
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js"></script>
</body>
</html>