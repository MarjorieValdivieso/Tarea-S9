import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ReservaCancha
        implements CrudReserva {

    private HashSet<Cliente> setClientes;
    private HashMap<String, Integer> mapaReservas;

    public ReservaCancha() {

        setClientes = new HashSet<>();
        mapaReservas = new HashMap<>();

    }

    // Registrar clientes

    public void registrarCliente(
            Cliente c) {

        boolean agregado =
                setClientes.add(c);

        if (!agregado) {

            System.out.println(
                    "Error: ya existe un cliente con esa cédula.");

        } else {

            System.out.println(
                    "Cliente registrado: "
                            + c.getNombre());

        }
    }

    // Buscar cliente

    public Cliente buscarPorCedula(
            String cedula) {

        for (Cliente c : setClientes) {

            if (c.getCedula()
                    .equals(cedula)) {

                return c;

            }
        }

        return null;
    }

    @Override
    public void registrarReserva(
            String cedula,
            int horas) {

        if (buscarPorCedula(
                cedula) == null) {

            System.out.println(
                    "Error: cliente inexistente.");

            return;
        }

        if (horas < 1 ||
                horas > 5) {

            System.out.println(
                    "Error: las horas deben estar entre 1 y 5.");

            return;
        }

        mapaReservas.put(
                cedula,
                horas);

        System.out.println(
                "Reserva registrada.");
    }

    @Override
    public void actualizarReserva(
            String cedula,
            int nuevasHoras) {

        if (!mapaReservas.containsKey(
                cedula)) {

            System.out.println(
                    "Reserva no encontrada.");

            return;
        }

        mapaReservas.put(
                cedula,
                nuevasHoras);

        System.out.println(
                "Reserva actualizada.");
    }

    @Override
    public void eliminarReserva(
            String cedula) {

        if (!mapaReservas.containsKey(
                cedula)) {

            System.out.println(
                    "Reserva no encontrada.");

            return;
        }

        mapaReservas.remove(
                cedula);

        System.out.println(
                "Reserva eliminada.");
    }


    public void mostrarReservas() {

        if (mapaReservas.isEmpty()) {

            System.out.println(
                    "No hay datos disponibles.");

            return;
        }

        System.out.println(
                mapaReservas);

    }

    @Override
    public int calcularTotalHoras() {

        int total = 0;

        for (int horas :
                mapaReservas.values()) {

            total += horas;

        }

        return total;
    }
    @Override
    public String clienteMayorReserva() {

        if (mapaReservas.isEmpty()) {

            return "No hay datos disponibles.";

        }

        String cedulaMax = null;

        int max = 0;

        for (Map.Entry<String,
                Integer> e :
                mapaReservas.entrySet()) {

            if (e.getValue() > max) {

                max = e.getValue();

                cedulaMax =
                        e.getKey();
            }
        }

        Cliente c =
                buscarPorCedula(
                        cedulaMax);

        if (c != null) {

            return c.getNombre()
                    + " -> "
                    + max
                    + " horas";
        }

        return "Sin datos.";
    }
}