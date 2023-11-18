package rsoliserver;

import jakarta.servlet.ServletException;
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
@WebServlet(name = "ResumenSolicitudServlet", urlPatterns = {"/ResumenSolicitudServlet"})
public class ResumenSolicitudServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    // Obtener el estudiante desde la sesión
    HttpSession session = request.getSession();
    Estudiante estudiante = (Estudiante) session.getAttribute("estudiante");

    // Imprimir detalles del estudiante para verificar
    System.out.println("Estudiante en ResumenSolicitudServlet: " + estudiante);

    // Setear el estudiante en el request y redirigir a la página de resumen de solicitud
    request.setAttribute("estudiante", estudiante);
    request.getRequestDispatcher("/ResumenSolicitud.jsp").forward(request, response);
    }
}
