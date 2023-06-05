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
		<h2>Bill</h2>
		<form action="">
			<h3>Your bill is : ${amount}</h3>
			<button type="button" onclick="window.location.href='main.jsp'">Paid</button>
		</form>
	</div>

</body>
</html>