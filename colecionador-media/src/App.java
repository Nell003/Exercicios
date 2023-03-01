import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner scan = new Scanner(System.in);

       double total = 0;
       int count = 1;
       double valor = 0;
       System.out.println(" Informe a quantidade de CD's : ");
       int cd = scan.nextInt();

       for (int i = cd; i >0; i--){
        System.out.println("Qual é o valor do " + count + " cd ? ");
        valor = scan.nextDouble();
        total += valor;
        count ++;


       }

       System.out.println("O valor médio de cada CD é : " + total / cd + " o valor total investido foi: " + total);
       

       scan.close();


    }
}
