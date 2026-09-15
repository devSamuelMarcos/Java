import java.util.*;
public class Tarefas {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner (System.in);
        ArrayList<String> tarefas = new 
        ArrayList<>();

        while (true) {
            System.out.println("Ola oque deseja fazer?");
            Thread.sleep(450);
            System.out.println("Digite 1 para ver as tarefas");
            Thread.sleep(150);
            System.out.println("Digite 2 para Adicionar Tarefa");
            Thread.sleep(150);
            System.out.println("Digite 3 para editar uma tarefa");
            Thread.sleep(150);
            System.out.println("Digite 4 para excluir uma tarefa");
            Thread.sleep(150);
            int resposta = scanner.nextInt();
            scanner.nextLine();
            switch (resposta) {
                case 1:
                    System.out.println("Carregando tarefas..");
                    Thread.sleep(1500);
                    for (int i = 0; i<tarefas.size(); i++){
                        System.out.println((i + 1) + "-" + tarefas.get(i));
                        Thread.sleep(100);
                    }
                    Thread.sleep(1000);
                    break;
                case 2:
                    System.out.println("Digite o nome da tarefa: ");
                    String tarefaName = scanner.nextLine();
                    System.out.println("Digite o horario(Ex:16:30)");
                    String horario = scanner.nextLine();
                    tarefas.add(tarefaName + " / " + horario);
                    Thread.sleep(1000);
                    break;
                case 3:
                    System.out.println("Digite o numero da tarefa que deseje modificar");
                    for (int i = 0; i<tarefas.size(); i++){
                        System.out.println((i + 1) + "-" + tarefas.get(i));
                        Thread.sleep(100);
                    }
                    int tarefaEditar = scanner.nextInt() - 1;
                    scanner.nextLine();
                    if (tarefaEditar >= 0 && tarefaEditar <= tarefas.size()) {
                        System.out.println("Digite o novo nome da tarefa: ");
                        String tarefaNamenv = scanner.nextLine();
                        System.out.println("Digite o novo horario(Ex:16:30)");
                        String horarionv = scanner.nextLine();
                        System.out.println("Editando ...");
                        Thread.sleep(1500);
                        tarefas.set(tarefaEditar, tarefaNamenv + " / " + horarionv);
                    } else {
                        System.out.println("Tarefa nao encontrada");
                        Thread.sleep(500);
                    }
                    break;
                case 4:
                    System.out.println("Digite o numero da tarefa que deseje excluir");
                    for (int i = 0; i<tarefas.size(); i++){
                        System.out.println((i + 1) + "-" + tarefas.get(i));
                    }
                    int tarefaExcluir = scanner.nextInt();
                    if (tarefaExcluir >= 1 && tarefaExcluir <= tarefas.size()) {
                        tarefas.remove(tarefaExcluir -1);
                        System.out.println("Excluindo ...");
                        Thread.sleep(1500);
                    } else {
                        System.out.println("Tarefa nao encontrada");
                        Thread.sleep(500);
                    }
                    break;
            }
        }
    }
}
