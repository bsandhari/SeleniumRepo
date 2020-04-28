<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ContactUsPage</title>
    <link rel="stylesheet" href="welcomepage.css">
</head>
<body>
<p>Please fill the below details</p> 
   <div id="cu-form-div">
       <form action="./WelcomePage.jsp" id="cu-form">
           <input type="text" placeholder="Name" id="cuuname"><br><br>
           <input type="email" id="" placeholder="Email" id="cuemail"><br><br>
           <textarea id="" cols="10" rows="5" placeholder="Address" id="cuaddress"></textarea><br><br>
           <textarea cols="10" rows="5" placeholder="Message" id="cumsg"></textarea><br><br>
           <button type="submit" id="cubtn">Submit</button>
        </form>
   </div>
</body>
</html>