package ContaBanco;

import java.util.Scanner;

public class CriarConta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaTerminal Conta = new ContaTerminal();
        System.out.print("Digite o nome do dono da conta: ");
        Conta.cliente = sc.nextLine();
        System.out.print("Digite a agencia da conta: ");
        Conta.agencia = sc.nextLine();
        System.out.print("Digite o numero da conta: ");
        Conta.numero = sc.nextInt();
        System.out.print("Digite seu Saldo: ");
        Conta.saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agencia é %s, conta %d e seu saldo de %.2f está pronto para saque !",Conta.cliente, Conta.agencia, Conta.numero, Conta.saldo);
    }

}
