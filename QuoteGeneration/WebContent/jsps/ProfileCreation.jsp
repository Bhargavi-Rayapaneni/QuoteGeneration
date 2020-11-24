<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile Creation</title>
</head>
<body>
	<form action="profile.htm" method="POST" modelAttribute="profi">      
		User Name: <input type="text" name="username" maxlength="20" /><br>
    	Password:<input type="password" name="password" maxlength="12" /><br>
    	<label for="rolecode">Role Code:</label>
    	<select name="rolecode">
    		<option value="underwriter">Admin</option>
    		<option value="agent">Agent</option>
    		<option value="insured">Insured</option>
    	</select> 
     
            <input type="submit" value="Submit" >
             </form>
</body>
</html>