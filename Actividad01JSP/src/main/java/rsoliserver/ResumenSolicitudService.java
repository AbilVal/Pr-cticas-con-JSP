package rsoliserver;

import jakarta.servlet.http.HttpServletRequest;

/**
 *
 * @author orla3
 */
public class ResumenSolicitudService {
    public static Estudiante obtenerEstudianteDesdeRequest(HttpServletRequest request) {
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

        // Imprimir valores para verificar
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Apellido Paterno: " + estudiante.getApellidoPaterno());
        System.out.println("Apellido Materno: " + estudiante.getApellidoMaterno());
        System.out.println("Teléfono: " + estudiante.getTelefono());
        System.out.println("Email: " + estudiante.getEmail());
        System.out.println("Nombre de Universidad: " + estudiante.getNombreUniversidad());
        System.out.println("Carrera: " + estudiante.getCarrera());
        System.out.println("Semestre: " + estudiante.getSemestre());
        System.out.println("Matrícula o Control: " + estudiante.getMatricula());
        System.out.println("Motivo de la Solicitud de Beca: " + estudiante.getMotivo());

        return estudiante;
    }
}