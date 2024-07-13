import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un texto:");
        String texto = scanner.nextLine();

        System.out.print("Ingrese la palabra a buscar: ");
        String palabra = scanner.nextLine();

        String textoMinusculas = texto.toLowerCase();
        String palabraMinusculas = palabra.toLowerCase();

        ArrayList<Integer> posiciones = new ArrayList<>();
        int indice = textoMinusculas.indexOf(palabraMinusculas);
        while (indice != -1) {
            posiciones.add(indice);
            indice = textoMinusculas.indexOf(palabraMinusculas, indice + 1);
        }

        if (posiciones.isEmpty()) {
            System.out.println("La palabra no se encontró en el texto.");
        } else {
            System.out.println("La palabra se encontró en las siguientes posiciones:");
            for (int pos : posiciones) {
                System.out.println("Desde la posición " + pos + " hasta la posición " + (pos + palabra.length() - 1));
            }
        }

        scanner.close();
    }
}
