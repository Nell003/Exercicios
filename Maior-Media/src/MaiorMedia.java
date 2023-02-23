import java.util.Scanner;

public class MaiorMedia {

   public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println();

   int count = 0;
   int soma = 0;
   int numero = 0;
   int media = 0;

  


   while (count <5 ){
    System.out.println("Informe o número: ");
    numero = scan.nextInt();
    count++;
    soma = numero + soma;
    media = soma / 5;
    

   }
   System.out.println("A soma total dos números é " + soma + " e a média total é " + media );
   
   scan.close();
}


    
}
