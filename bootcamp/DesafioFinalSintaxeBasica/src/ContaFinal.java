import java.util.Scanner;

public class ContaFinal {
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o saldo da conta: ");
        double saldoInicial = teclado.nextDouble();
        System.out.print("Digite o valor da operação que deseja fazer: [valor negativo significa saque!] ");
        double valor = teclado.nextDouble();
        if(valor < 0){
            double saldoFinal = saldoInicial + valor;
            System.out.println(saldoFinal);
        }
    }


    public double sacar(double saldoInicial, double valorSaque)
    {
        double saldoFinal = saldoInicial - valorSaque;
        return saldoFinal;

    }
}




