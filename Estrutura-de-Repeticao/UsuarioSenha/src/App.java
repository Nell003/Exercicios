import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nome de Usuário: ");
        String nome = scan.nextLine();
        System.out.println("Senha: ");
        String senha = scan.nextLine();


        while (nome.equals  (senha)) {
            System.out.println("Senha Invalida! ");

        System.out.println("Nome de Usuário: ");
         nome = scan.nextLine();
        System.out.println("Senha: ");
         senha = scan.nextLine();
            
         

        }



        System.out.println("Bem vindo " + nome);

    
        scan.close();
    }

}
