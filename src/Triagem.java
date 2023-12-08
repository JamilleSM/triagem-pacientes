import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Triagem {
    private String tipo;
    private int tempoEspera;
    private Queue<Paciente> pacientes;
    private List<Senhas> senhasChamadas;

    public Triagem(String tipo, int tempoEsperaRecomendado) {
        this.tipo = tipo;
        this.pacientes = new LinkedList<>();
        this.tempoEspera = tempoEsperaRecomendado;
        this.senhasChamadas = new ArrayList<>();
    }

}
