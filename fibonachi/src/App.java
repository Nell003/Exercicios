import java.util.Scanner;

public class App {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println();


    int first = 1;
    int second = 1;
    int next = 0;

    System.out.print(first + " ");
    System.out.print(second + " ");

    while (next < 500) {
      next = first + second;
      first = second;
      second = next;

      System.out.print(next + " ");
    }
    System.out.println();    
  }
}
   

    

