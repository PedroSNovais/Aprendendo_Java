import java.util.ArrayList;
import java.util.Scanner;

public class exArrayList1 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> compras = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int resp = 1;
        String item = "";
       
            while (resp == 1){
                System.out.println("--------------------------------------");
                System.out.print("Digite 1 caso queira continuar: ");
                resp = sc.nextInt();
                    if(resp != 1)
                        break;
                    else{
                        System.out.print("Digite um item para adicionar na lista: ");
                        item = sc.next(); 
                        compras.add(item);
                    }
            } 
        System.out.println("--------------------------------------");
        System.out.println("A lista de compras:");
        System.out.println(compras);
        System.out.println("<<<< Programa Finalizado >>>>>");
    }
}
