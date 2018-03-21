<%@page language="java" contentType="text/html" %>



<html>
<head>
    <title>HOME PAGE</title>
</head>

<body>
<h1 align="center">Doradca piwa</h1>


<%--<form method="post" action="beerservlet/beer">--%>
<form method="post" action="/beer">
    <p>Wybierz rodzaj piwa</p>
    <select name="rodzaj" size="1">
        <option>jasne</option>
        <option>mocne</option>
        <option>ciemne</option>
        <option>dla kobiet</option>
    </select>
    <br><br>
    <input type="submit">
</form>
</body>
</html>