import java.util.Scanner;
public class BinarySearch {
    public static void main(String args[]) {
        //4, 7, 10, 8, 9, 30, 33, 100
        int counter, num, item, array[], first, last, middle;
        //To capture user input
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah angka:");
        num = input.nextInt();

        //Creating array to store the all the numbers
        array = new int[num];

        System.out.println("Masukkan " + num + " angkanya");
        //Loop to store each numbers in array
        for (counter = 0; counter < num; counter++)
            array[counter] = input.nextInt();

        System.out.println("Masukkan angka yang ingin dicari:");
        item = input.nextInt();
        first = 0;
        last = num - 1;
        middle = (first + last)/2;

        while( first <= last ) {
            if ( array[middle] < item )
                first = middle + 1;
            else if ( array[middle] == item ) {
                System.out.println(item + " berada di " + (middle + 1) + ".");
                break;
            } else {
                last = middle - 1;
            }
            middle = (first + last)/2;
        }
        if ( first > last )
            System.out.println(item + " tidak ditemukan.\n");
    }
}