import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int TOTAL_NOTAS = 8;
        final int NOTAS_MINIMAS_PARA_APROBAR = 76;

        System.out.print("Ingrese la cantidad de notas ya obtenidas (1 a 7): ");
        int cantidadNotasObtenidas = scanner.nextInt();

        double[] notasObtenidas = new double[cantidadNotasObtenidas];

        double sumaNotasObtenidas = 0;
        for (int i = 0; i < cantidadNotasObtenidas; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notasObtenidas[i] = scanner.nextDouble();
            sumaNotasObtenidas += notasObtenidas[i];
        }

        int cantidadNotasFaltantes = TOTAL_NOTAS - cantidadNotasObtenidas;

        double puntajeNecesarioParaAprobar = NOTAS_MINIMAS_PARA_APROBAR * TOTAL_NOTAS;

        double puntajeFaltante = puntajeNecesarioParaAprobar - sumaNotasObtenidas;

        double promedioNecesarioEnNotasFaltantes = puntajeFaltante / cantidadNotasFaltantes;

        if (promedioNecesarioEnNotasFaltantes <= 100) {
            System.out.printf("El promedio necesario en las notas faltantes para aprobar el curso es: %.2f%n", promedioNecesarioEnNotasFaltantes);
        } else {
            System.out.println("Es imposible aprobar el curso con las calificaciones obtenidas hasta ahora.");
        }

        scanner.close();
    }
}
