package taller5;

import java.util.Locale;
import javax.swing.JOptionPane;

public class Ejercicio1 {

    public static double calcularPropina(double monto, double porcentaje) {
        return monto * porcentaje / 100;
    }

    public static double calcularTotal(double monto, double porcentaje) {
        return monto + calcularPropina(monto, porcentaje);
    }

    public static void main(String[] args) {
        String entradaMonto = JOptionPane.showInputDialog(
                null, "Ingresa el monto de la cuenta:");
        if (entradaMonto == null) {
            return;
        }

        String entradaPorcentaje = JOptionPane.showInputDialog(
                null, "Ingresa el porcentaje de propina:");
        if (entradaPorcentaje == null) {
            return;
        }

        double monto = Double.parseDouble(entradaMonto);
        double porcentaje = Double.parseDouble(entradaPorcentaje);

        double propina = calcularPropina(monto, porcentaje);
        double total = calcularTotal(monto, porcentaje);

        String resultado = String.format(
                Locale.US,
                "Propina: $%.2f%nTotal: $%.2f",
                propina,
                total
        );

        JOptionPane.showMessageDialog(null, resultado);
    }
}
