public class Medidas {
    public static void main(String[] args) {
        String sigla = "P";
        switch (sigla) {
            case "P":{
            System.out.println("Tamanho Pequeno !");
                break;
            }
            case "M":{ 
            System.out.println("Tamanho Medio !");
               break;
            }
            case "G":{
            System.out.println("Tamanho Grande !");
                break;
            }
            default:{
            System.out.println("Tamanho inexistente !");
                break;
           }
        }
    }
}
