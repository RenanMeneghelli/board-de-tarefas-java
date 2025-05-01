
import java.util.List;

public class Board {
    private String nome;
    private List<Tarefa> tarefas;

    public Board(String nome, List<Tarefa> tarefas) {
        this.nome = nome;
        this.tarefas = tarefas;
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public String getNome() {
        return nome;
    }
}
