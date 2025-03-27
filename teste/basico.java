
public class basico {

    public static void main(String[] args){
        System.out.println("Hello, World !");
        int idade = 3;
        
        //float altura = (float) 1.78;
        float altura = 1.78f;

        char letra = 'P'; // Só aceita 1 letra
        boolean casado = true;

        String palavra = "casa";
        System.out.println(palavra);

        String primeiroNome = "Pedro";
        String ultimoNome = "Silva novais";
        String nomeCompleto = nomeCompleto(primeiroNome, ultimoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String ultimoNome){
        return primeiroNome.concat(" ").concat(ultimoNome); 
    }
}

