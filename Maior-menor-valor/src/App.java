import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        

        int maior = 0;
        int menor =0;
        
        
        
         System.out.println(" Informe o primeiro número: ");    
        int n1 = scan.nextInt();
        System.out.println("Informe o segundo número: ");
        int n2 = scan.nextInt();
        
        
        while (n1 > n2){
            maior = n1;
            System.out.println("O maior número é " + n1 + " o menor numero é " + n2 + " e a soma total é " + (n1 + n2));
        } if (n1 < n2){
            menor = n1;
            System.out.println("O maior número é " + n2 + " o menor numero é " + n1 + " e a soma total é " + (n1 + n2));
        }


        scan.close();
    }
}
