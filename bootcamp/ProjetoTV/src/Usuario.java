import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        SmartTV SmartTV = new SmartTV();

        SmartTV.nome = "Samsung";
            System.out.println("O nome da tv é " + SmartTV.nome);
            System.out.println("A Tv está ligada ? " + SmartTV.ligada);

        SmartTV.ligarDesligar();
            System.out.println("SmartTV " + SmartTV.nome);
            System.out.println("NOVO Status -> A Tv está ligada ? " + SmartTV.ligada);

        SmartTV.abaixarVolume();
        SmartTV.aumentarVolume();

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o número do canal desejado: ");
        double canal = teclado.nextDouble();
        //SmartTV.mudarCanal(canal);
        System.out.println(SmartTV.canal);


        
    }

}
