public class Populacao {

    public static void main(String[] args) {
        
        double a = 80000;
        double rateA = 1.03;
        double b = 200000;
        double rateB = 1.015;
        double count = 0;



        
        
        do {
            count += 1;
            a *= rateA;
            b *= rateB;
    
            
            
        } while ( a < b);

        System.out.println(" A será maior ou igual a B em  " + count + " anos.");


      


    }




}







