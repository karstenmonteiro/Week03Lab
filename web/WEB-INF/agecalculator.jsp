<%-- 
    Document   : agecalculator
    Created on : 23-Jan-2023, 5:07:22 PM
    Author     : Karsten Monteiro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <!-- form -->
        <form method="post" action="age">
            Enter your age: <input type="text" name="age"><br>
            <input type="submit" value="Age next birthday">
            <!-- result messages -->
            <div>
                <span>${nullValueMsg}</span>
                <span>${invalidValueMsg}</span>
                <span>${nextAgeMsg}</span>
            </div>
        </form>
        <!-- link to arithmetic calculator -->
        <a href="arithmetic">Arithmetic Calculator</a>
    </body>
</html>
