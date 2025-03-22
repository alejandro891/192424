import java.util.Scanner;

public class MuyMalHecho {
    public static void main(String[] args) throws Exception {

        final int numMINIMA_EDAD=18;
        final int numLIMITE_EDAD=120;

        Scanner scanner = new Scanner(System.in);
        int numLimite = 0;

        System.out.println("Número de usuarios a ingresar:");
        int numUsuarios = scanner.nextInt();
        scanner.nextLine();

        int numEdad1 = 0, numEdad2 = 0, numedad3 = 0;
        String strNombre1 = "", strNombre2 = "", strNombre3 = "";

        while (numLimite < numUsuarios) {
            System.out.println("Nombre del usuario:");
            String strNombre = scanner.nextLine();

            System.out.println("Edad del usuario:");
            int numEdad = scanner.nextInt();
            scanner.nextLine();

            if (numLimite == 0) {
                strNombre1 = strNombre;
                numEdad1 = numEdad;
            } else if (numLimite == 1) {
                strNombre2 = strNombre;
                numEdad2 = numEdad;
            } else if (numLimite == 2) {
                strNombre3 = strNombre;
                numedad3 = numEdad;
            }

            if (numEdad >= numMINIMA_EDAD) {
                System.out.println(strNombre + " es mayor de edad.");
            } else {
                System.out.println(strNombre + " es menor de edad.");
            }

            if (numEdad > numLIMITE_EDAD || numEdad < 1) {
                System.out.println("Edad no válida.");
            }

            numLimite = numLimite + 1;
        }

        System.out.println("Resumen:");
        System.out.println("Usuario 1: " + strNombre1 + " - Edad: " + numEdad1);
        System.out.println("Usuario 2: " + strNombre2 + " - Edad: " + numEdad2);
        System.out.println("Usuario 3: " + strNombre3 + " - Edad: " + numedad3);
    }
}
