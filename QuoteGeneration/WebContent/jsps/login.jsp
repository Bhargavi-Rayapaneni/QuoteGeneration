<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
   <!--  <link rel="stylesheet" type="text/css" href="style.css"/>-->
    <title>Login</title>
</head>
<body>
	<div align="center">
 		<h1>Online Insurance Quote (Policy)GenerationSystem</h1>
 		<font color="red">${errorMessage}</font>
 		
 		<form action="login.htm" method="POST" modelAttribute="login">      
			Login ID:<font color="red"></font><input type="text" name="username" maxlength="20" /><br>
            Password:<input type="password" name="password" maxlength="12" /><br>  
            <input type="submit" value="Submit" >
       </form>
       
   </div>
</body>
</html>