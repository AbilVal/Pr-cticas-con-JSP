<%-- 
    Document   : resultados
    Created on : 17 nov 2023, 22:17:49
    Author     : orla3
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Resultados</title>
</head>
<body>
    <h1>Resultados de la Ecuación de Segundo Grado</h1>
    <p>Raíz 1: <%= request.getAttribute("raiz1") %></p>
    <p>Raíz 2: <%= request.getAttribute("raiz2") %></p>
</body>
</html>