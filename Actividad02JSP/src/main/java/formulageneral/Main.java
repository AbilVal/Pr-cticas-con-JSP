package formulageneral;

/**
 *
 * @author orla3
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el coeficiente a:");
        double a = scanner.nextDouble();

        System.out.println("Ingrese el coeficiente b:");
        double b = scanner.nextDouble();

        System.out.println("Ingrese el coeficiente c:");
        double c = scanner.nextDouble();

        EcuacionSegundoGrado ecuacion = new EcuacionSegundoGrado(a, b, c);
        ecuacion.resolverEcuacion();
        double raiz1 = ecuacion.getRaiz1();
        double raiz2 = ecuacion.getRaiz2();
        ArchivoUtil.guardarEnArchivo("resultados.txt", a, b, c, raiz1, raiz2);

        scanner.close();
    }
}