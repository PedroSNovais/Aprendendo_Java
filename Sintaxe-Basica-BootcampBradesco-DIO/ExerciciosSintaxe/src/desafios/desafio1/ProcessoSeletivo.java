package desafios.desafio1;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        ProcessoSeletivo prosel = new ProcessoSeletivo();
        prosel.seleçãoCandidatos();
    }

    public void seleçãoCandidatos(){
        String[] nomes = {
            "Alice", "Bruno", "Carla", "Daniel", "Eduarda",
            "Felipe", "Gabriela", "Henrique", "Isabela", "João"};
        int selecionados = 0;
        double salarioBase = 2000.0;
        while(selecionados < 5){
            double salariopretendido = valorPretendido();
            seletiva(salariopretendido);
            if(salariopretendido <= salarioBase){
                selecionados = selecionados + 1;
            }
            if (selecionados == 5) {
                System.out.println("foram selecionados 5");
                break;
            }
        }
    System.out.println("acabou !!! foram selecionados " + selecionados);

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
        System.out.println("Diga a ele que ele está na lista de espera...");
    }
    public double valorPretendido ( ) {
        return ThreadLocalRandom.current().nextDouble(1800, 2100);

    }
}
