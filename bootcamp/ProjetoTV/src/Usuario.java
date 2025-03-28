public class Usuario {
    public static void main(String[] args) {
        SmartTV SmartTV = new SmartTV();

        SmartTV.nome = "Samsung";
        System.out.println("O nome da tv é " + SmartTV.nome);
        System.out.println("A Tv está ligada ? " + SmartTV.ligada);

        SmartTV.ligarDesligar();

        System.out.println("O nome da tv é " + SmartTV.nome);
        System.out.println("NOVO Status -> A Tv está ligada ? " + SmartTV.ligada);

    }

}
