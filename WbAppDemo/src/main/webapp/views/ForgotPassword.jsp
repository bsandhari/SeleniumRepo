<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ForgotPassword</title>
    <link rel="stylesheet" href="app.css">
</head>
<body>
<h3>Password Retrieval</h3>
    <div id="forgot-form-div">
    <form action="./index.jsp" id="forgot-form">
        <input type="email" placeholder="Enter Registered email" id="fpemail"><br><br>
        <input type="password" id="forgotpass" placeholder="Enter new password" id="fppass"><br><br>
        <input type="password" id="confirmpass" placeholder="Confirm Password" id="fpcpass"><br><br>
        <input type="submit" value="Reset" id="fpbtn">
    </form>
    </div>
</body>
</html>