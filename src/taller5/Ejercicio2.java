package taller5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Ejercicio2 {

    public static double calcularPromedio(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3.0;
    }

    public static String obtenerEstado(double promedio) {
        return promedio >= 70 ? "APROBADO" : "REPROBADO";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader lector = new BufferedReader(
                new InputStreamReader(System.in));

        double n1 = Double.parseDouble(lector.readLine());
        double n2 = Double.parseDouble(lector.readLine());
        double n3 = Double.parseDouble(lector.readLine());

        double promedio = calcularPromedio(n1, n2, n3);
        String estado = obtenerEstado(promedio);

        System.out.printf(
                Locale.US,
                "Promedio: %.2f%nEstado: %s%n",
                promedio,
                estado
        );
    }
}
