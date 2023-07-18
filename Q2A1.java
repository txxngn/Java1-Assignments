package A1;

import java.util.Scanner;

public class Q2A1 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        //input from user
        System.out.print("Please enter how much sauce you want to make in ml: ");
        int sauce = input.nextInt();

        //Set the formula
        int soy_sauce = sauce * 10/100;
        int vinegar = sauce * 20/100;
        int sugar = sauce * 30/100;
        int water = sauce * 40/100;


        //Output
        System.out.println("Your recipe will use: ");
        System.out.println(soy_sauce + " ml of soy sauce");
        System.out.println(vinegar + " ml of vinegar");
        System.out.println(sugar + " ml of sugar");
        System.out.println(water + " ml of water");

    }
}
