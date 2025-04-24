public class ResultadoEscolar {
    public static void main(String[] args) {
        double nota = 5;
        String resultado;
        if(nota >= 7)
            resultado = "Aprovado";

        else if(nota >= 5 && nota < 7)
            resultado = "Recuperação";

        else
            resultado = "reprovado";

        System.out.println(resultado);

        
        
    }
}
