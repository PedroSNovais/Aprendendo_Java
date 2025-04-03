
import java.util.concurrent.ThreadLocalRandom;

public class WhileDoce {
    public static void main(String[] args) {
        double mesada = 50.0;
        while (mesada > 0) {
         
        double valorDoce = ThreadLocalRandom.current().nextDouble(2, 15);
        System.out.printf("O valor do doce é %.2f\n", valorDoce);
        if(valorDoce > mesada)
            valorDoce = mesada;
        mesada = mesada - valorDoce;
        }
    System.out.println("Acabou o dinheiro para doces");
    }
}
