<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
 		pageEncoding="ISO-8859-1" session="true" import="com.cg.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<% 
	User user=(User)session.getAttribute("currentUser");
	String currentuser=user.getRolecode();
%>

<body>
<form action="account.htm" method="POST" modelAttribute="account"> 
		Insured Name	 : <input type="text" name="insured_Name" maxlength="20" /><br>
		Insured Street 	 : <input type="text" name="insured_Street" maxlength="40" /><br>
		Insured City 	 : <input type="text" name="insured_City" maxlength="15" /><br>
		Insured State 	 : <input type="text" name="insured_State" maxlength="15" /><br>
		Insured Zip 	 : <input type="text" name="insured_Zip" maxlength="5" /><br>
		Business Segment : <select name="Bus_Seg_Name">
		 <option value="Business_Auto">Business Auto</option>
         <option value="Restaurant">Restaurant</option>
         <option value="Apartment">Apartment</option>
         <option value="General_Merchant">General Merchant</option>
         </select><br>
<% if(!currentuser.equals("insured")){%>
		Insured User Name: <input type="text" name="username" ><br>
<%} %>
<input type="submit" value="Submit" >
</form>
</body>
</html>