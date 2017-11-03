<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>External Window - CIti TTS Home</title>

<script type="text/javascript"
	src="http://code.jquery.com/jquery-1.10.1.min.js">
	
</script>

<script th:inline="javascript">
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
</script>

</head>

<body>

	<h1>Welcome to Citi TTS Home <h1>
		
		<br> 
			
		${twilioNo}
		
		<br>
		
		<input type="text" id="textBox" /> 
		
		<input
				type="button" id="button1" value="Generate PIN"
				onclick="location.href='/CitiFundKeyRisksTTS/generatePin'" />

</body>

</html>