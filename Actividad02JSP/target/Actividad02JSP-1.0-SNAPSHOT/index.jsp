<%-- 
    Document   : index
    Created on : 17 nov 2023, 21:59:26
    Author     : orla3
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Resolver Ecuación de Segundo Grado</title>
</head>
<body>
    <h1>Resolver Ecuación de Segundo Grado</h1>
    <form action="ResolverEcuacionServlet" method="post">
        <label for="coeficienteA">Coeficiente a:</label>
        <input type="text" id="coeficienteA" name="a"><br>

        <label for="coeficienteB">Coeficiente b:</label>
        <input type="text" id="coeficienteB" name="b"><br>

        <label for="coeficienteC">Coeficiente c:</label>
        <input type="text" id="coeficienteC" name="c"><br>

        <input type="submit" value="Resolver">
    </form>
</body>
</html>