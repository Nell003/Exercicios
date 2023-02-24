import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        

      System.out.println(" Escolha um número : ");
      int numero = scan.nextInt();

      System.out.println(" Tabuada de " + numero + " : ");
      for (int i = 1; i <= 10; i++) {
        System.out.println(numero + "x" + i + " = " + (i*numero));
      }
    
      
            
    
            
      scan.close();
        }

        
    }

