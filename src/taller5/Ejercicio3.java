package taller5;

import java.util.Locale;
import javax.swing.JOptionPane;

public class Ejercicio3 {

    public static double calcularArea(double base, double altura) {
        return base * altura;
    }

    public static double calcularPerimetro(double base, double altura) {
        return 2 * (base + altura);
    }

    public static void main(String[] args) {
        String entradaBase = JOptionPane.showInputDialog(
                null, "Ingresa la base del rectángulo:");
        if (entradaBase == null) {
            return;
        }

        String entradaAltura = JOptionPane.showInputDialog(
                null, "Ingresa la altura del rectángulo:");
        if (entradaAltura == null) {
            return;
        }

        double base = Double.parseDouble(entradaBase);
        double altura = Double.parseDouble(entradaAltura);

        double area = calcularArea(base, altura);
        double perimetro = calcularPerimetro(base, altura);

        String resultado = String.format(
                Locale.US,
                "Área: %.2f%nPerímetro: %.2f",
                area,
                perimetro
        );

        JOptionPane.showMessageDialog(null, resultado);
    }
}
