import java.util.Scanner;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        ProcessoSeletivo proSel = new ProcessoSeletivo();
        System.out.println("Processo Seletivo");
        System.out.println("Informe O salário desejado !");
        double salarioDesejado = 2000.00;
        proSel.seletiva(salarioDesejado);

        
    }
   
    public void seletiva( double salarioDesejado){
        double salarioBase = 2000.00;
        if(salarioDesejado < salarioBase){
            System.out.println("ligue para esse cara agora mesmo ! ");
        }
        else if(salarioDesejado == salarioBase){
            System.out.println("Liga oferecendo menos...");
        }
        else
        System.out.println("Diga a ele que ele está na lista de espera");
    }
}
