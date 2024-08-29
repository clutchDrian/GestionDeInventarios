import java.util.*;
import java.util.stream.*;

public class Inventario {
    private Map<Producto, Integer> productos;

    public Inventario() {
        productos = new HashMap<>();
    }

    public void agregarProducto(Producto producto, int cantidad) {
        productos.put(producto, productos.getOrDefault(producto, 0) + cantidad);
    }

    public void reducirProducto(Producto producto, int cantidad) {
        productos.computeIfPresent(producto, (k, v) -> v - cantidad <= 0 ? null : v - cantidad);
    }

    public int obtenerCantidad(Producto producto) {
        return productos.getOrDefault(producto, 0);
    }

    public void mostrarInventario() {
        productos.forEach((k, v) -> System.out.println("Producto: " + k + ", Cantidad: " + v));
    }

    public List<Producto> productosBajoNivel(int umbral) {
        return productos.entrySet()
                        .stream()
                        .filter(e -> e.getValue() < umbral)
                        .map(Map.Entry::getKey)
                        .collect(Collectors.toList());
    }
}