import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner scan = new Scanner(System.in);

        System.out.println("Total de eleitores : ");    
        int total = scan.nextInt();
        
        int voto = 0;
        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;


      
        for (int i = total; i > 0; i--){
            System.out.println("Digite o número dos candidatos entre [1/2/3] : ");  
            voto = scan.nextInt();
         while (voto < 1 || voto > 3){
            System.out.println("Número inválido.");
            System.out.println("Digite o número dos candidatos entre [1/2/3] : ");
            voto = scan.nextInt();

        } if (voto == 1){
            candidato1++; 
        } else if (voto == 2){
            candidato2 ++;
        } if ( voto == 3){
            candidato3 ++;
        }

        }
        System.out.println("O canditato 1 teve o total de :" + candidato1 + " votos.");
        System.out.println("O canditato 2 teve o total de :" + candidato2 + " votos.");
        System.out.println("O canditato 3 teve o total de :" + candidato3 + " votos.");
         
        scan.close();

    }
}

