package A3;
//Q2A3
import java.util.Scanner;
public class Q2A3 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);

        //Initialize stage.
        int largest_num = 0;
        int count = 1;          //count = 1 because each integer will appear at least 1 time.
                                //If I set count = 0, assume a number appear 2 times will only be counted 1 time.

        //Loop through user input
        for (int i = 1; i <=5; i++){
        System.out.println("Enter the " + i + " integer: ");
        int num = input.nextInt();

        //Find the largest number
        if (num > largest_num)
            largest_num = num;

        //Count the repeated number
        else if (num == largest_num)
            count++;
        }
        System.out.println("The largest number is " + largest_num);
        System.out.println("The number " + largest_num + " appeared " + count + " times.");

    }
}
