package formulageneral;

/**
 *
 * @author orla3
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ArchivoUtil {
    public static void guardarEnArchivo(String nombreArchivo, double a, double b, double c, double raiz1, double raiz2) {
        String rutaAbsoluta = "C:\\Program Files\\Apache Software Foundation\\Tomcat 10.1\\webapps\\Actividad02JSP-1.0-SNAPSHOT\\" + nombreArchivo; // Reemplaza con tu respectiva ruta
        try (PrintWriter writer = new PrintWriter(new FileWriter(rutaAbsoluta, true))) {
            writer.println("Coeficientes: a=" + a + ", b=" + b + ", c=" + c);
            writer.println("Raíz 1: " + raiz1);
            writer.println("Raíz 2: " + raiz2);
            writer.println("------------------------------");
        } catch (IOException e) {
            manejarError(e);
        }
    }

    private static void manejarError(IOException e) {
        e.printStackTrace();
    }
}