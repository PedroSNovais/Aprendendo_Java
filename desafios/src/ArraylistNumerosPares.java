import java.util.ArrayList;

public class ArraylistNumerosPares {
    public static void main(String[] args) {
        ArrayList<Integer> numerosPares = new ArrayList<>();
        ArrayList<Integer> numeros = new ArrayList<>();
        
        for (int n = 1; n != 21; n++) {
            numeros.add(n); 
        }
        for (Integer numero : numeros) {
            if (numero % 2 == 0){
                numerosPares.add(numero);
            }
        }
    System.out.print("Todos os numeros: ");
    System.out.println(numeros);
    System.out.print("Numeros pares: ");
    System.out.println(numerosPares);

    }
}
