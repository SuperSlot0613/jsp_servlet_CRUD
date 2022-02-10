<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
<style>
<%@include file="/welfare_web/css/styles1.css"%>
</style>
<style>
<%@include file="/welfare_web/css/switchery.min.css"%>
</style>
 <script type="text/javascript"><%@include file="/welfare_web/js/switchery.min.js"%></script>
<title>Register Your Self</title>
</head>
<body>
<div id="wrapper">
  
  <h1>Register Form</h1>
  
  <form action="register" method="post">
  <div class="col-2">
    <label>
      First Name
      <input placeholder="What is your First Name?" id="name" name="firstname" tabindex="1">
    </label>
  </div>
  <div class="col-2">
    <label>
      Last Name
      <input placeholder="What is Your Last Name" id="company" name="lastname" tabindex="2">
    </label>
  </div>
  
  <div class="col-3">
    <label>
      Phone Number
      <input type="number" placeholder="What is the best # to reach you?" id="phone" name="phone" tabindex="3">
    </label>
  </div>
  <div class="col-3">
    <label>
      Email
      <input placeholder="What is your e-mail address?" id="email" name="email" tabindex="4">
    </label>
  </div>
  <div class="col-3">
    <label>
      Exam
      <select name="exam" tabindex="5">
        <option >-</option>       
        <option>JEE</option>
        <option>MHT-CET</option>
        <option>JEE ADVANCE</option>
        <option>NEET</option>
        <option>IHM</option>
        <option>CA</option>
        <option>MBA</option>  
      </select>
    </label>
  </div>
  
  <div class="col-4">
    <label>
      STATE RANK
      <input type="number" placeholder="List a few of your primary skills" id="skills" name="staterank" tabindex="6">
    </label>
  </div>
  <div class="col-4">
    <label>
      All India Rank
      <input type="number"placeholder="How many years of experience?" id="experience" name="allindiarank" tabindex="7">
    </label>
  </div>
  <div class="col-4">
    <label>
      Seat Number
      <input type="text"placeholder="How many years of experience?" id="experience" name="seatnumber" tabindex="7">
    </label>
  </div>
  <div class="col-submit">
    <button type="submit" class="submitbtn">Submit Form</button>
  </div>
  
  </form>
  </div>

	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js"></script>
</body>
</html>