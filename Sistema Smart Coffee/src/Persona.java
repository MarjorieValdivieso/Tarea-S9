public class Persona {
    private String nombre;
    private String correo;
    private int edad;

    public Persona(String nombre, String correo, int edad) {
        this.nombre = nombre;
        setCorreo(correo);
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        if(correo.contains("@")){
            this.correo = correo;
        }else{
            System.out.println("Correo invalido");
            this.correo=null;
        }
    }

    public void setEdad(int edad) {

        if(edad>=18 && edad<=60){
            this.edad = edad;
        }else{
            System.out.println("Edad invalida");
        }   this.edad=0;

    }
    @Override
    public String toString (){

        return "Nombre: " + nombre +
                " | Correo: " + correo +
                " | Edad: " + edad;

    }
}
