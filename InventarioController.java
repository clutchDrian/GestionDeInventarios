import java.util.List;

public class InventarioController {
    private InventarioRepository inventarioRepo;

    public InventarioController(InventarioRepository inventarioRepo) {
        this.inventarioRepo = inventarioRepo;
    }

    public void agregarProducto(Producto producto, int cantidad) {
        inventarioRepo.save(producto);
        System.out.println("Producto agregado: " + producto.getNombre());
    }

    public void reducirProducto(Producto producto, int cantidad) {
        Producto p = inventarioRepo.findById(producto.getNombre()).orElse(null);
        if (p != null) {
            p.setCantidad(p.getCantidad() - cantidad);
            inventarioRepo.save(p);
            System.out.println("Producto reducido: " + producto.getNombre());
        }
    }

    public void mostrarInventario() {
        List<Producto> productos = inventarioRepo.findAll();
        productos.forEach(System.out::println);
    }
