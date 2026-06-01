public interface CrudVacuna {

    void registrarMascota(Mascota m);

    void registrarVacuna(String codigo, String vacuna);

    void actualizarVacuna(String codigo, String vacuna);

    void eliminarVacuna(String codigo);

    void mostrarVacunas();
}