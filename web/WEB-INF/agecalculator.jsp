<%-- 
    Document   : agecalculator
    Created on : 21-Sep-2022, 1:25:10 AM
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
        <!-- form -->
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            Enter your age: <input type="text" name="age"><br><br>
            <input type="submit" value="Age next birthday"><br>
            
            <div>
                <span>${nullErrorMsg}</span>
                <span>${charErrorMsg}</span>
                <span>${nextAgeMsg}</span>
            </div>
            <a href="arithmetic">Arithmetic Calculator</a>
        </form>
    </body>
</html>