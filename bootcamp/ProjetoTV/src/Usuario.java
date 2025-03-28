public class Usuario {
    public static void main(String[] args) {
        SmartTV TV = new SmartTV();
        TV.nome = "Samsung";
        System.out.println("O nome da tv é " + TV.nome);
        System.out.println("A Tv está ligada ? " + TV.ligada);
    }

}
