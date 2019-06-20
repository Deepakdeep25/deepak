<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<html>
	<head>
		<title>
			Welcome Page
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
					<h2>WELCOME</h2>
				</div>
				<img src="images/banner.jpg" alt="" />
			
			</div>
			
			<div id="nav">
					<ul>
						<li>
							<a href="RegisterCustomer.jsp">New Registration</a>
						</li>

						<li>
							<a href="RegisterAdmin.jsp">Vendor/Administrator Registration</a>
						</li>
						
						<li>
							<a href="contactus.jsp">Contact us</a>
						</li>
					</ul><br class="clear" />
				</div>
			<div id="main">
			<table align="right">
			
			<tr align="center"><td style="color: navy;"><B>Notice</B></td></tr>
			<tr><td><div><marquee direction="up" width="300px" truespeed="truespeed" onmouseover="stop()" onmouseout="start()" style="color: red;">
															     Notification will be displayed here
															      <br/><br/><br/><br/><br/><br/>
															       </marquee></div></td></tr></table>
		<center><font style="color: navy; ">Bill Payment System</font></a></center>
	<div id="sidebar">
					<div class="box">
					
					<form method="post" action="Login" >
					<table>
					<tr><td style="color:navy;"><B> Login Form</B></td></tr>
					<tr><td><br></td></tr>
					
					<tr><td><br></td></tr>
					<tr><td>User Name:</td><td><input type="text" name="userid"/></td></tr>
								<tr><td><br></td></tr>
					<tr><td>Password:</td><td><input type="password" name="password"/></td></tr>	
							<tr><td><br></td></tr>
					<tr><td>      </td><td><input type="submit" value="Sign in"></td></tr>
					</table>
					</form>		 
						</div>
				</div><br class="clear" />
			</div>		



	
			<div id="header">
					<h4>
						<p align="right">For technical issue please report by clicking <a href="mailto:Sanjay.Ravindran@cognizant.com">Report</a><br/></p>
					Copyright 2019 All rights reserved.For more information please visit: <a href="http://www.cognizant.com"><font style="color: blue;">Cognizant</font></a>
					</h4>
			</div>

</div>
	</body>
</html>