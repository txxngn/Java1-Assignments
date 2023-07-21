package A4;

import java.util.Scanner;
//upload 21/07

public class Q2A4 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);

        int largest_num = 0;
        int smallest_num = -1; //User cannot enter a negative number.
                                //Because java don't have the value "None" so let assume smallest num is -1
        int count_largest = 0;
        int count_smallest = 0;


        System.out.println("Enter integers, press 0 or -99 to stop: ");
        while (true){
            int num = input.nextInt();
            //Conditions
            if (num == 0 || num == -99) {
                break;
            }

            if (num < 0){
                System.out.println("Invalid data, enter positive integers again: ");
                continue;
            }

            //Catch the first number
            if (smallest_num == -1 && largest_num == 0)
                smallest_num = largest_num = num;

            //Catch the smallest number
            if (num < smallest_num) {
                smallest_num = num;
                count_smallest = 1;
            }
            else if (num == smallest_num) {
                count_smallest++;
            }

            //Catch the largest number
            if (num > largest_num) {
                largest_num = num;
                count_largest = 1;
            }
            else if (num == largest_num) {
                count_largest++;
            }
        }
        System.out.println("The largest number is " +largest_num+ " occurs " +count_largest+ " times.");
        System.out.println("The smallest number is " +smallest_num+ " occurs " +count_smallest+ " times.");

    }
}
