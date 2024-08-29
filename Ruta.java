public class Ruta {
    private String destino;
    private int distancia;

    public Ruta(String destino, int distancia) {
        this.destino = destino;
        this.distancia = distancia;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    @Override
    public String toString() {
        return "Ruta{" +
                "destino='" + destino + '\'' +
                ", distancia=" + distancia +
                '}';
    }
}