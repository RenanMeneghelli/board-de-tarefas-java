public class TarefaService {
    private TarefaDAO tarefaDAO = new TarefaDAO();

    public void adicionarTarefa(Tarefa tarefa) {
        tarefaDAO.adicionarTarefa(tarefa);
    }

    public List<Tarefa> listarTarefas() {
        return tarefaDAO.listarTarefas();
    }

    public void editarTarefa(int id, String novoStatus) {
        tarefaDAO.editarTarefa(id, novoStatus);
    }

    public void removerTarefa(int id) {
        tarefaDAO.removerTarefa(id);
    }
}
