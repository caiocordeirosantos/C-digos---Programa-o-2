import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

        String nome1, nome2;

        System.out.print("Informe seu nome: ");
        nome1 = scanner.nextLine();
        
        System.out.print("Informe o outro nome: ");
        nome2 = scanner.nextLine();

        if (nome1.equals(nome2)) {
            System.out.println("Os nomes informados são iguais");
        } else {
            System.out.println("Os nomes informados não são iguais");
        }
        scanner.close();
    }
}
