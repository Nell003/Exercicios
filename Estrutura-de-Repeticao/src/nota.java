import java.util.Scanner;

public class nota {
    public static void main(String[] args) throws Exception {
      Scanner scan = new Scanner(System.in);
      

      

      System.out.println("Nota: ");
      int nota = scan.nextInt();

      while(nota <0 | nota >10){
        System.out.println(" Nota Inválida! Digite Novamente: " );
        
       nota = scan.nextInt(); 
    }


      scan.close();
    }
}
