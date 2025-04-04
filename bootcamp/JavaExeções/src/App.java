import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        boolean certo = false;
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a seu nome: ");
        String nome = scan.nextLine();
                try{
                    System.out.print("Digite a sua idade: ");
                    Integer idade = scan.nextInt();
        
                    System.out.print("Digite a sua altura: ");
                    Double altura = scan.nextDouble();
                    certo = true;
                    }
                    catch (InputMismatchException exception){
                        System.out.println("Ocorreu um Erro! Os valores de idade e altura precisão ser numericos !");
                    }
                    finally{
                    System.out.println("acabou");
                    }
                }

        
    }
