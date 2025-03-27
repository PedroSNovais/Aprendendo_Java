public class MinhasClasses {
    public static void main(String[] args) {
        String primeiroNome = "Pedro";
        String ultimoNome = "Silva Novais";

        String nomeCompleto = nomeCompleto(primeiroNome, ultimoNome);
        
        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto( String primeiroNome, String ultimoNome){
        return "O Nome completo é " + primeiroNome.concat(" ").concat(ultimoNome);
    }
}
