package taller5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import javax.swing.JOptionPane;

public class Ejercicio5 {

    public static void main(String[] args) throws IOException {
        String nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre:");
        if (nombre == null) {
            return;
        }

        String entradaEdad = JOptionPane.showInputDialog(null, "Ingresa la edad:");
        if (entradaEdad == null) {
            return;
        }

        int edad = Integer.parseInt(entradaEdad);

        BufferedReader lector = new BufferedReader(
                new InputStreamReader(System.in));

        double nota1 = Double.parseDouble(lector.readLine());
        double nota2 = Double.parseDouble(lector.readLine());
        double nota3 = Double.parseDouble(lector.readLine());

        Estudiante estudiante = new Estudiante(nombre, edad, nota1, nota2, nota3);

        System.out.printf(
                Locale.US,
                "Nombre: %s%nEdad: %d%nPromedio: %.2f%n",
                estudiante.getNombre(),
                estudiante.getEdad(),
                estudiante.getPromedio()
        );
    }
}
