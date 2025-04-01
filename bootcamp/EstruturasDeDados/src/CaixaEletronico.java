public class CaixaEletronico {
    public static void main(String[] args){

        double saldo = 120.50;
        double valorSolicitado = 110.25;

        if(valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;

        System.out.println(saldo);

    }

}
