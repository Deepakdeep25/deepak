<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Registration</title>
</head>
<body>
	<center>
		<form action="AddCus" method="post">
			<table style=border:1px>
				
				<tr>
					<td>First Name</td>
					<td><input type="text" name="firstName" required></td>
				</tr>
				
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="lastName" required></td>
				</tr>
				
				<tr>
				<td>Age</td>
				<td><input type="text" name="age" required></td>
				</tr>
				
				<tr>
					<td>Gender</td>
					<td>
						<select name="gender" required>
						<option value="Male">Male</option>
						<option value="female">Female</option>
						<option value="others">others</option>
						</select>
					</td>
				</tr>
				
				<tr>
				<td>Contact Number</td><!-- not important -->
				<td><input type="text" name="contactNumber"></td>
				</tr>
				
				<tr>
				<td>PAN</td>
				<td><input type="text" name="pan" required></td>
				</tr>
				
				<tr>
				<td>Aadhar Number</td>
				<td><input type="text" name="aadharNumber" required></td>
				</tr>
				
				<tr>
				<td>UserId</td>
				<td><input type="text" name="userId" required></td>
				</tr>
				
				<tr>
				<td>Password</td>
				<td><input type="Password" name="password"required></td>
				</tr>
		
				<tr>
					<td><input type="submit" value="Submit" name="submit"></td>
					<td><input type="reset" value="Clear" name="clear"></td>
				</tr>				
			</table>
		</form>
	</center>
</body>
</html>