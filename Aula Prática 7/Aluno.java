public class Aluno {
    String nome;
    long matricula;
    double nota1;
    double nota2;
    double notaTrabalho;

    Aluno (String nome, long matricula, double nota1, double nota2, double notaTrabalho) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaTrabalho = notaTrabalho;
    }

    public double calcularMedia() {
        double soma = (this.nota1 + this.nota2 + this.notaTrabalho);
        double media = soma / 3;

        return media;
    }

    public void verificarSituacao() {
        
        double resultado = calcularMedia();

        System.out.println("============");

        System.out.println("Nome: " + this.nome);
        System.out.printf("Média: %.2f %n", resultado);

        if (resultado >= 7) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }
    }

}
