
import java.util.*;

public class BubbleSort {
    static int[] sort(int[] sequence) {
        // Bubble Sort
        int Nilai = sequence.length;
        //int i, sequence, temp;
        for (int i = 0; i < sequence.length; i++)
            for (int j = 0; j < sequence.length - 1; j++)
                if (sequence[j] > sequence[j + 1]) {
                    sequence[j] = sequence[j] + sequence[j + 1];
                    sequence[j + 1] = sequence[j] - sequence[j + 1];
                    sequence[j] = sequence[j] - sequence[j + 1];
                }
        return sequence;
    }

    static void printSequence(int[] sorted_sequence) {
        for (int i = 0; i < sorted_sequence.length; i++)
            System.out.print(sorted_sequence[i] + " ");
    }

    public static void main(String args[]) {
        Scanner input = new Scanner( System.in );
        System.out.println("Masukkan jumlah angka Bubble Sort");
        int N = input.nextInt();
        int[] sequence = new int[N];

        //for (int i = 0; i < N; i++)
            //sequence[i] = input.nextInt();

        System.out.println("\nMasukkan " + N  + " integer: ");
        for (int i = 0; i < N; i++)
            sequence[i] = input.nextInt();

        System.out.println("\nInteger yang sudah di Sort : ");
        for (int i = 0; i < N; i++)
            System.out.print(sequence[i]+" ");
        //printSequence(sort(sequence));
    }
}