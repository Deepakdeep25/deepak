<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<html>
	<head>
		<title>
			Welcome Page -admin
		</title>
		<link rel="stylesheet" type="text/css" href="style.css" />
	</head>
	<body>
	<div id="outer">
	<div id="header">
			
				<div id="logo">
					<h1>
						Payment Billing System
					</h1>
				</div>	
		</div>
			<div id="banner">
				<div class="captions">
					<h2>Sign in</h2>
				</div>
				<img src="UI/images/banner.jpg" alt="" />
			
			</div>
			
			<div id="nav">
					<ul>
						
						<li>
							<a href="UI/RegisterCustomer.jsp">New Registration</a>
						</li>

						<li>
							<a href="UI/admin.jsp">Administrator Login</a>
						</li>
						
						<li>
							<a href="UI/contactus.jsp">Contact us</a>
						</li>
					</ul><br class="clear" />
				</div>



<div id="main">

<table align="right">
			
			<tr align="center"><td style="color: navy;"><B>Notice</B></td></tr>
			<tr><td><div><marquee direction="up" width="300px" truespeed="truespeed" onmouseover="stop()" onmouseout="start()" style="color: red;">Welcome Administrator sir.
															     You Can Visit a lot of information
															     about my various Branches and Accountants
															      </marquee></div></td></tr></table>

<h3 style="color: navy;" align="center"><B>Bill Payment System</B></h3>
<div id="box">

<form method="post" action="Login_Admin" >
					<table>
					<tr><td style="color:navy;"><B> Login Form</B></td></tr>
					<tr><td><br></td></tr>
					<tr><td>User Name:</td><td><input type="text" name="username"/></td></tr>
								<tr><td><br></td></tr>
					<tr><td>Password:</td><td><input type="password" name="userpass"/></td></tr>	
							<tr><td><br></td></tr>
					<tr><td>      </td><td><input type="submit" value="Sign in"></td></tr>
					
					</table>
					</form>		

<br>

</div>

</div>

</body>


<jsp:include page="footer.jsp"></jsp:include>

</div>

</html>