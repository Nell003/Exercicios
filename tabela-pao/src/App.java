import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
     
    Scanner scan = new Scanner(System.in);


    while (true){
    boolean novoItem = false;
    int count = 1;
    double total = 0;


    System.out.print("Informe o valor do Produto: R$ ");
    double produto = scan.nextDouble();
    total = total + produto;

    while (!novoItem) {
        count++;
        System.out.print("Informe o valor do Produto " + count + " : R$ " );
        produto = scan.nextDouble();
        total = total + produto;
        
        
        
        if (produto == 0) {
            novoItem = true;


            System.out.print("O valor total é : R$ " + total + " ");
            System.out.println("\nDinheiro : R$ " );
            double dinheiro = scan.nextDouble(); 
            System.out.println("Troco: R$" + (dinheiro - total));


    
     
       



        }

    }
        

        } 
}
}

