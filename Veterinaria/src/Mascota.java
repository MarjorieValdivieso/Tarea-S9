import java.math.MathContext;

public class Mascota {
    private String nombre;
    private String codigo;
    private int edad;
    private String tipo;

    public Mascota(String nombre, String codigo, int edad, String tipo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.edad = edad;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        if(nombre==null || nombre.trim().isEmpty()){
            throw new IllegalArgumentException("Nombre vacio");

        }
        this.nombre=nombre;
    }

    public void setCodigo(String codigo) {
        if(codigo==null || codigo.trim().isEmpty()){
            throw new IllegalArgumentException("El codigo no puede estar vacio");
        }
        this.codigo=codigo;
    }

    public void setEdad(int edad) {
        if(edad<0 || edad>20){
            throw new IllegalArgumentException("La edad debe estar entre 0 y 20 anios");

        }
        this.edad=edad;
    }

    public void setTipo(String tipo) {
        if(tipo.equals("Perro")|| tipo.equals("Gato")||tipo.equals("Conejo")|| tipo.equals("Otro")){
            this.tipo=tipo;
        }else{
            throw new IllegalArgumentException("Tipo invalido");
        }
    }
    @Override
    public boolean equals(Object obj){
       if (this==obj)return true;
        if(!(obj instanceof Mascota) )
            return false;
        Mascota otro=(Mascota) obj;
        return this.codigo.equals(otro.codigo);
    }

    @Override
    public int hashCode() {
        return codigo.hashCode();
    }
    @Override
    public String toString(){
        return ("Nombre"+nombre
        +"|edad: "+edad+"|tipo: "+tipo+
                "Codigo"+codigo);
    }
}
