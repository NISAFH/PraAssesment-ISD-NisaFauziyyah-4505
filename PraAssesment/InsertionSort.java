import java.util.Scanner;
/* Class InsertionSort */

public class InsertionSort {
    //4, 7, 10, 8, 9, 30, 33, 100
    /* Insertion Sort function */
    public static void sort( int array[] ) {
        int Nilai = array.length;
        int i, j, temp;
        for (i = 1; i< Nilai; i++) {
            j = i;
            temp = array[i];
            while (j > 0 && temp < array[j-1]) {
                array[j] = array[j-1];
                j = j-1;
            }
            array[j] = temp;
        }
    }

    /* Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        System.out.println("Insertion Sort Test\n");
        int nilai2, i;

        /* Accept number of elements */
        System.out.println("Masukkan jumlah integer Insertion Sort");
        nilai2 = input.nextInt();

        /* Create integer array on n elements */
        int arr[] = new int[ nilai2 ];

        /* Accept elements */
        System.out.println("\nMasukkan "+ nilai2 +" integer yang ingin di Insertion Sort ");
        for (i = 0; i < nilai2; i++)
            arr[i] = input.nextInt();

        /* Call method sort */
        sort(arr);

        /* Print sorted Array */
        System.out.println("\nInteger sesudah di Insertion Sort  ");
        for (i = 0; i < nilai2; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}