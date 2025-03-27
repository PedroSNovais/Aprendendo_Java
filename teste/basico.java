
public class basico {

    public static void main(String[] args){
        
        String primeiroNome = "Pedro";
        String ultimoNome = "Silva novais";
        String nomeCompleto = nomeCompleto(primeiroNome, ultimoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String ultimoNome){
        return primeiroNome.concat(" ").concat(ultimoNome); 
    }
}

