import java.util.Scanner;

public class Clinica_1
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcCalen = 0;

        String[][] calendario = {
                {" [1] ", " [2] ", " [3] ", " [4] ", " [5] ", " [6] ", " [7] "},
                {" [8] ", " [9] ", "[10] ", "[11] ", "[12] ", "[13] ", "[14] "},
                {"[15] ", "[16] ", "[17] ", "[18] ", "[19] ", "[20] ", "[21] "},
                {"[22] ", "[23] ", "[24] ", "[25] ", "[26] ", "[27] ", "[28] "},
                {"[29] ", "[30] ", "[31] ", "  -  ", "  -  ", "  -  ", "  -  "}
        };

        while (opcCalen != 3)
        {
            System.out.println("\n=================================");
            System.out.println("  DENTAL CONNECT - CALENDARIO    ");
            System.out.println("=================================");
            System.out.println("1. Ver Calendario de Citas (Mes/Día)");
            System.out.println("2. Agendar Cita en una Fecha");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");

            opcCalen = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcCalen)
            {
                case 1:
                    System.out.println("\n--- CALENDARIO DE CITAS (MES) ---");
                    System.out.println(" Lun   Mar   Mié   Jue   Vie   Sáb   Dom");
                    System.out.println("----------------------------------------");

                    for (int i = 0; i < calendario.length; i++)
                    {
                        for (int j = 0; j < calendario[i].length; j++)
                        {
                            System.out.print(calendario[i][j] + " ");
                        }
                        System.out.println(); // Salto de línea por semana
                    }
                    System.out.println("----------------------------------------");
                    break;

                case 2:
                    System.out.println("\n--- AGENDAR CITA ---[cite: 8]");
                    System.out.print("Ingresa tu Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingresa el número de día que deseas agendar (1 al 31): ");
                    int dia = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingresa el motivo de la consulta: ");
                    String motivo = scanner.nextLine();

                    System.out.println("\n¡Cita registrada con éxito para " + nombre + " el día " + dia + "!");
                    break;

                case 3:
                    System.out.println("Saliendo del sistema de calendario. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }
        scanner.close();
    }
}