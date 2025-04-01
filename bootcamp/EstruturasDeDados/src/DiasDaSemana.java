import java.util.Scanner;

public class DiasDaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para ver o dia equivalente: ");
        int dia = sc.nextInt();
        switch (dia) {
            case 1:
            System.out.println("Domingo");
                break;
            case 2:
            System.out.println("Segunda-Feira");
            System.out.println("É dia util !");
                break;
            case 3:
            System.out.println("Terça-Feira");
            System.out.println("É dia util !");
                break;
            default:
                break;
        }
//https://www.respondeai.com.br/conteudo/programacao/c/lista-de-exercicios/comando-switch-2025

    }
}
