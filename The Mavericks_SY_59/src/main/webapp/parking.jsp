<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Vozilo Park</title>
	<link rel="stylesheet" href="entry.css">
	<script>
		function myFunction(param){
			document.getElementById(param).style.backgroundColor = "green";
		}
	</script>
	<script>
		function myFunction2(color){
			const collection = document.getElementsByClassName("empty-parking-lot");
			for(let i = 0; i< collection.length; i++){
				collection[i].style.backgroundColor = color;
			}
		}
	</script>
</head>
<body>

<header>
	<h1>Vozilo Park</h1>
	<h2 >Go to floor number ${label}</h2>
</header>

<div>
	<form action="ExitServlet">
			<button type="button" onclick="window.location.href='main.jsp'">Done</button>
		</form>
</div>

<div id="parking">
	<div id="parking-one">
		<div class="parking-lot" id = "R6">${label}R6</div>
		<div class="parking-lot" id = "R5">${label}R5</div>
		<div class="parking-lot" id = "R4">${label}R4</div>
		<div class="parking-lot" id = "R3">${label}R3</div>
		<div class="parking-lot" id = "R2">${label}R2</div>
		<div class="parking-lot" id = "R1">${label}R1</div>
		<h3 style = "float:right;">Entry</h3>
	</div>
	<div id="mid-space">
		<%= (request.getAttribute("road")) %>
	</div>
	<div id="parking-two">
		<div class="empty-parking-lot"></div>
		<div class="parking-lot" id="L5">${label}L5</div>
		<div class="parking-lot" id="L4">${label}L4</div>
		<div class="parking-lot" id="L3">${label}L3</div>
		<div class="parking-lot" id="L2">${label}L2</div>
		<div class="parking-lot" id="L1">${label}L1</div>
	</div>
	<div id="parking-three">
		<div class="empty-parking-lot"></div>
		<div class="parking-lot" id="B1">${label}B1</div>
		<div class="parking-lot" id="B2">${label}B2</div>
		<div class="parking-lot" id="B3">${label}B3</div>
		<div class="parking-lot" id="B4">${label}B4</div>
		<div class="parking-lot" id="B5">${label}B5</div>
	</div>
	<div id="bottom-space">
		<%= (request.getAttribute("bottom-road")) %>
	</div>
	<h3 style = "float:right;">Exit</h3>
</div>

<footer>
	<a style = "float : left;">Entered : <%= new java.util.Date() %></a>
	<a style = "float : right;">A project by The Mavericks</a>
</footer>

<script type="text/javascript">
	var str = "<%= (String)(request.getAttribute("ele")) %>";
	myFunction(str);
</script>

<%= (String)(request.getAttribute("emp-park")) %>

</body>
</html>