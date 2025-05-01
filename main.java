import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TarefaService tarefaService = new TarefaService();
        Scanner scanner = new Scanner(System.in);

        // Adicionar algumas tarefas iniciais
        tarefaService.adicionarTarefa(new Tarefa(1, "Estudar Java", "Estudar conceitos de OOP", "Pendente"));
        tarefaService.adicionarTarefa(new Tarefa(2, "Fazer compras", "Comprar alimentos e bebidas", "Concluída"));

        // Interação com o usuário
        while (true) {
            System.out.println("1. Listar Tarefas");
            System.out.println("2. Adicionar Tarefa");
            System.out.println("3. Editar Tarefa");
            System.out.println("4. Remover Tarefa");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer

            if (opcao == 1) {
                List<Tarefa> tarefas = tarefaService.listarTarefas();
                for (Tarefa t : tarefas) {
                    System.out.println("ID: " + t.getId() + ", Título: " + t.getTitulo() + ", Status: " + t.getStatus());
                }
            } else if (opcao == 2) {
                System.out.print("Título: ");
                String titulo = scanner.nextLine();
                System.out.print("Descrição: ");
                String descricao = scanner.nextLine();
                System.out.print("Status: ");
                String status = scanner.nextLine();

                Tarefa tarefa = new Tarefa(tarefaService.listarTarefas().size() + 1, titulo, descricao, status);
                tarefaService.adicionarTarefa(tarefa);
            } else if (opcao == 3) {
                System.out.print("ID da Tarefa a editar: ");
                int id = scanner.nextInt();
                scanner.nextLine();  // Limpar o buffer
                System.out.print("Novo Status: ");
                String status = scanner.nextLine();
                tarefaService.editarTarefa(id, status);
            } else if (opcao == 4) {
                System.out.print("ID da Tarefa a remover: ");
                int id = scanner.nextInt();
                tarefaService.removerTarefa(id);
            } else if (opcao == 5) {
                break;
            }
        }

        scanner.close();
    }
}
