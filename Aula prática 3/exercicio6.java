import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String frase, palavra;

        System.out.print("Digite uma frase: ");
        frase = scanner.nextLine();

        System.out.print("Digite uma palavra: ");
        palavra = scanner.nextLine();

        int x = frase.indexOf(palavra);

        System.out.println(x);

        scanner.close();
    }
}
