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
		<form action="Level1Servlet">
			<button type="submit">Level 1</button>
		</form>
		<form action="Level2Servlet">
			<button  type="submit">Level 2</button>
		</form>
		<form action="Level3Servlet">
			<button type="submit">Level 3</button>
		</form>
	</div>

</body>
</html>