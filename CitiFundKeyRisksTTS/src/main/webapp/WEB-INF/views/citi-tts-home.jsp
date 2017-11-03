<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>External Window - CIti TTS Home</title>

<!-- <link type="text/css" id="mainTheme" rel="stylesheet"
	href="/WEB-INF/views/Sly.css"> -->

<script type="text/javascript"
	src="http://code.jquery.com/jquery-1.10.1.min.js">
	
</script>

<script type="text/javascript" th:inline="javascript">

	function callGeneratePIN() {
		document.getElementById("textBox").value = 45545;
		/* $.ajax({
			url : '/CitiFundKeyRisksTTS/generatePin',
			method : 'GET',
			success : function() {
				document.getElementById("textbox").value = '${mpin}';
			}
		}); */
	}

	function doAjaxGet() {
		$.ajax({
			url : '/CitiFundKeyRisksTTS/generatePin1',
			method : 'GET',
			success : function(data) {
				document.getElementById("textBox").innerHTML = 122;
			}
		});
	}
</script>

</head>

<body>

	<h1>
		Welcome to Citi TTS Home
		<h1>

			<br> 123 123 123
			<c:out value="${twilioNo}" />

			<br> <input type="text" id="textBox" /> <input type="button"
				id="button1" value="Generate PIN"
				onclick="location.href='/CitiFundKeyRisksTTS/generatePin'" /> 
			
			<input
				type="button" id="button2" value="Generate PIN11"
				onclick="doAjaxGet()" />
</body>

</html>