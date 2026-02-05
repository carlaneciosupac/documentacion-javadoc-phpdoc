/**
 * Clase de ejemplo para demostrar el uso de Javadoc.
 * 
 * <p>Esta clase proporciona métodos para realizar operaciones matemáticas básicas.</p>
 * 
 * @author Carla Neciosup Acebedo
 * @version 1.0
 * @since 2026-02-05
 */
public class Calculadora {

    /**
     * Suma dos números enteros.
     *
     * @param a El primer número entero.
     * @param b El segundo número entero.
     * @return La suma de a y b.
     */
    public int sumar(int a, int b) {
        return a + b;
    }

    /**
     * Divide dos números.
     *
     * @param dividendo El número a dividir.
     * @param divisor El número por el cual dividir.
     * @return El resultado de la división.
     * @throws ArithmeticException Si el divisor es cero.
     */
    public double dividir(double dividendo, double divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return dividendo / divisor;
    }
}
