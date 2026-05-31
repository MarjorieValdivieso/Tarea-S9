import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc =
                new Scanner(System.in);

        Cafeteria cafe =
                new Cafeteria(
                        "Smart Coffee"
                );

        int op;

        do{

            System.out.println(
                    "\n===== SMART COFFEE =====");

            System.out.println(
                    "1 Registrar cliente");

            System.out.println(
                    "2 Mostrar clientes");

            System.out.println(
                    "3 Registrar pedido");

            System.out.println(
                    "4 Actualizar pedido");

            System.out.println(
                    "5 Eliminar pedido");

            System.out.println(
                    "6 Promedio consumo");

            System.out.println(
                    "7 Mejor cliente");

            System.out.println(
                    "8 Buscar cliente");

            System.out.println(
                    "9 Mostrar pedidos");

            System.out.println(
                    "10 Salir");
            System.out.println("Ingresa una opcion: ");
            op = sc.nextInt();

            sc.nextLine();

            switch(op){

                case 1:

                    System.out.print(
                            "Nombre: ");

                    String nombre =
                            sc.nextLine();

                    System.out.print(
                            "Correo: ");

                    String correo =
                            sc.nextLine();

                    System.out.print(
                            "Edad: ");

                    int edad =
                            sc.nextInt();

                    sc.nextLine();

                    System.out.print(
                            "Codigo: ");

                    String codigo =
                            sc.nextLine();

                    System.out.print(
                            "Membresia: (Gold/Silver/Premium) ");

                    String mem =
                            sc.nextLine();

                    Cliente c =
                            new Cliente(
                                    nombre,
                                    correo,
                                    edad,
                                    codigo,
                                    mem
                            );

                    cafe.registrarCliente(c);

                    break;

                case 2:

                    cafe.mostrarClientes();

                    break;

                case 3:

                    System.out.print(
                            "Correo: ");

                    correo =
                            sc.nextLine();

                    System.out.print(
                            "Consumo: ");

                    double consumo =
                            sc.nextDouble();

                    cafe.registrarPedido(
                            correo,
                            consumo
                    );

                    break;

                case 4:

                    System.out.print(
                            "Correo: ");

                    correo =
                            sc.nextLine();

                    System.out.print(
                            "Nuevo consumo: ");

                    double nuevo =
                            sc.nextDouble();

                    cafe.actualizarPedido(
                            correo,
                            nuevo
                    );

                    break;

                case 5:

                    System.out.print(
                            "Correo: ");

                    correo =
                            sc.nextLine();

                    cafe.eliminarPedido(
                            correo
                    );

                    break;

                case 6:

                    System.out.println(
                            cafe.promedioConsumo()
                    );

                    break;

                case 7:

                    cafe.mejorCliente();

                    break;

                case 8:

                    System.out.print(
                            "Correo: ");

                    correo =
                            sc.nextLine();

                    System.out.println(
                            cafe.buscarClienteCorreo(
                                    correo
                            )
                    );

                    break;

                case 9:

                    cafe.mostrarPedidos();

                    break;

            }

        }while(op != 10);

    }

}