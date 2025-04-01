public class CaixaEletronico {
    public static void main(String[] args){

        double saldo = 120.50;
        double valorSolicitado = 110.25;

       saldo = (saldo >= valorSolicitado) ?saldo -valorSolicitado :saldo;
        System.out.println("saldo = " + saldo);

    }

}
