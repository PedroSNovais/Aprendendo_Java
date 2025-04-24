package ContaBanco;

public class Usuario {
    public static void main( String[] args){

        ContaTerminal contaPedro = new ContaTerminal();
        contaPedro.cliente = "Pedro Silva Novais";
        contaPedro.numero = 1021;
        contaPedro.agencia = "069-2";
        contaPedro.saldo = 0.88;
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque \n",contaPedro.cliente, contaPedro.agencia, contaPedro.numero, contaPedro.saldo);


    }
}
