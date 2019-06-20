<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Billing Form</title>
<script>
		
		function checkedForm() {
		
		var _Electricity = document.getElementById("Electricity").checked;
		var _Telephone = document.getElementById("Telephone").checked;
		var _DTH = document.getElementById("DTH").checked;
		var _Tax = document.getElementById("Tax").checked;
		var _Insurance = document.getElementById("Insurance").checked;
		var _CreditCard = document.getElementById("CreditCard").checked;
		var _LoanAccount = document.getElementById("LoanAccount").checked;
		var _Others = document.getElementById("Others").checked;
		
			if(_Electricity==true)
			{
			
				document.getElementById("Electricity_").innerHTML = "<label>Electricity :</label><input type='text' name='Electricity'>";
			}
			if(_Telephone==true)
			{
			
				document.getElementById("Telephone_").innerHTML = "<label>Telephone:</label><input type='text' name='Telephone'>";
			}
			if(_DTH==true)
			{
				document.getElementById("DTH_").innerHTML = "<label>DTH:</label><input type='text' name='DTH'>";
			}
			if(_Tax==true)
			{
				document.getElementById("Tax_").innerHTML = "<label>Tax:</label><input type='text' name='Tax'>";
			}
			if(_Insurance==true)
			{
				document.getElementById("Insurance_").innerHTML = "<label>Insurance:</label><input type='text' name='Insurance'>";
			}
			if(_CreditCard==true)
			{
				document.getElementById("CreditCard_").innerHTML = "<label>CreditCard:</label><input type='text' name='CreditCard'>";
			}
			if(_LoanAccount==true)
			{
				document.getElementById("LoanAccount_").innerHTML = "<label>LoanAccount:</label><input type='text' name='LoanAccount'>";
			}
			if(_Others==true)
			{
				document.getElementById("Others_").innerHTML = "<label>Others:</label><input type='text' name='Others'>";
			}
			document.getElementById("Submit_").innerHTML = "<input type='submit' value='Submit'>";
		}
	</script>
</head>
<body>

	<center>
		Electricity: <input type="checkbox" id="Electricity"><br>
		Telephone:<input type="checkbox" id="Telephone"><br>
		DTH:<input type="checkbox" id="DTH"><br>
		Tax:<input type="checkbox" id="Tax"><br>
		Insurance:<input type="checkbox" id="Insurance"><br>		
		Credit Card:<input type="checkbox" id="CreditCard"><br>
		Loan account:<input type="checkbox" id="LoanAccount"><br>
		Others:<input type="checkbox" id="Others"><br>
		<input type="button" value="Show Form" onclick="checkedForm()">
	</center>
	
	<center>
		<form action="AddCustomerBill" method="post">
			<p id="Electricity_"></p>
			<p id="Telephone_"></p>
			<p id="DTH_"></p>
			<p id="Tax_"></p>
			<p id="Insurance_"></p>
			<p id="CreditCard_"></p>
			<p id="LoanAccount_"></p>
			<p id="Others_"></p>
			<p id="Submit_"></p>
			
		</form><br><br>
		<a href="Payment_type.html">Pay Bill</a>
	</center>
</body>
</html>