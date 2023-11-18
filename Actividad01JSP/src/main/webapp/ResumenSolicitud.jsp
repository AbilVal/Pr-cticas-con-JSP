<%-- 
    Document   : ResumenSolicitud
    Created on : 17 nov 2023, 20:33:24
    Author     : orla3
--%>

<%@ page import="rsoliserver.Estudiante" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Resumen de Solicitud de Beca</title>
</head>
<body>
    <%
    // Obtener el objeto Estudiante desde el atributo de la solicitud
    Estudiante estudiante = (Estudiante) request.getAttribute("estudiante");

    // Imprimir detalles del estudiante para verificar
    System.out.println("Estudiante en ResumenSolicitud.jsp: " + estudiante);

    // Verificar si el objeto Estudiante no es nulo antes de mostrar los detalles
    if (estudiante != null) {
    %>

    <p><strong>Nombre: </strong><%= estudiante.getNombre() %></p>
    <p><strong>Apellido Paterno: </strong><%= estudiante.getApellidoPaterno() %></p>
    <p><strong>Apellido Materno: </strong><%= estudiante.getApellidoMaterno() %></p>
    <p><strong>Teléfono: </strong><%= estudiante.getTelefono() %></p>
    <p><strong>Email: </strong><%= estudiante.getEmail() %></p>
    <p><strong>Nombre de Universidad: </strong><%= estudiante.getNombreUniversidad() %></p>
    <p><strong>Carrera: </strong><%= estudiante.getCarrera() %></p>
    <p><strong>Semestre: </strong><%= estudiante.getSemestre() %></p>
    <p><strong>Matrícula o Control: </strong><%= estudiante.getMatricula() %></p>
    <p><strong>Motivo de la Solicitud de Beca: </strong><%= estudiante.getMotivo() %></p>

    <%
        } else {
    %>
    <p>No se encontraron detalles de la solicitud.</p>
    <%
        }
    %>

    <a href="index.jsp">Regresar</a>
</body>
</html>