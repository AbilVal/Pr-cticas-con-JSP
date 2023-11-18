package rsoliserver;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

/**
 *
 * @author orla3
 */
@WebServlet(name = "SolicitudServlet", urlPatterns = {"/SolicitudServlet"})
public class SolicitudServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws IOException {
    // Procesar solicitud y obtener el estudiante
    Estudiante estudiante = SolicitudService.procesarSolicitud(request);

    // Almacenar el estudiante en la sesión
    HttpSession session = request.getSession();
    session.setAttribute("estudiante", estudiante);

    // Redirigir a la página de resumen de solicitud
    response.sendRedirect("ResumenSolicitudServlet");
    }
}