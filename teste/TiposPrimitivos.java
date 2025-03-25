import java.util.Scanner;
public class TiposPrimitivos {
    public static void main(String[] args){
        /* recebendo valores

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        System.out.printf("A nota de %s é %.1f \n", nome, nota);
        System.out.println("...");

        */
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um numero para ser convertido: (int x String) ");
        int idade = teclado.nextInt();
        String valor = Integer.toString(idade);
        System.out.println(valor);

        System.out.println("Digite um valor para ser convertido: (string x int) ");
        String valor2 = "9";
        int idade2 = Integer.parseInt(valor2);
        System.out.println(idade2);



    }
}
