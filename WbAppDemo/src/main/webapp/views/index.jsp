<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<link rel="stylesheet" href="./app.css">
</head>
<body>
<div id="login-form-div">
        <h3>Login</h3>
        <form action="./WelcomePage.jsp" name="loginform" id="login-form" onsubmit=" return validate()">
            <input type="text" id="login-uname" placeholder="Username" ><br><br>
            <input type="password" id="login-pass" placeholder="Password" ><br><br>
            <input type="submit" id="login-btn" value="Login"><br><br>
            <a href="./CreateAccount.jsp" id="createlink">CreateAccount</a><br>
            <a href="./ForgotPassword.jsp" id="forgotlink">Forgot Password?</a>
        </form>
    </div>
    <script type="text/javascript" src="./loginpage.js"></script>
</body>
</html>