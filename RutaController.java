import java.util.List;

public class RutaController {
    private RutaRepository rutaRepo;

    public RutaController(RutaRepository rutaRepo) {
        this.rutaRepo = rutaRepo;
    }

    public void agregarRuta(Ruta ruta) {
        rutaRepo.save(ruta);
        System.out.println("Ruta agregada: " + ruta.getDestino());
    }

    public void mostrarRutas() {
        List<Ruta> rutas = rutaRepo.findAll();
        rutas.forEach(System.out::println);
    }
}
