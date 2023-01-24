<%-- 
    Document   : arithmeticcalculator
    Created on : 23-Jan-2023, 5:32:37 PM
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
        <h1>Arithmetic Calculator</h1>
        <!-- form -->
        <form method="post" action="arithmetic">
            First: <input type="text" name="first" value="${first}"><br>
            Second: <input type="text" name="second" value="${second}"><br>
            <input type="submit" name="add" value="+">
            <input type="submit" name="subtract" value="-">
            <input type="submit" name="multiply" value="*">
            <input type="submit" name="modulos" value="%"><br><br>
            <!-- display result message -->
            Result: <span>${resultMsg}</span>
        </form>
        <!-- link to age calculator -->
        <a href="age">Age Calculator</a>
    </body>
</html>
