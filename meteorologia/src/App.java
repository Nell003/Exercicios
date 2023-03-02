import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

       double maior = Integer.MIN_VALUE;
       double menor = Integer.MAX_VALUE;
       double temperatura;
       double total = 0;
       boolean continuar = false;
       int count = 0;


       while (!continuar){
        count++;
        System.out.println("Informe a " + count + " temperatura: ");
        temperatura = scan.nextDouble();

        total += temperatura;
        



        if (temperatura> maior){
            maior = temperatura;
        } if (temperatura < menor){
            menor = temperatura;
        }

        System.out.println("Deseja informar uma nova temperatura? [S/N]");
        String nao = scan.next();

        if (nao.equalsIgnoreCase("n")){
            continuar = true;


        }

    
    }

    System.out.println("A maior temperatura foi: " + maior + "graus");
        System.out.println("A menor temperatura foi: " + menor + " graus");
        System.out.println("A média de temperatura foi: " + total /  count + "graus" );

        scan.close();

       }
       
        }
       
       




        


        
    

