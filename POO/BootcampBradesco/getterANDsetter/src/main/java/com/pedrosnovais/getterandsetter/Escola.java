package com.pedrosnovais.getterandsetter;
public class Escola {

    public static void main(String[] args) {
        Aluno pedro = new Aluno();
        pedro.setNome("Pedro");
        pedro.setIdade(16);
        
        System.out.printf("O aluno %s tem %d anos", pedro.getNome(), pedro.getIdade());
    }
}
