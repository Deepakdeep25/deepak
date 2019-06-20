<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bill Payment</title>
</head>
<body>
bill payment process..................
Select The Mode of Payment
<form action="BillProcessing" method="post">
			<input type="radio" name="pay" value="card">Credit/Debit Card<br>
			<input type="radio" name="pay" value="ib">Internet Banking<br>
			<input type="radio" name="pay" value="paytm">PayTm<br>
			<input type="radio" name="pay" value="gpay">Google Pay<br>
			<input type="radio" name="pay" value="eWallet">e-Wallet<br>
			<input type="submit" value="Proceed Payment"><br>
		</form>
</body>
</html>