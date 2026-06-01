public class Mascota {

    private String codigo;
    private String nombre;
    private int edad;
    private String tipo;

    public Mascota(String codigo, String nombre, int edad, String tipo) {
        setCodigo(codigo);
        setNombre(nombre);
        setEdad(edad);
        setTipo(tipo);
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setCodigo(String codigo) {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("Codigo vacio");
        }
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("Nombre vacio");
        }
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if (edad < 0 || edad > 20) {
            throw new IllegalArgumentException("Edad debe ser 0-20");
        }
        this.edad = edad;
    }

    public void setTipo(String tipo) {
        if (tipo.equals("Perro") ||
                tipo.equals("Gato") ||
                tipo.equals("Conejo") ||
                tipo.equals("Otro")) {
            this.tipo = tipo;
        } else {
            throw new IllegalArgumentException("Tipo invalido");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Mascota)) return false;

        Mascota m = (Mascota) obj;
        return codigo.equals(m.codigo);
    }

    @Override
    public int hashCode() {
        return codigo.hashCode();
    }

    @Override
    public String toString() {
        return codigo + " | " + nombre + " | " + edad + " | " + tipo;
    }
}