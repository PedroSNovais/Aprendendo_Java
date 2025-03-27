package edu.pedro.operadores;

public class Operadores {
    public static void main(String[] args) {
        // Operadores são a mesma coisa do python
        // if == ? else == :
        int a = 6;
        int b = 5;
        /*
        if (a==b)
            resultado = "verdadeiro";
        else
            resultado = "Falso";
        */
        String resultado = a==b ? "verdadeiro" : "Falso" ;

        System.out.println(resultado);

        // para Strings use ".equals"
        String nomeUm = "Pedro";
        String nomeDois = "Pedro";

        System.out.println("Os nomes são iguais ? " + nomeUm.equals(nomeDois));

    }
}
