package ListaVetor;

public class Exercicio13 {

    public static void main(String[] args) {
        int[] VetorA = new int[10];
        double somaValores = 0;


        for (int i = 0; i < 10; i++) {
            VetorA[i] = 3 * (i + 3);

        }


        System.out.println("\n Vetor A");
        for (int i = 0; i < 10; i++) {
            System.out.print(VetorA[i]);
            System.out.print(" ");


            somaValores = somaValores + VetorA[i];


        }

        System.out.println(" A quantidade de valores é " + somaValores);
        System.out.println(" A média dos valores é " + (somaValores / VetorA.length));
    }
}
