import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ReservaCancha sistema =
                new ReservaCancha();

        int opcion;

        do {

            System.out.println("\n===== MENU =====");

            System.out.println("1. Registrar cliente");
            System.out.println("2. Registrar reserva");
            System.out.println("3. Actualizar reserva");
            System.out.println("4. Eliminar reserva");
            System.out.println("5. Mostrar reservas");
            System.out.println("6. Calcular total horas");
            System.out.println("7. Cliente mayor reserva");
            System.out.println("8. Buscar cliente");
            System.out.println("9. Mostrar clientes");
            System.out.println("10. Cantidad reservas");
            System.out.println("11. Salir");

            System.out.print("Opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print(
                            "Cedula: ");
                    String cedula =
                            sc.nextLine();

                    System.out.print(
                            "Nombre: ");
                    String nombre =
                            sc.nextLine();

                    System.out.print(
                            "Edad: ");
                    int edad =
                            sc.nextInt();
                    sc.nextLine();

                    System.out.print(
                            "Telefono: ");
                    String telefono =
                            sc.nextLine();

                    Cliente c =
                            new Cliente(
                                    cedula,
                                    nombre,
                                    edad,
                                    telefono
                            );

                    sistema.registrarCliente(
                            c);

                    break;

                case 2:

                    System.out.print(
                            "Cedula cliente: ");

                    String ced =
                            sc.nextLine();

                    System.out.print(
                            "Horas: ");

                    int horas =
                            sc.nextInt();

                    sistema.registrarReserva(
                            ced,
                            horas
                    );

                    break;

                case 3:

                    System.out.print(
                            "Cedula: ");

                    String cedAct =
                            sc.nextLine();

                    System.out.print(
                            "Nuevas horas: ");

                    int nuevas =
                            sc.nextInt();

                    sistema.actualizarReserva(
                            cedAct,
                            nuevas
                    );

                    break;

                case 4:

                    System.out.print(
                            "Cedula: ");

                    String cedElim =
                            sc.nextLine();

                    sistema.eliminarReserva(
                            cedElim);

                    break;

                case 5:

                    sistema.mostrarReservas();

                    break;

                case 6:

                    System.out.println(
                            "Total horas: "
                                    + sistema.calcularTotalHoras());

                    break;

                case 7:

                    System.out.println(
                            sistema.clienteMayorReserva());

                    break;

                case 8:

                    System.out.print(
                            "Cedula: ");

                    String cedBuscar =
                            sc.nextLine();

                    Cliente cli =
                            sistema.buscarPorCedula(
                                    cedBuscar);

                    if (cli != null)

                        System.out.println(
                                cli);

                    else

                        System.out.println(
                                "No encontrado");

                    break;

                case 9:

                    System.out.println(
                            "Funcion mostrar clientes");

                    break;

                case 10:

                    System.out.println(
                            "Cantidad reservas: "
                                    + sistema.calcularTotalHoras());

                    break;

                case 11:

                    System.out.println(
                            "Saliendo...");

                    break;

                default:

                    System.out.println(
                            "Opcion invalida");

            }

        } while (opcion != 11);

        sc.close();

    }
}