import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero para o vetor: ");
        int tamanho = scanner.nextInt();

        int vetor[] = new int[tamanho];

        for(int i = 0; i<tamanho;i++){
            System.out.println("Digite o " + i + " numero: ");
            vetor[i] = scanner.nextInt();
        }
        System.out.println("Array antes da remoção: " + Arrays.toString(vetor));

        int n = vetor.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {

                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
        System.out.println("Array antes da remoção: " + Arrays.toString(vetor));

    }
}
