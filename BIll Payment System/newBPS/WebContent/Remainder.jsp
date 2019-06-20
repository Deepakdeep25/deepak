<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script>
		
		function checkedForm() {
		
		var _Remainder = document.getElementById("Remainder").checked;
				
			if(_Remainder==true)
			{
			
				document.getElementById("Remainder_").innerHTML = "<label>Frequency :</label><input type='text' name='Frequency' required>"+"<input type='submit' name='sub'>";
			}
			
			document.getElementById("Submit_").innerHTML = "<input type='submit' value='Set Remainder'>";
		}
	</script>

</head>
<body>
Remainder: <input type="checkbox" id="Remainder"><br>
<input type="button" value="Show Form" onclick="checkedForm()">
	<form action="UpdateFrequency" method="post">
		<p id="Remainder_"></p>
	</form>
</body>
</html>