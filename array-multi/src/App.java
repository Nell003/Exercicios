import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
   
        Random random = new Random();

        int [] [] m = new int [4][4];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = random.nextInt(9);
        
    }

}
    for (int [] linha : m ) {
        for (int elementoDaColuna : linha) {
            System.out.print(elementoDaColuna + " ");
            
        }
        
        System.out.println();
    }
    }
}
