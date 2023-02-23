import java.util.Scanner;

public class Populacao {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println();

        
        System.out.println(" Informe a população A: ");
        double a = scan.nextDouble();
        
        System.out.println(" Informe a taxa de crescimento A: ");
        double rateA = scan.nextDouble();

        System.out.println(" Informe a população B: ");
        double b = scan.nextDouble();

        System.out.println(" Informe a taxa de crescimento B: ");
        double rateB = scan.nextDouble();
        
        double count = 0;

        



        
        
        do {
            count += 1;
            a *= rateA;
            b *= rateB;
    
            
            
        } while ( a < b);

        System.out.println(" A será maior ou igual a B em  " + count + " anos.");


      

        scan.close();
    }




}







