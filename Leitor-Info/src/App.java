import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println();   

        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;


        do {

        System.out.println("Digite seu nome: ");
        nome = scan.nextLine();
        } while (nome.length() <= 3 );

        do {
            System.out.println("Digite sua idade: ");
            idade = scan.nextInt();

        } while (idade <0 | idade >150); 

        do {
            System.out.println("Digite seu Salário: ");
            salario = scan.nextDouble();

        } while (salario <0);

        do {
            System.out.println("Digite seu Sexo: ");
            sexo = scan.nextLine();

        } while (!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f"));

        do {
            System.out.println("Digite seu estado civil: ");
            estadoCivil = scan.nextLine();

        } while (!estadoCivil.equalsIgnoreCase("S") &&
        !estadoCivil.equalsIgnoreCase("C") &&
        !estadoCivil.equalsIgnoreCase("D") &&
        !estadoCivil.equalsIgnoreCase("V"));



        scan.close(); 
    }

}
