import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o número: ");
        int num = scan.nextInt();
        boolean prime = true;
       
        for (int i = 2; i < num; i++){
            if ( num % i == 0 ) {
                System.out.println("Esse numero é divisivel por "+ i + " portanto não é primo");
                prime = false;
            }
               
                
            } 
            if (prime){
                System.out.println("Esse numero é divisivel por 1 ");
                    System.out.println("Esse numero é divisivel por " +num);
                    System.out.println("esse numero é primo");
            }
            }
        
}

