import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);
    
   

        System.out.println("Montar a tabuada de: ");
        int tabuada = scan.nextInt();

        System.out.println("Começar por: ");
        int inicio = scan.nextInt();

        System.out.println("Terminar em: ");
        int fim = scan.nextInt();


        System.out.println("Vou montar a tabuada de " + tabuada + " começando de " + inicio + " e terminando em " + fim);


        for (int i = inicio; i <= fim; i++) {

            if (i <= fim){
                System.out.println(i + " x " + tabuada + " = " +  (tabuada * i));
            }

            
        }


    





        scan.close();
    }
}
