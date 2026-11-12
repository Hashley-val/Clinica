import java.util.Scanner;

public class Clinica
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int opcPrincipal = 0;

        while (opcPrincipal != 4)
        {
            System.out.println("========================================");
            System.out.println("      DENTAL CONNECT - BIENVENIDO       ");
            System.out.println("========================================");
            System.out.println("Cuidamos de ti y de tu sonrisa ");
            System.out.println("----------------------------------------");
            System.out.println(" ");
            System.out.println("Elige una opción: ");
            System.out.println("1. Visor Público");
            System.out.println("2. Registrarse");
            System.out.println("3. Iniciar sesión");
            System.out.println("4. Salir");

            opcPrincipal = scanner.nextInt();
            scanner.nextLine();

            switch (opcPrincipal)
            {
                case 1:
                    MenuPublico(scanner);
                    break;
                case 2:
                    MenuRegistro(scanner);
                    break;
                case 3:
                    MenuInicioSesion(scanner);
                    break;
                case 4:
                    System.out.println("Saliendo del sistema. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        scanner.close();
    }

    private static void MenuInicioSesion(Scanner scanner)
    {
    }

    private static void MenuRegistro(Scanner scanner)
    {
    }

    private static void MenuPublico(Scanner scanner)
    {
        int opcion = 0;
        while (opcion != 3)
        {
            System.out.println("======== VISOR PÚBLICO ========");
            System.out.println("----------------------");
            System.out.print("Elige una opción: ");
            System.out.println(" ");
            System.out.println("1. Ver Ubicación del Consultorio");
            System.out.println("2. Ver Catálogo de Servicios y Precios");
            System.out.println("3. Regresar");
            System.out.print("Elige una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion)
            {
                case 1:
                    System.out.println("Ubicación: Avenida Chiapas N. 388, Ecatepec.");
                    break;
                case 2:
                    System.out.println("==== CATÁLOGO DE SERVICIOS Y PRECIOS ====");
                    System.out.println("* Ortodoncia: $15,000");
                    System.out.println("* Endodoncia: $2,500");
                    System.out.println("* Extracción: $700");
                    System.out.println("* Limpieza: $500");
                    break;
                case 3:
                    System.out.println("Regresando...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}