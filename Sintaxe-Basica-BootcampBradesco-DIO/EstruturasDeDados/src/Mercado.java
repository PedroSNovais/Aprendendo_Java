
import java.util.Scanner;

public class Mercado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o codigo do produto: ");
        int codigoProduto = teclado.nextInt();
        System.out.print("Digite a quantidade de produtos desejada: ");
        int quantidadePoduto = teclado.nextInt();
        switch(codigoProduto){
            case 100:{
            String nome = "Detergente";
            double preço = 1.59;
            double total = preço * quantidadePoduto;
            System.out.printf("Os produtos selecionados: %d %s", quantidadePoduto, nome);
            System.out.printf("O valor total foi de R$%.2f \n", total);
                break;
        }
            case 101: {
            String nome = "Esponja";
            double preço = 4.60;
            double total = preço * quantidadePoduto;
            System.out.printf("Os produtos selecionados: %d %s\n", quantidadePoduto, nome);
            System.out.printf("O valor total foi de R$%.2f \n", total);
                break;
            }

            case 102: {
                String nome = "Bom Briu";
                double preço = 1.79;
                double total = preço * quantidadePoduto;
                System.out.printf("Os produtos selecionados: %d %s\n", quantidadePoduto, nome);
                System.out.printf("O valor total foi de R$%.2f \n", total);
                    break;
                }

            default:
            System.out.println("ERROR ! Código Inexistente");
        } 
    }

}
