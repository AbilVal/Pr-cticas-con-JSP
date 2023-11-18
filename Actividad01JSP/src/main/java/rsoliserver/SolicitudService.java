package rsoliserver;

/**
 *
 * @author orla3
 */
import jakarta.servlet.http.HttpServletRequest;

public class SolicitudService {
    public static Estudiante procesarSolicitud(HttpServletRequest request) {
        // Obtener parámetros del formulario
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre(request.getParameter("nombre"));
        estudiante.setApellidoPaterno(request.getParameter("apellidoPaterno"));
        estudiante.setApellidoMaterno(request.getParameter("apellidoMaterno"));
        estudiante.setTelefono(request.getParameter("telefono"));
        estudiante.setEmail(request.getParameter("email"));
        estudiante.setNombreUniversidad(request.getParameter("nombreUniversidad"));
        estudiante.setCarrera(request.getParameter("carrera"));
        estudiante.setSemestre(request.getParameter("semestre"));
        estudiante.setMatricula(request.getParameter("matricula"));
        estudiante.setMotivo(request.getParameter("motivo"));

        System.out.println("Estudiante en SolicitudService: " + estudiante);

        return estudiante;
    }
}
