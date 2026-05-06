public class Notas {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Caio", 123456789, 8.0, 7.5, 6.5);
        Aluno aluno2 = new Aluno("Levi", 987654321, 5.5, 7.0, 3.0); 
        
        aluno1.verificarSituacao();
        aluno2.verificarSituacao();

        System.out.println("============");
    }
}
