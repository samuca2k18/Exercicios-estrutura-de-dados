import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero para o vetor: ");
        int tamanho = scanner.nextInt();

        int vetor[] = new int[tamanho];

        for(int i = 0; i<tamanho;i++){
            System.out.println("Digite o " + i + " numero: ");
            vetor[i] = scanner.nextInt();
        }
        System.out.println("Array antes da remoção: " + Arrays.toString(vetor));

        int vetorAtual = vetor[0];

        int flag = 0;

        for(int i = 0; i < tamanho;i++){
            if(vetorAtual < vetor[i]){
                vetorAtual = vetor[i];
                flag = i;
            }

        }
        int novoVetor[] = new int[tamanho - 1];
        int j = 0;

        for (int i = 0; i < tamanho; i++) {
            if (i != flag) {
                novoVetor[j] = vetor[i];
                j++;
            }
        }

        System.out.println("Array depois da remoção" + Arrays.toString(novoVetor));

    }
}
