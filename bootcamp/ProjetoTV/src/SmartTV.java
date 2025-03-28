public class SmartTV {

    String nome;
    boolean ligada = false; 
    int volume = 30;
    double canal = 1.0;

    public void ligarDesligar() {
        if (ligada!=true)
            ligada = true;
        else
            ligada = false; 
    } 
    public void aumentarVolume(){
        String mensagem = volume==100 ? "Volume Max" : "Aumentando volume";
        volume = volume!=100 ? volume++ : volume ;  
        System.out.println(mensagem);
        System.out.printf("NOVO Status -> Volume = %d \n", volume);
    }
    public void abaixarVolume(){
        String mensagem = volume==0 ? "Volume Min" : "Abaixando volume";
        volume = volume!=100 ? volume++ : volume ;  
        System.out.println(mensagem);
        System.out.printf("NOVO Status -> Volume = %d \n", volume);
    }

    public void mudarCanal (int novoCanal){
        canal = novoCanal;

    }

}
