public class App {
    public static void main(String[] args) throws Exception {
       
        int[] vetor = {6, -5, 8, 4, 6, 9};
        

        System.out.println("Vetor: ");
        int count = 0;
        while ( count < (vetor.length) ) {
            System.out.println(vetor[count] + " ");
            count++;
        }
        System.out.println("\nVetor: ");

    
    for (int i = vetor.length -1; i >= 0; i --) {
        System.out.println(vetor[i] + " ");

    }

}
}
