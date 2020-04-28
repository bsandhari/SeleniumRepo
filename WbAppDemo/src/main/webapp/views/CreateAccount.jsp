<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CreateAccount Page</title>
    <link rel="stylesheet" href="app.css">
</head>
<body>
<div id="create-form-div">
        <form action="./index.jsp" name="createform" id="create-form" onsubmit="return createvalidate()">
            <input type="text" placeholder="Username" id="cauname" ><br><br>
            <input type="email" placeholder="Email" id="caemail" ><br><br>
            <input type="tel" name="phone" id="caphone" placeholder="Phone number" ><br><br>
            <textarea name="address" id="caaddress" cols="25" rows="5" placeholder="Enter Address"></textarea><br><br>
            <select name="state" id="castate">
                <option value="1">Telangana</option>
                <option value="2">AndhraPradesh</option>
                <option value="3">Karnataka</option>
                <option value="4">Delhi</option>
                <option value="5">Chennai</option>
                <option value="6">Kerala</option>
                <option value="7">Others</option>
            </select>
            <select name="country" id="cacountry">
                <option value="1">India</option>
                <option value="2">Australia</option>
                <option value="3">Newzealand</option>
                <option value="4">kenya</option>
                <option value="5">Singapore</option>
                <option value="6">USA</option>
                <option value="7">Others</option>
            </select>
            <input type="radio" name="grp1" value="Male" id="camr">Male
            <input type="radio" name="grp1" value="Male" id="cafr">Female <br><br>
            <input type="date" name="dob" id="dob" id="cadob"><br><br>
            <input type="checkbox" name="student" id="caschbx">Student
            <input type="checkbox" name="Professional" id="capchbx">Professional <br><br>
            <input type="password" placeholder="Password" id="capass" ><br><br>
            <input type="password" placeholder="Confirm Password" id="cacfpass" ><br><br>
            <input type="submit" value="Submit" id="cabtn">
        </form>
    </div>
    <script type="text/javascript" src="./createaccount.js"></script>
</body>
</html>