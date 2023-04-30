<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Vozilo Park</title>
	<link rel="stylesheet" href="admin.css">
	<script>
		function myFunction(param){
			document.getElementById(param).style.backgroundColor = "green";
		}
	</script>
</head>
<body>

<header>
	<h1>Vozilo Park</h1>
	<h2 >Green indicates filled</h2>
</header>

<div id="login-form">
		<form action="Level1Servlet">
			<button type="submit">Level 1</button>
		</form>
		<form action="Level2Servlet">
			<button  type="submit">Level 2</button>
		</form>
		<form action="Level3Servlet">
			<button type="submit">Level 3</button>
		</form>
		<form action="">
			<button type="button" onclick="window.location.href='main.jsp'">Main Page</button>
		</form>
</div>

<div id="parking">
	<div id="parking-one">
		<div class="parking-lot" id = "R6">2R6</div>
		<div class="parking-lot" id = "R5">2R5</div>
		<div class="parking-lot" id = "R4">2R4</div>
		<div class="parking-lot" id = "R3">2R3</div>
		<div class="parking-lot" id = "R2">2R2</div>
		<div class="parking-lot" id = "R1">2R1</div>
		<h3 style = "float:right;">Entry</h3>
	</div>
	<div id="mid-space">
	</div>
	<div id="parking-two">
		<div class="empty-parking-lot"></div>
		<div class="parking-lot" id="L5">2L5</div>
		<div class="parking-lot" id="L4">2L4</div>
		<div class="parking-lot" id="L3">2L3</div>
		<div class="parking-lot" id="L2">2L2</div>
		<div class="parking-lot" id="L1">2L1</div>
	</div>
	<div id="parking-three">
		<div class="empty-parking-lot"></div>
		<div class="parking-lot" id="B1">2B1</div>
		<div class="parking-lot" id="B2">2B2</div>
		<div class="parking-lot" id="B3">2B3</div>
		<div class="parking-lot" id="B4">2B4</div>
		<div class="parking-lot" id="B5">2B5</div>
	</div>
	<h3 style = "float:right;">Exit</h3>
</div>

<footer>
	<a style = "float : left;">Entered : <%= new java.util.Date() %></a>
	<a style = "float : right;">A project by The Mavericks</a>
</footer>

<script type="text/javascript">
	var str = "<%= (String)(request.getAttribute("ele")) %>";
	const arr = ["R1", "R2", "R3", "R4", "R5", "R6", "L1", "L2",
			"L3", "L4", "L5", "B1", "B2", "B3", "B4", "B5"]
	for(let i = 0; i < 16; i++){
		if(str.charAt(i) == "1"){
			console.log(arr[i]);
			myFunction(arr[i]);
		}
	}
</script>

</body>
</html>