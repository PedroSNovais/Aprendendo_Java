public class SmartTV {

    boolean ligada = false; 
    int volume = 30;
    int canal = 1;

    public void ligarDesligar(){
        ligada = (ligada!=true) ? true : false;
        System.out.println("A TV está " + ligada);
    }

    public void aumentarVolume(){
        volume++;
        System.out.printf("Aumentando volume para %d \n", volume);

    }
    public void abaixarVolume(){
        volume--;
        System.out.printf("Abaixando volume para %d \n", volume);

    }
    public void aumentarCanal(){
        canal++;
        System.out.printf("Aumentando canal para %d \n", canal);

    }
    public void abaixarCanal(){
        canal--;
        System.out.printf("Abaixando canal para %d \n", canal);
        
    }
    public void mudarCanal(int novocanal){
        canal = novocanal;
    }
}
