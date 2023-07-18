package A1;

import java.util.Scanner;
public class Q1A1 {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);

        int num1, num2, num3, num4;

        //Input from user
        System.out.println("Enter the first number: ");
        num1 = input.nextInt();
        System.out.println("Enter the second number: ");
        num2 = input.nextInt();
        System.out.println("Enter the third number: ");
        num3 = input.nextInt();
        System.out.println("Enter the fourth number: ");
        num4 = input.nextInt();

        //Check equality
        String check_equal = (num1 == num2 && num2 == num3 && num3 == num4)? "equal":"not equal";
        System.out.println("Above four numbers are " + check_equal);


    }
}
