import java.util.Scanner;

public class MaiorMedia {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);


        int count = 0;
        int maior = 0;
        int numero;


        while (count <5) {
            count++;
            System.out.println("Número: ");
            numero = scan.nextInt();

        if (numero > maior) {
            maior = numero;
            System.out.println(" O maior número mudou para :  " + maior);

        }

     
        }

            scan.close();

            System.out.println(" O maior número é: " + maior);
    }

    
}
