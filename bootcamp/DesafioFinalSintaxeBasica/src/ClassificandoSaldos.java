import java.util.Scanner;

public class ClassificandoSaldos {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        
        double saldoConta = Scanner.nextDouble();
        if(saldoConta < 0 )
            System.out.println("Negativado");
        else if (saldoConta == 0 | saldoConta <= 500 )
            System.out.println("Baixo");
        else
            System.out.println("Confortavel");
 
    }
}
