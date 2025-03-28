public class SmartTV {

    String nome;
    boolean ligada = false; 
    int volume = 0;
    double canal = 1.0;

    public void ligarDesligar() {
        if (ligada!=true)
            ligada = true;
        else
            ligada = false; 
    } 
    public void aumentarVolume(){
        if (volume==100)
            System.out.println("Volume = Max");
        else
            volume++;
    }
    public void abaixarVolume(){
        if (volume==0)
            System.out.println("Volume = Min");
        else
            volume--;
    }

}
