<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Vendor Update</title>

<script type= "text/javascript" src = "js/countries.js"></script><!-- Countries and state -->
    
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="css/jquery-ui.css">
  <link rel="stylesheet" href="css/style.css">
  <script src="js/jquery-1.12.4.js"></script>
  <script src="js/jquery-ui.js"></script>
  <script>
  $( function() {
    $( "#datepicker" ).datepicker();
    $( "#datepicker1" ).datepicker();
	 });
  </script>
        
</head>
<body>
	<center>
		<form action="UpdateVendor" method="post">
			<table style=border:1px>
				
				<tr>
					<td>Name of the Vendor</td>
					<td><input type="text" name="vendorName"></td>
				</tr>
				
				<tr>
					<td>Company Reg. No</td>
					<td><input type="text" name="regNo"></td>
				</tr>
				
				<tr>
				<td>Vendor Type</td>
				<td><select>
					<option value="Software">Software</option>
					<option value="Hardware">Hardware</option>
					<option value="Services">Services</option>
					<option value="Application">Application</option>
					</select></td>
				</tr>
				
				<tr>
					<td>Address</td>
					<td>
						<textarea rows="4" cols="50"></textarea>
					</td>
				</tr>
				
				<tr>
				<td>Country</td>			
				<td><select id="country" name ="country"></select></td>
				</tr>
				
				<tr>
				<td>State</td>
				<td><select id="state" name ="state"></select></td>
				<script type="text/javascript"> populateCountries("country", "state"); </script>
				</tr>
				
				<tr>
				<td>Email Address</td>
				<td><input type="text" name="emailAddress"></td>
				</tr>
				
				<tr>
				<td>Contact number</td>
				<td><input type="text" name="contactNumber"></td>
				</tr>
				
				<tr>
				<td>Web site</td>
				<td><input type="text" name="website"></td>
				</tr>

				<tr>
				<td>Certificate Issued Date</td><!-- date -->
				<td><input type="text" name="certificateIssuedDate" id="datepicker"></td>
				</tr>

				<tr>
				<td>Certificate Validity Date</td><!-- date -->
				<td><input type="text" name="certificateValidityDate" id="datepicker1"></td>
				</tr>
  
  				<tr>
				<td>Year of Establishment</td><!-- year -->
				<td><select name="yearOfEstablishment">
					<option value="1970">1970</option>
					<option value="1971">1971</option>
					<option value="1972">1972</option>
					<option value="1973">1973</option>
					<option value="1974">1974</option>
					<option value="1975">1975</option>
					<option value="1976">1976</option>
					<option value="1977">1977</option>
					<option value="1978">1978</option>
					<option value="1979">1979</option>
					<option value="1980">1980</option>
					<option value="1981">1981</option>
					<option value="1982">1982</option>
					<option value="1983">1983</option>
					<option value="1984">1984</option>
					<option value="1985">1985</option>
					<option value="1986">1986</option>
					<option value="1987">1987</option>
					<option value="1988">1988</option>
					<option value="1989">1989</option>
					<option value="1990">1990</option>
					<option value="1991">1991</option>
					<option value="1992">1992</option>
					<option value="1993">1993</option>
					<option value="1994">1994</option>
					<option value="1995">1995</option>
					<option value="1996">1996</option>
					<option value="1997">1997</option>
					<option value="1998">1998</option>
					<option value="1999">1999</option>
					<option value="2000">2000</option>
					<option value="2001">2001</option>
					<option value="2002">2002</option>
					<option value="2003">2003</option>
					<option value="2004">2004</option>
					<option value="2005">2005</option>
					<option value="2006">2006</option>
					<option value="2007">2007</option>
					<option value="2008">2008</option>
					<option value="2009">2009</option>
					<option value="2010">2010</option>
					<option value="2011">2011</option>
					<option value="2012">2012</option>
					<option value="2013">2013</option>
					<option value="2014">2014</option>
					<option value="2015">2015</option>
					<option value="2016">2016</option>
					<option value="2017">2017</option>
					<option value="2018">2018</option>
					<option value="2019">2019</option>
				</select></td>
				</tr>
				
				<tr>
				<td>Payment Gateway</td>
				<td><input type="text" name="yearOfEstablishment"></td>
				</tr>

				<tr>
					<td><input type="submit" value="Update" name="sub"></td>
					<td><input type="reset" value="Clear" name="clear"></td>
				</tr>				
			</table>
		</form>
	</center>

</body>
</html>