<%-- 
    Document   : arithmeticcalculator
    Created on : 21-Sep-2022, 2:11:49 AM
    Author     : Karsten Monteiro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <!-- form -->
        <form method="post" action="arithmetic">
            <h1>Arithmetic Calculator</h1>
            First: <input type="text" name="first" value="${first}"><br>
            Second: <input type="text" name="second" value="${second}"><br>
            <input type="submit" name="add" value="+">
            <input type="submit" name="subtract" value="-">
            <input type="submit" name="multiply" value="*">
            <input type="submit" name="modulos" value="%"><br><br>
            
            Result: <span>${resultMsg}</span>
        </form>
        <a href="age">Age Calculator</a>
    </body>
</html>
