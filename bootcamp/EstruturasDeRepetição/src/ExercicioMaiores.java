import java.util.Scanner;

public class ExercicioMaiores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior1 = 0;
        int maior2 = 0;
        int menor = 0;
        for(int cont = 1; cont < 6; cont++){
            System.out.printf("Digite %dº numero: ", cont);
            int numero = sc.nextInt();
            System.out.println("numero recebido " + numero);
            if(cont == 1){

                maior1 = maior2 = menor = numero;
                System.out.println("O maior numero é: " + maior1);
                System.out.println("O segundo maior numero é: " + maior2);
                System.out.println("O menor numero é: " + menor);
            }
            if(numero > maior2 && numero < maior1){
                maior2 = numero;
                
            }
            else if(numero > maior1){
                maior2 = maior1;
                maior1 = numero;
                System.out.println("O maior numero é: " + maior1);
                System.out.println("O segundo maior numero é: " + maior2);
            }
            else if(numero < menor){
                menor = numero;
                System.out.println("O menor numero é: " + menor);
            }



        }
    }
}
