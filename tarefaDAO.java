import java.util.ArrayList;
import java.util.List;

public class TarefaDAO {
    private List<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public List<Tarefa> listarTarefas() {
        return tarefas;
    }

    public void editarTarefa(int id, String novoStatus) {
        for (Tarefa t : tarefas) {
            if (t.getId() == id) {
                t.setStatus(novoStatus);
            }
        }
    }

    public void removerTarefa(int id) {
        tarefas.removeIf(t -> t.getId() == id);
    }
}
