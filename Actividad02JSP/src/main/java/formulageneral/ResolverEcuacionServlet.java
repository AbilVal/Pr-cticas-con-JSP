package formulageneral;

import formulageneral.ArchivoUtil;
import formulageneral.EcuacionSegundoGrado;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ResolverEcuacionServlet")
public class ResolverEcuacionServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        double a = Double.parseDouble(request.getParameter("a"));
        double b = Double.parseDouble(request.getParameter("b"));
        double c = Double.parseDouble(request.getParameter("c"));

        EcuacionSegundoGrado ecuacion = new EcuacionSegundoGrado(a, b, c);
        ecuacion.resolverEcuacion();
        double raiz1 = ecuacion.getRaiz1();
        double raiz2 = ecuacion.getRaiz2();

        ArchivoUtil.guardarEnArchivo("resultados.txt", a, b, c, raiz1, raiz2);

        request.setAttribute("raiz1", raiz1);
        request.setAttribute("raiz2", raiz2);
        request.getRequestDispatcher("resultados.jsp").forward(request, response);
    }
}