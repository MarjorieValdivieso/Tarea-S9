public class Cliente {

    private String cedula;
    private String nombre;
    private int edad;
    private String telefono;

    public Cliente(String cedula, String nombre,
                   int edad, String telefono) {

        setCedula(cedula);
        setNombre(nombre);
        setEdad(edad);
        setTelefono(telefono);
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setCedula(String cedula) {

        if (cedula == null ||
                !cedula.matches("\\d{10}")) {

            throw new IllegalArgumentException(
                    "Cedula invalida");
        }

        this.cedula = cedula;
    }

    public void setNombre(String nombre) {

        if (nombre == null ||
                nombre.trim().isEmpty()) {

            throw new IllegalArgumentException(
                    "Nombre invalido");
        }

        this.nombre = nombre;
    }

    public void setEdad(int edad) {

        if (edad < 15 || edad > 60) {

            throw new IllegalArgumentException(
                    "Edad invalida");
        }

        this.edad = edad;
    }

    public void setTelefono(String telefono) {

        if (telefono == null ||
                !telefono.matches("\\d+")) {

            throw new IllegalArgumentException(
                    "Telefono invalido");
        }

        this.telefono = telefono;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;

        if (!(obj instanceof Cliente))
            return false;

        Cliente otro = (Cliente) obj;

        return cedula.equals(otro.cedula);
    }

    @Override
    public int hashCode() {

        return cedula.hashCode();

    }

    @Override
    public String toString() {

        return "Cliente{" +
                "cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}