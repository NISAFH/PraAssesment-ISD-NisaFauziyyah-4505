
import java.util.Scanner;
public class LinierSearch {
    public static void main(String args[]) {
        //30, 4, 7, 10, 8, 100, 33
        int counter, number, item, array[];
        //To capture user input
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah integer:");
        number = input.nextInt();
        //Creating array to store the all the numbers
        array = new int[number];
        System.out.println("Masukkan " + number + " integer nya");
        //Loop to store each numbers in array
        for (counter = 0; counter < number; counter++)
            array[counter] = input.nextInt();

        System.out.println("Masukkan integer yang ingin dicari:");
        item = input.nextInt();

        for (counter = 0; counter < number; counter++)
        {
            if (array[counter] == item)
            {
                System.out.println(item+" berada di "+(counter+1));
                /*Item is found so to stop the search and to come out of the
                 * loop use break statement.*/
                break;
            }
        }
        if (counter == number)
            System.out.println(item + " doesn't exist in array.");
    }
}