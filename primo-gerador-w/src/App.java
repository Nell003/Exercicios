import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        boolean primo = true;
        System.out.println("Infome o número: ");
        int num = scan.nextInt();

        for(int i = 2; i < num; i++) {
            if ( num % i == 0){
                System.out.println("Esse numero é divisivel por " + i + " portanto não é primo");
                primo = false;
            } else if ( num % i == 1){

                primo = true;
                
                
               
                
                   
                }

                
            }
            System.out.println(num + " é numero primo");
    }
    }
