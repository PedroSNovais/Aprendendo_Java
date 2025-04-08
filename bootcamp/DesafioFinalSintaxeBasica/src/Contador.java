
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int primeriroNumero = teclado.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int segundoNumero = teclado.nextInt();

        try{
            contar(primeriroNumero, segundoNumero);
        } 

        catch( ParametrosInvalidosExeption e){
            System.out.println("O segundo numero deve ser maior que o primeiro !!");
        }
    }

    public static void contar(int primeiroNumero, int segundoNumero)throws ParametrosInvalidosExeption{
        if (primeiroNumero > segundoNumero) {
            throw new ParametrosInvalidosExeption();
        }
    
        int contagem =  segundoNumero - primeiroNumero;
        System.out.println("contando de 0 a " + contagem);
            for(int n = 0; n != contagem; n++ ){
                System.out.println("imprimindo " + n);
            }
    }
}
