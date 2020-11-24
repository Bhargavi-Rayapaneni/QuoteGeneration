<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Account Already Available</title>
</head>
<body>
	Data Already available<br>
	Account Number	: ${x.getAccount_Number()}<br>
	Insured Name	: ${x.getInsured_Name()}<br>
	Insured Street 	: ${x.getInsured_Street()}<br>
	Insured City 	: ${x.getInsured_City()}<br>
	Insured State 	: ${x.getInsured_State()}<br>
	Insured Zip 	: ${x.getInsured_Zip()}<br>
	Business Segment: ${x.getBus_Seg_Name()}<br> 
	<input type="button" value="back" onClick="location.href('Insured.htm')">
</body>
</html>