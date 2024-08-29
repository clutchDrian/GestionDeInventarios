import java.util.Scanner;

public class VistaPrincipal {
    private InventarioController inventarioController;
    private ProveedorController proveedorController;
    private RutaController rutaController;

    public VistaPrincipal(InventarioController inventarioController, ProveedorController proveedorController, RutaController rutaController) {
        this.inventarioController = inventarioController;
        this.proveedorController = proveedorController;
        this.rutaController = rutaController;
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1. Agregar Producto");
            System.out.println("2. Reducir Producto");
            System.out.println("3. Mostrar Inventario");
            System.out.println("4. Agregar Proveedor");
            System.out.println("5. Mostrar Proveedores");
            System.out.println("6. Agregar Ruta");
            System.out.println("7. Mostrar Rutas");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese nombre del producto: ");
                    String nombreProducto = scanner.nextLine();
                    System.out.print("Ingrese cantidad: ");
                    int cantidad = scanner.nextInt();
                    inventarioController.agregarProducto(new Producto(nombreProducto, cantidad), cantidad);
                    break;
                case 2:
                    System.out.print("Ingrese nombre del producto: ");
                    String nombreProductoRed = scanner.nextLine();
                    System.out.print("Ingrese cantidad a reducir: ");
                    int cantidadRed = scanner.nextInt();
                    inventarioController.reducirProducto(new Producto(nombreProductoRed, cantidadRed), cantidadRed);
                    break;
                case 3:
                    inventarioController.mostrarInventario();
                    break;
                case 4:
                    System.out.print("Ingrese nombre del proveedor: ");
                    String nombreProveedor = scanner.nextLine();
                    System.out.print("Ingrese contacto del proveedor: ");
                    String contacto = scanner.nextLine();
                    proveedorController.agregarProveedor(new Proveedor(nombreProveedor, contacto));
                    break;
                case 5:
                    proveedorController.mostrarProveedores();
                    break;
                case 6:
                    System.out.print("Ingrese destino de la ruta: ");
                    String destino = scanner.nextLine();
                    System.out.print("Ingrese distancia de la ruta: ");
                    int distancia = scanner.nextInt();
                    rutaController.agregarRuta(new Ruta(destino, distancia));
                    break;
                case 7:
                    rutaController.mostrarRutas();
                    break;
                case 8:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 8);
    }
}