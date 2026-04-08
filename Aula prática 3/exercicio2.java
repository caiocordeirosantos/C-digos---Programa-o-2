import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String palavra1, palavra2;

        System.out.print("Digite alguma palavra: ");
        palavra1 = scanner.nextLine();

        System.out.print("Digite alguma outra palavra: ");
        palavra2 = scanner.nextLine();

        if (palavra1.equalsIgnoreCase(palavra2)) {
            System.out.println("As palavras digitadas são iguais");
        } else {
            System.out.println("As palavras informadas NÃO são iguais");
        }

        scanner.close();
    }
}
