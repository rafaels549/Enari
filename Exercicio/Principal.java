import java.util.Scanner;

public class Principal {
    public static void main(String args[]) {
        Lista l = new Lista();
        Scanner scanner = new Scanner(System.in);

        int escolha;
        do {
            System.out.println("Digite a operação desejada:");
            System.out.println("1- Adicionar no fim");
            System.out.println("2- Adicionar no início");
            System.out.println("3- Buscar elemento");
            System.out.println("4- Inserção por posição");
            System.out.println("5- Remoção por posição");
            System.out.println("6- Mostrar lista invertida");
            System.out.println("7- Mostrar menor valor");
            System.out.println("8- Mostrar maior valor");
            System.out.println("9- Mostrar soma dos elementos");
            System.out.println("10- Mostrar tamanho da lista");
            System.out.println("11- Remover do início");
            System.out.println("12- Remover do fim");
            System.out.println("0- Sair");
            System.out.print("Escolha: ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Quantos valores deseja adicionar? ");
                    int numValores = scanner.nextInt();
                    for (int i = 0; i < numValores; i++) {
                        System.out.print("Digite o valor " + (i + 1) + ": ");
                        int valor = scanner.nextInt();
                        l.addFim(valor);
                    }
                    break;
                case 2:
                    System.out.print("Digite o valor que deseja adicionar no início: ");
                    int valorInicio = scanner.nextInt();
                    l.addInicio(valorInicio);
                    break;
                case 3:
                    System.out.print("Digite o valor que deseja buscar: ");
                    int valorBusca = scanner.nextInt();
                    Integer resultadoBusca = l.buscarElemento(valorBusca);
                    if (resultadoBusca != null) {
                        System.out.println("O valor " + valorBusca + " foi encontrado na lista.");
                    } else {
                        System.out.println("O valor " + valorBusca + " não foi encontrado na lista.");
                    }
                    break;
                case 4:
                    System.out.print("Digite a posição: ");
                    int posicao = scanner.nextInt();
                    System.out.print("Digite o valor: ");
                    int valorPosicao = scanner.nextInt();
                    l.insercaoPorPosicao(posicao, valorPosicao);
                    break;
                case 5:
                    System.out.print("Digite a posição a ser removida: ");
                    int posicaoRemocao = scanner.nextInt();
                    l.remocaoPosicao(posicaoRemocao);
                    break;
                case 6:
                    l.inversaoLista();
                    l.show();
                    break;
                case 7:
                    System.out.println("Menor valor na lista: " + l.menor());
                    break;
                case 8:
                    System.out.println("Maior valor na lista: " + l.maior());
                    break;
                case 9:
                    System.out.println("Soma dos elementos na lista: " + l.soma());
                    break;
                case 10:
                    System.out.println("Tamanho da lista: " + l.lenght());
                    break;
                case 11:
                    System.out.println("Elemento removido do início: " + l.removeInicio());
                    break;
                case 12:
                    System.out.println("Elemento removido do fim: " + l.removeFim());
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        } while (escolha != 0);

        scanner.close();
    }
}
