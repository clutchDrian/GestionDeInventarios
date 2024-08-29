import java.util.*;

public class InventarioRepository implements Repository<Producto, String> {
    private Map<String, Producto> dataStore = new HashMap<>();

    @Override
    public Optional<Producto> findById(String id) {
        return Optional.ofNullable(dataStore.get(id));
    }

    @Override
    public List<Producto> findAll() {
        return new ArrayList<>(dataStore.values());
    }

    @Override
    public void save(Producto entity) {
        dataStore.put(entity.getNombre(), entity);
    }

    @Override
    public void delete(Producto entity) {
        dataStore.remove(entity.getNombre());
    }
}