import java.util.Scanner;

public class App {
   public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);


    int numero;
    int numPar = 0;
    int numImpar = 0;
    int i = 0;


    while (i < 10){
        System.out.println("Digite os números " + (i+1) );
        numero = scan.nextInt();
        if (numero % 2 == 0) {
            numPar++;
        } else {
            numImpar++;
        }
        i++;
    }
System.out.println("A Quantidade de números pares é: " + numPar + "");
System.out.println("A Quantidade de números ímpares é: " + numImpar + "");

scan.close();
}
}
    
