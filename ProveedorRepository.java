import java.util.*;

public class ProveedorRepository implements Repository<Proveedor, String> {
    private Map<String, Proveedor> dataStore = new HashMap<>();

    @Override
    public Optional<Proveedor> findById(String id) {
        return Optional.ofNullable(dataStore.get(id));
    }

    @Override
    public List<Proveedor> findAll() {
        return new ArrayList<>(dataStore.values());
    }

    @Override
    public void save(Proveedor entity) {
        dataStore.put(entity.getNombre(), entity);
    }

    @Override
    public void delete(Proveedor entity) {
        dataStore.remove(entity.getNombre());
    }
}