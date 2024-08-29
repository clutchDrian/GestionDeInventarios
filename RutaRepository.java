import java.util.*;

public class RutaRepository implements Repository<Ruta, String> {
    private Map<String, Ruta> dataStore = new HashMap<>();

    @Override
    public Optional<Ruta> findById(String id) {
        return Optional.ofNullable(dataStore.get(id));
    }

    @Override
    public List<Ruta> findAll() {
        return new ArrayList<>(dataStore.values());
    }

    @Override
    public void save(Ruta entity) {
        dataStore.put(entity.getDestino(), entity);
    }

    @Override
    public void delete(Ruta entity) {
        dataStore.remove(entity.getDestino());
    }
}