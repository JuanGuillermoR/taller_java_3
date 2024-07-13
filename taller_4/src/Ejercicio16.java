import java.util.Scanner;

public class Ejercicio16 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese una contraseña: ");
            String password = scanner.nextLine();

            if (validatePassword(password)) {
                System.out.println("La contraseña es segura.");
            } else {
                System.out.println("La contraseña NO es segura.");
            }

            scanner.close();
        }

        public static boolean validatePassword(String password) {
            if (password.length() < 8) {
                return false;
            }

            boolean hasUppercase = false;
            boolean hasLowercase = false;
            boolean hasSpecialChar = false;

            String specialChars = "~!@#$%^&*()-_=+\\|[{]};:'\",<.>/?";

            for (char ch : password.toCharArray()) {
                if (Character.isUpperCase(ch)) {
                    hasUppercase = true;
                } else if (Character.isLowerCase(ch)) {
                    hasLowercase = true;
                } else if (specialChars.contains(String.valueOf(ch))) {
                    hasSpecialChar = true;
                }
            }

            return hasUppercase && hasLowercase && hasSpecialChar;
        }
}
