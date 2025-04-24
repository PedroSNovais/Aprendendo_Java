import java.util.Scanner;

public class ExercicioXuxa {
    public static void main(String[] args) {
        //https://www.javaprogressivo.net/2012/08/questoes-usando-o-laco-for-java.html
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero de patinhos: ");
        int patinhos = sc.nextInt();
        int npatinhos = patinhos;

        for(int n = patinhos; n >= 0 ; n--){
            
            System.out.println("---------------------------------------------");
            System.out.printf("%d patinhos foram passear\n" + //
                                "Além das montanhas\n" + //
                                "Para brincar\n" + //
                                "A mamãe gritou: Quá, quá, quá, quá\n" + //
                                "Mas só %d patinhos voltaram de lá.\n", npatinhos, n);
            if(n==0){
                System.out.println("-------------------------------------------");
                System.out.printf("A mamãe patinha foi procurar\n" + //
                                        "Além das montanhas\n" + //
                                        "Na beira do mar\n" + //
                                        "A mamãe gritou: Quá, quá, quá, quá\n" + //
                                        "E os %d patinhos voltaram de lá.\n", patinhos);
                break;
            }
            npatinhos = n;
        }

    }
}
