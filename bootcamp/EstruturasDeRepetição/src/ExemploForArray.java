public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = {"Ana", "Maria", "João", "Joana", "Barbara", "Juliana"};
        /*for(int X = 0; X < alunos.length; X ++ ){

            System.out.printf("O aluno dindice x = %d é %s \n", X ,alunos[X]);}*/
        
        //pode ser feito de forma inteligente for each
        for(String aluno : alunos){

            System.out.println("O nome do aluno é: " + aluno);

        }
    }

}
