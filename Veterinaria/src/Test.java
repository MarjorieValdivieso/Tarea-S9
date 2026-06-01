import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ControlVacunas sistema = new ControlVacunas();

        int op;

        do {

            System.out.println("\n--- MENU ---");
            System.out.println("1. Registrar mascota");
            System.out.println("2. Registrar vacuna");
            System.out.println("3. Actualizar vacuna");
            System.out.println("4. Eliminar vacuna");
            System.out.println("5. Mostrar vacunas");
            System.out.println("6. Salir");

            System.out.print("Opcion: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {

                case 1:

                    System.out.print("Codigo: ");
                    String c = sc.nextLine();

                    System.out.print("Nombre: ");
                    String n = sc.nextLine();

                    System.out.print("Edad: ");
                    int e = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Tipo: ");
                    String t = sc.nextLine();

                    sistema.registrarMascota(
                            new Mascota(c, n, e, t));

                    break;

                case 2:

                    System.out.print("Codigo: ");
                    String c2 = sc.nextLine();

                    System.out.print("Vacuna: ");
                    String v2 = sc.nextLine();

                    sistema.registrarVacuna(c2, v2);
                    break;

                case 3:

                    System.out.print("Codigo: ");
                    String c3 = sc.nextLine();

                    System.out.print("Vacuna nueva: ");
                    String v3 = sc.nextLine();

                    sistema.actualizarVacuna(c3, v3);
                    break;

                case 4:

                    System.out.print("Codigo: ");
                    String c4 = sc.nextLine();

                    sistema.eliminarVacuna(c4);
                    break;

                case 5:

                    sistema.mostrarVacunas();
                    break;

                case 6:

                    System.out.println("Saliendo...");
                    break;

                default:

                    System.out.println("Opción inválida");
            }

        } while (op != 6);

        sc.close();
    }
}