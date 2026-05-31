import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Cafeteria implements CrudPedido {

    private String nombreCafeteria;

    HashSet<Cliente> clientes =
            new HashSet<>();

    Map<String, Double> mapaPedidos =
            new HashMap<>();

    public Cafeteria(String nombreCafeteria) {

        this.nombreCafeteria = nombreCafeteria;

    }

    public void registrarCliente(Cliente cliente){

        if(clientes.add(cliente)){

            System.out.println("Cliente agregado");

        }else{

            System.out.println("Cliente duplicado");

        }

    }

    public Cliente buscarClienteCorreo(String correo){

        for(Cliente c : clientes){

            if(c.getCorreo().equals(correo)){

                return c;

            }

        }

        return null;

    }

    public void mostrarClientes(){

        for(Cliente c : clientes){

            System.out.println(c);

        }

    }

    public void mostrarPedidos(){

        if(mapaPedidos.isEmpty()){

            System.out.println("No hay datos disponibles");

            return;

        }

        for(String correo : mapaPedidos.keySet()){

            System.out.println(
                    correo +
                            " -> " +
                            mapaPedidos.get(correo)
            );

        }

    }

    @Override
    public void registrarPedido(String correo,
                                double consumo) {

        Cliente c =
                buscarClienteCorreo(correo);

        if(c == null){

            System.out.println(
                    "Cliente inexistente"
            );

            return;

        }

        if(consumo <= 0){

            System.out.println(
                    "Consumo invalido"
            );

            return;

        }

        mapaPedidos.put(correo, consumo);

        System.out.println(
                "Pedido registrado"
        );

    }

    @Override
    public void actualizarPedido(String correo,
                                 double nuevoConsumo) {

        if(!mapaPedidos.containsKey(correo)){

            System.out.println(
                    "Pedido inexistente"
            );

            return;

        }

        if(nuevoConsumo <= 0){

            System.out.println(
                    "Consumo invalido"
            );

            return;

        }

        mapaPedidos.put(
                correo,
                nuevoConsumo
        );

        System.out.println(
                "Pedido actualizado"
        );

    }

    @Override
    public void eliminarPedido(String correo) {

        if(mapaPedidos.remove(correo)
                != null){

            System.out.println(
                    "Pedido eliminado"
            );

        }else{

            System.out.println(
                    "Pedido inexistente"
            );

        }

    }

    @Override
    public double promedioConsumo() {

        if(mapaPedidos.isEmpty()){

            System.out.println(
                    "No hay datos disponibles"
            );

            return 0;

        }

        double suma = 0;

        for(double c :
                mapaPedidos.values()){

            suma += c;

        }

        return suma /
                mapaPedidos.size();

    }

    @Override
    public void mejorCliente() {

        if(mapaPedidos.isEmpty()){

            System.out.println(
                    "No hay datos disponibles"
            );

            return;

        }

        double mayor = 0;

        String correo = "";

        for(String c :
                mapaPedidos.keySet()){

            if(mapaPedidos.get(c)
                    > mayor){

                mayor =
                        mapaPedidos.get(c);

                correo = c;

            }

        }

        System.out.println(
                "Mejor cliente: "
                        + correo
                        + " | consumo: "
                        + mayor
        );

    }

}