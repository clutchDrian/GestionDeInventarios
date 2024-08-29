public class SistemaGestion {
    public static void main(String[] args) {
        InventarioRepository inventarioRepo = new InventarioRepository();
        ProveedorRepository proveedorRepo = new ProveedorRepository();
        RutaRepository rutaRepo = new RutaRepository();

        InventarioController inventarioController = new InventarioController(inventarioRepo);
        ProveedorController proveedorController = new ProveedorController(proveedorRepo);
        RutaController rutaController = new RutaController(rutaRepo);

        VistaPrincipal vistaPrincipal = new VistaPrincipal(inventarioController, proveedorController, rutaController);
        vistaPrincipal.mostrarMenu();
    }
}