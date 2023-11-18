package formulageneral;

/**
 *
 * @author orla3
 */
public class EcuacionSegundoGrado {
    private double a;
    private double b;
    private double c;
    private double raiz1;
    private double raiz2;

    public EcuacionSegundoGrado(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void resolverEcuacion() {
        double discriminante = Discriminante.calcularDiscriminante(a, b, c);

        if (discriminante > 0) {
            Raices.calcularRaicesReales(a, b, discriminante, this);
        } else if (discriminante == 0) {
            Raices.calcularRaicesIguales(a, b, this);
        } else {
            Raices.calcularRaicesComplejas(a, b, discriminante, this);
        }
    }

    public void setRaices(double raiz1, double raiz2) {
        this.raiz1 = raiz1;
        this.raiz2 = raiz2;
    }

    public double getRaiz1() {
        return raiz1;
    }

    public double getRaiz2() {
        return raiz2;
    }
}