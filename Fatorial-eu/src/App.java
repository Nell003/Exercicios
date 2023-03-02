import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner scan = new Scanner(System.in);


        int fatorial = 1;
       System.out.println("Informe o numero: ");
       int num = scan.nextInt();
       


        for (int i = num; i >= 1; i--){
            fatorial *= i; 

            if (i !=1){
                System.out.print( i + " . ");
            } else {
                System.out.print(i + " = ");
            }
            
        }
        System.out.println(fatorial);
          
           
        } 
       
    }

