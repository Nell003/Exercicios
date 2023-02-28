import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);


        System.out.println("Quantidade de turmas: ");
        int turmas = scan.nextInt();
        double alunos = 0;
        double total = 0;
       


        for (int i = turmas; i > 0; i--){
            System.out.println("Informe a quantidade de alunos da turma  " + (i) + " :");
             alunos = scan.nextInt();
             total = total + alunos;

             
             

        
            while (alunos >= 40){
                System.out.println("Informe uma quantidade valida de no máximo 40 alunos.");
                System.out.println("Informe a quantidade de alunos da turma  " + (i) + " :");
                alunos = scan.nextInt();
                
        }

        
        

    }
    System.out.println("A media de alunos por turma é : " +  total / turmas);


    scan.close();
}
}
