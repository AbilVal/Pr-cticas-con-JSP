package formulageneral;

/**
 *
 * @author orla3
 */
public class Raices {
    public static void calcularRaicesReales(double a, double b, double discriminante, EcuacionSegundoGrado ecuacion) {
        double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
        double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
        ecuacion.setRaices(raiz1, raiz2);
    }

    public static void calcularRaicesIguales(double a, double b, EcuacionSegundoGrado ecuacion) {
        double raiz = -b / (2 * a);
        ecuacion.setRaices(raiz, raiz);
    }

    public static void calcularRaicesComplejas(double a, double b, double discriminante, EcuacionSegundoGrado ecuacion) {
        double realPart = -b / (2 * a);
        double imagPart = Math.sqrt(Math.abs(discriminante)) / (2 * a);
        double raiz1 = realPart + imagPart;
        double raiz2 = realPart - imagPart;
        ecuacion.setRaices(raiz1, raiz2);
    }
}