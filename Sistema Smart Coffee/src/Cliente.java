import java.util.Objects;
public class Cliente extends Persona{
    private String codigoCliente;
    private String tipoMembresia;

    public Cliente(String nombre, String correo, int edad, String codigoCliente, String tipoMembresia) {
        super(nombre, correo, edad);
        setTipoMembresia(tipoMembresia);
        this.codigoCliente = codigoCliente;

    }

    public String getTipoMembresia() {
        return tipoMembresia;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setTipoMembresia(String tipoMembresia) {
        if(tipoMembresia.equalsIgnoreCase("Gold")
                ||(tipoMembresia.equalsIgnoreCase("Silver"))||
                (tipoMembresia.equalsIgnoreCase("Premium"))){
            this.tipoMembresia = tipoMembresia;
        }else{
            System.out.println("Membresia invalido");
        }

    }

    @Override
    public String toString() {
        return super.toString()+"| Codigo: "+codigoCliente+
                "| Membresia: "+tipoMembresia;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoCliente);

    }

    @Override
    public boolean equals(Object obj) {
        Cliente c=(Cliente) obj;
        return codigoCliente.equals(c.codigoCliente);
    }
}
