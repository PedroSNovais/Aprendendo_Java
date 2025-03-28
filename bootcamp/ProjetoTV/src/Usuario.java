import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        SmartTV Samsung = new SmartTV();
        System.out.println(Samsung.ligada);
        Samsung.ligarDesligar();
        Samsung.aumentarVolume();
        Samsung.aumentarVolume();
        Samsung.aumentarVolume();
        Samsung.abaixarVolume();

        System.out.printf("canal atual é o %d \n", Samsung.canal);
        Samsung.aumentarCanal();
        Samsung.aumentarCanal();
        Samsung.abaixarCanal();

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o canal desejado: ");
        int novocanal = teclado.nextInt();
        Samsung.mudarCanal(novocanal);
        System.out.printf("canal atual é o %d \n", Samsung.canal);

    }

}
