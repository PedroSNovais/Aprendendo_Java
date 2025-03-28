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
    

}
