<%-- 
    Document   : arithmeticcalculator
    Created on : Feb 4, 2020, 9:47:30 PM
    Author     : 785284
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="POST">
            <b>First: </b><input type="text" name="first" value="${first}">
            <br/>
            <b>Second: </b><input type="text" name="second" value="${second}">
            <br/>
            <input type="submit" name="add" value="+"/>
            <input type="submit" name="sub" value="-"/>
            <input type="submit" name="mul" value="*"/>
            <input type="submit" name="mod" value="%"/>
        </form>
            <br/>
            Result: ${result}
            <br/>
            <a href="/Week02Lab_Calculators/age">Age Calculator</a>
    </body>
</html>
