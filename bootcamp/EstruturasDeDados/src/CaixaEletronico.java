public class CaixaEletronico {
    public static void main(String[] args){

        double saldo = 120.50;
        double valorSolicitado = 150.25;

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("novo saldo: " + saldo);
        }
        else
            System.out.println("Saldo insuficiente!!");
        System.out.println("saldo = " + saldo);

    }

}
