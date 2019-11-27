<%--
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="dima.home.controlers.CalculatorJsp" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<html>
<head>
    <title>Calculator</title>
    <link rel="stylesheet" href="css/styles.css" type="text/css">
</head>
<body>

    <h2>${result}</h2>
    <form action="first" method="POST">
        <label for="a">param1</label>
        <input type="text" name="a" id="a">
        <br>
        <label for="b">param2</label>
        <input type="text" name="b" id="b">
        <br>
        <select name="do" id="do" class="form-style-2">
            <option value="add">add</option>
            <option value="dif">diference</option>
            <option value="pro">product</option>
            <option value="div">division</option>
        </select>
        <input type="submit" value="equals">
    </form>
</body>
</html>
