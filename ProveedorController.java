import java.util.List;

public class ProveedorController {
    private ProveedorRepository proveedorRepo;

    public ProveedorController(ProveedorRepository proveedorRepo) {
        this.proveedorRepo = proveedorRepo;
    }

    public void agregarProveedor(Proveedor proveedor) {
        proveedorRepo.save(proveedor);
        System.out.println("Proveedor agregado: " + proveedor.getNombre());
    }

    public void mostrarProveedores() {
        List<Proveedor> proveedores = proveedorRepo.findAll();
        proveedores.forEach(System.out::println);
    }
}
