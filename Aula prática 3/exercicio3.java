import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String palavra;
        int contagem_palavras;

        System.out.print("Digite qualquer palavra: ");
        palavra = scanner.nextLine();

        contagem_palavras = palavra.length();

        System.out.println("A palavra " + palavra + " tem " + contagem_palavras + " caracteres");

        scanner.close();
    }
}
