<%-- 
    Document   : index
    Created on : 17 nov 2023, 18:55:08
    Author     : orla3
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Solicitud de Beca</title>
</head>
<body>
    <h2>Formulario de Solicitud de Beca</h2>
    <form action="SolicitudServlet" method="post">
        <label for="nombre">Nombre:</label>
        <input type="text" id="nombre" name="nombre" required><br>

        <label for="apellidoPaterno">Apellido Paterno:</label>
        <input type="text" id="apellidoPaterno" name="apellidoPaterno" required><br>

        <label for="apellidoMaterno">Apellido Materno:</label>
        <input type="text" id="apellidoMaterno" name="apellidoMaterno" required><br>

        <label for="telefono">Teléfono:</label>
        <input type="text" id="telefono" name="telefono" required><br>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br>

        <label for="nombreUniversidad">Nombre de Universidad:</label>
        <input type="text" id="nombreUniversidad" name="nombreUniversidad" required><br>

        <label for="carrera">Carrera:</label>
        <input type="text" id="carrera" name="carrera" required><br>

        <label for="semestre">Semestre:</label>
        <input type="text" id="semestre" name="semestre" required><br>

        <label for="matricula">Matrícula o Control:</label>
        <input type="text" id="matricula" name="matricula" required><br>

        <label for="motivo">Motivo de la Solicitud de Beca:</label>
        <textarea id="motivo" name="motivo" required></textarea><br>

        <input type="submit" value="Enviar Solicitud">
    </form>
</body>
</html>