public class ResultadoEscolarTernario {
    private static String resultado;

    public static void main(String[] args) {
        double nota = 6;

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        

        System.out.println(resultado);
    }
}
