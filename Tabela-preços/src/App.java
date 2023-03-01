public class App {
    public static void main(String[] args) throws Exception {
       
        double valor = 1.99; 
        int count = 1;
        double total = 0;

        for (int i = 1; i <= 50; i++){
            System.out.println(" Tabela de valores: " + (i)+ " : " + (valor + total) * count );
            total = valor + total; 

        }



    }
}
