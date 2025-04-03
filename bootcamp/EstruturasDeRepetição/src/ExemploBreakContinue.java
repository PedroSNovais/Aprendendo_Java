public class ExemploBreakContinue {
    public static void main(String[] args) {
        // Exemplo Break
        for(int numero = 0; numero <= 5; numero++){

            if (numero == 3)
                break;
            System.out.println(numero);
        }
        System.out.println("-----------------------------");
        // Exemplo continue
        for(int num = 0; num <= 5; num ++){

            if (num == 3)
                continue;
            System.out.println(num);

        }


    }
}
