import java.util.Scanner;

public class Ejercicio1 {
/*Este ejercicio propone la creación de un programa que presente al
usuario un menú interactivo para realizar operaciones matemáticas
básicas como suma, resta, multiplicación y división.*/
    public static void main(String[] args){
        int suma, resta, multipli, divi, opcion, num1, num2, resultado;

        do {
            System.out.println("escoge una opcion para realizar la consulta");
            System.out.println("1. Sumar");
            System.out.println("2. resta");
            System.out.println("3. miltipli");
            System.out.println("4. divi");
            System.out.println("5. salir");
            Scanner scanner = new Scanner(System.in);
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("---calculadora para sumar---");
                    System.out.println("ingresa el primer numero: ");
                    num1 = scanner.nextInt();
                    System.out.println("ingresa el segundo numero: ");
                    num2 = scanner.nextInt();

                    resultado = num1 + num2;
                    System.out.println("el resultado es: "+resultado);
                    break;
                case 2:
                    System.out.println("---calculadora para restar---");
                    System.out.println("ingresa el primer numero: ");
                    num1 = scanner.nextInt();
                    System.out.println("ingresa el segundo numero: ");
                    num2 = scanner.nextInt();

                    resultado = num1 - num2;
                    System.out.println("el resultado es: "+resultado);
                    break;
                case 3:
                    System.out.println("---calculadora para multiplicar---");
                    System.out.println("ingresa el primer numero: ");
                    num1 = scanner.nextInt();
                    System.out.println("ingresa el segundo numero: ");
                    num2 = scanner.nextInt();

                    resultado = num1 * num2;
                    System.out.println("el resultado es: "+resultado);
                    break;
                case 4:
                    System.out.println("---calculadora para dividir---");
                    System.out.println("ingresa el primer numero: ");
                    num1 = scanner.nextInt();
                    System.out.println("ingresa el segundo numero: ");
                    num2 = scanner.nextInt();

                    resultado = num1 / num2;
                    System.out.println("el resultado es: "+resultado);
                    break;
                case 5:
                    System.out.println("Saliendo....");
                    break;
            }
        }while (opcion != 5);
    }
}
