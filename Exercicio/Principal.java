import java.util.Scanner;

public class Principal{
    public static void main(String args[]){
      Lista l = new Lista();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos valores deseja adicionar? ");
        int numValores = scanner.nextInt();

        for (int i = 0; i < numValores; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            int valor = scanner.nextInt();
            l.addFim(valor);
            
        }
         l.inversaoLista();
        l.show();
        
       
        scanner.close();
    }
}
