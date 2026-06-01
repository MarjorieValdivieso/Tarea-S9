import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ControlVacunas implements CrudVacuna {

    private HashSet<Mascota> mascotas = new HashSet<>();
    private HashMap<String, String> vacunas = new HashMap<>();

    @Override
    public void registrarMascota(Mascota m) {

        if (mascotas.add(m)) {
            System.out.println("Mascota registrada");
        } else {
            System.out.println("Mascota duplicada");
        }
    }

    public Mascota buscarMascota(String codigo) {

        for (Mascota m : mascotas) {
            if (m.getCodigo().equals(codigo)) {
                return m;
            }
        }
        return null;
    }

    @Override
    public void registrarVacuna(String codigo, String vacuna) {

        if (buscarMascota(codigo) == null) {
            System.out.println("Mascota no existe");
            return;
        }

        vacunas.put(codigo, vacuna);
        System.out.println("Vacuna registrada");
    }

    @Override
    public void actualizarVacuna(String codigo, String vacuna) {

        if (!vacunas.containsKey(codigo)) {
            System.out.println("Vacuna no encontrada");
            return;
        }

        vacunas.put(codigo, vacuna);
        System.out.println("Vacuna actualizada");
    }

    @Override
    public void eliminarVacuna(String codigo) {

        if (!vacunas.containsKey(codigo)) {
            System.out.println("Vacuna no encontrada");
            return;
        }

        vacunas.remove(codigo);
        System.out.println("Vacuna eliminada");
    }

    @Override
    public void mostrarVacunas() {

        if (vacunas.isEmpty()) {
            System.out.println("No hay datos disponibles.");
            return;
        }

        for (Map.Entry<String, String> e : vacunas.entrySet()) {
            System.out.println("Codigo: " + e.getKey()
                    + " | Vacuna: " + e.getValue());
        }
    }
}