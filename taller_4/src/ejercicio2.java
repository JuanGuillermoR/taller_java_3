import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] productos = {"Manzanas", "Naranjas", "Plátanos", "Uvas"};
        double[] precios = {0.50, 0.75, 0.60, 1.20};

        int[] cantidades = new int[productos.length];

        for (int i = 0; i < productos.length; i++) {
            System.out.print("Ingrese la cantidad de " + productos[i] + " que desea comprar: ");
            cantidades[i] = scanner.nextInt();
        }

        double totalFactura = 0;
        for (int i = 0; i < productos.length; i++) {
            totalFactura += cantidades[i] * precios[i];
        }

        System.out.println("El valor total de la factura es: $" + totalFactura);

        scanner.close();
    }
}
