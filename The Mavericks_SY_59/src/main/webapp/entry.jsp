<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Vozilo Park</title>
	<link rel="stylesheet" href="login.css">
</head>
<body>

	<div class="login-form">
		<h1>Vozilo Park</h1>
		<form action="VehicleServlet">
			<p>Vehicle Number</p>
			<input type = "text" name="vehicle" placeholder="Vehicle Number">
			<p>Phone Number</p>
			<input type = "text" name="phone" placeholder="Phone Number">
			<button type="submit">Submit</button>
		</form>
	</div>

</body>
</html>