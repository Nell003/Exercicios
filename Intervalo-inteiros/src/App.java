import java.util.Scanner;

public class App {

public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
 
   
    System.out.println("Primeiro número: ");
    int num1 = scan.nextInt();
    System.out.println("Segundo número: ");
    int num2 = scan.nextInt();


    if (num1 < num2) {
        for (int i = num1; i < num2; i++) {
            System.out.println(i + " ");
    
    }
} else if (num1 > num2) {
    for (int i = num1; i > num2; i--) {
        System.out.println(i + " ");


  

}


} 
scan.close();
} }


