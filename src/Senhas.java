public class Senhas {
    private String fila;
    private int numeroSequencial;

    public Senhas(String fila, int numeroSequencial) {
        this.fila = fila;
        this.numeroSequencial = numeroSequencial;
    }

    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    public int getNumeroSequencial() {
        return numeroSequencial;
    }

    public void setNumeroSequencial(int numeroSequencial) {
        this.numeroSequencial = numeroSequencial;
    }

}
