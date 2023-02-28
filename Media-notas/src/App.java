import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int count = 0;
        int media = 0;

        while ( count < 5 ){

            System.out.println("Qual é a idade? ");
            int idade = scan.nextInt();
            media += idade;
            count++;

            } if ( media / 5 <= 25){
                System.out.println("A turma é jovem");
            } else if ( media / 5 <= 60){
                System.out.println("A turma é Adulta");
            } else if( media / 5 >= 61) {
                System.out.println("A turma é Idosa");
            }

        System.out.println(" A média de idade é : " + media / 5 );
        scan.close();
    }
}

       


    

