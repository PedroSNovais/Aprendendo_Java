import java.util.Scanner;

public class ContaFinal {
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o saldo da conta: ");
        double saldoInicial = teclado.nextDouble();
        double saldoFinal = saldoInicial;

        for(int n= 0; n < 3 ; n++) {
            System.out.print("Digite o valor da operação: [valor negativo significa saque!] ");
            double valor = teclado.nextDouble();
            saldoFinal = saldoFinal + valor;
        }
        System.out.printf("O saldo final da conta é %.2f \n", saldoFinal);
    }
}




