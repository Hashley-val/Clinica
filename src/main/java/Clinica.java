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
        System.out.println(" ");
        System.out.println( " ============ INICIO DE SESIÓN =========== ");
        System.out.println(" ------------------------------------------ ");
        System.out.println(" ");
        System.out.println(" ===== SELECCIONE UNA OPCIÓN =====");
        System.out.print("Elige una opción: ");
        System.out.println(" ");
        System.out.println("1. Paciente");
        System.out.println("2. Doctor");
        System.out.println(" ");

        int tipoUsuario = scanner.nextInt();
        scanner.nextLine();

        if (tipoUsuario == 1)
        {
            System.out.println(" ===== PACIENTE ===== ");
            System.out.println(" -------------------- ");
            System.out.print("Ingresa tu Nombre(s) y apellidos: ");
            String nombres = scanner.nextLine();
            System.out.println(" ");
            System.out.print("Ingresa Correo Electrónico: ");
            String correo = scanner.nextLine();
            System.out.print("Ingrese su contraseña: ");
            String password = scanner.nextLine();

            menuPaciente(scanner);
        }
        else if (tipoUsuario == 2)
        {
            System.out.println(" ===== DOCTOR ===== ");
            System.out.println(" -------------------- ");
            System.out.print("Ingresa tu Nombre(s) y apellidos: ");
            String nombreDoctor = scanner.nextLine();
            System.out.print("Ingresa Cédula Profecional: ");
            String cedulaDoctor = scanner.nextLine();
            System.out.print("Ingresa Correo Electrónico: ");
            String correoDoctor = scanner.nextLine();
            System.out.print("Ingrese su contraseña: ");
            String passwordDoctor = scanner.nextLine();
            System.out.println(" ");

            System.out.println(" Bienvenido Dr(a)" + nombreDoctor + "( Cédula:" + cedulaDoctor + ")!");
            MenuDoctor(scanner);
        }
        else
        {
            System.out.println(" Opción no válida. ");
        }

    }

    private static void MenuDoctor(Scanner scanner)
    {
    }

    private static void menuPaciente(Scanner scanner)
    {
        int opcionPaciente = 0;
        while (opcionPaciente != 3)
        {
            System.out.println(" =================================== ");
            System.out.println("      MENÚ PRINCIPAL - PACIENTE   ");
            System.out.println(" =================================== ");
            System.out.println(" ");
            System.out.println(" Elige una opción: ");
            System.out.println("1. Gestión de Agenda y Citas (Agendar / Modificar / Cancelar)");
            System.out.println("2. Ver mi Expediente / Historia Clínica");
            System.out.println("3. Cerrar Sesión");

            opcionPaciente = scanner.nextInt();
            scanner.nextLine();

            switch (opcionPaciente)
            {
                case 1:
                    menuCitas(scanner);
                    break;
                case 2:
                    System.out.println(" ");
                    System.out.println(" ========== EXPEDIENTE DIGITAL ==========  ");
                    System.out.println(" ----------------------------------------- ");
                    System.out.println("Consultando historial clínico y tratamientos...");
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("Cerrando sesión...");
                    break;
                default:
                    System.out.println(" ");
                    System.out.println("Opción no válida.");
            }
        }
    }

    private static void menuCitas(Scanner scanner)
    {
        
    }

    private static void MenuRegistro(Scanner scanner)
    {
        System.out.println(" ");
        System.out.println(" ====== MÓDULO DE REGISTRO ======");
        System.out.println(" --------------------------------");
        System.out.println(" ");
        System.out.print("Ingresa tu Nombre(s): ");
        String nombres = scanner.nextLine();
        System.out.println(" ");
        System.out.print("Ingresa tus Apellidos: ");
        String apellidos = scanner.nextLine();
        System.out.println(" ");
        System.out.print("Ingresa tu fecha de nacimiento (DD/MM/AAAA): ");
        String fechaNacimiento = scanner.nextLine();
        System.out.println(" ");
        System.out.print("Ingresa Correo Electrónico: ");
        String correo = scanner.nextLine();
        System.out.println(" ");
        System.out.print("Ingresa número de teléfono: ");
        String telefono = scanner.nextLine();
        System.out.println(" ");
        System.out.print("Ingresa una contraseña: ");
        String password = scanner.nextLine();
        System.out.println(" ");
        System.out.print("Confirmación de contraseña: ");
        String confirmarPassword = scanner.nextLine();
        System.out.println(" ");

        if (password.equals(confirmarPassword))
        {
            System.out.println(" ");
            System.out.println("¡Registro exitoso! Bienvenido a DentalConnect, " + nombres + " " + apellidos + ".");
            System.out.println(" ");
        }
        else
        {
            System.out.println(" ");
            System.out.println("Error: Las contraseñas no coinciden. Intenta registrarte de nuevo.");
            System.out.println(" ");
        }
    }

    private static void MenuPublico(Scanner scanner)
    {
        int opcion = 0;
        while (opcion != 3)
        {
            System.out.println(" ");
            System.out.println("======== VISOR PÚBLICO ========");
            System.out.println("----------------------");
            System.out.print("Elige una opción: ");
            System.out.println(" ");
            System.out.println("1. Ver Ubicación del Consultorio");
            System.out.println("2. Ver Catálogo de Servicios y Precios");
            System.out.println("3. Regresar");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion)
            {
                case 1:
                    System.out.println(" ");
                    System.out.println("   ======== UBICACIÓN ========   ");
                    System.out.println(" ------------------------------- ");
                    System.out.println("Avenida Chiapas N. 388, Ecatepec.");
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println(" ");
                    System.out.println(" ==== CATÁLOGO DE SERVICIOS Y PRECIOS ==== ");
                    System.out.println(" ----------------------------------------- ");
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