<%-- 
    Document   : agecalculator
    Created on : Jan 20, 2020, 1:34:01 PM
    Author     : 785284
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="POST" action="age">
        <p><b>Enter your age:</b><input type="text" name="age"/></p>
        <button name="birthday" type="submit">Age next birthday</button>
        </form>
        ${msg}
        <br>
        <a href>Arithmetic Calculator</a>
    </body>
</html>
