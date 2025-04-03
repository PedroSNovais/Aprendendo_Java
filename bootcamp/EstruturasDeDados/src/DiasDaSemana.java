import java.util.Scanner;

public class DiasDaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero para ver o dia equivalente: ");
        int dia = sc.nextInt();
        switch(dia){
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
            case 4:
            System.out.println("Quarta-Feira");
            System.out.println("É dia util !");
                break;
            case 5: 
            System.out.println("Quinta-feira");
            System.out.println("É util !!");
                break;
            case 6: 
            System.out.println("Sexta-feira");
            System.out.println("É dia util");
                break;
            case 7:
            System.out.println("Sábado");
                break;
            default:
            System.out.println("digitou um numero invalido");
                break;
        }
//https://www.respondeai.com.br/conteudo/programacao/c/lista-de-exercicios/comando-switch-2025

    }
}
