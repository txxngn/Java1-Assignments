package A3;

import java.util.Scanner;
import java.lang.Math;
public class Q1A3 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
    //upload file 20/07/23
        //input
        System.out.println("Enter the manufacturing cost: ");
        double manuf_cost = input.nextInt();
        System.out.println("Enter the selling cost: ");
        double sell_cost = input.nextInt();
        System.out.println("Enter the fixed cost: ");
        double fix_cost = input.nextInt();
        System.out.println("Enter the selling price: ");
        double sell_price = input.nextInt();

        //Base on the question, we have the below formula:
        //total cost = (manufacturing cost + selling cost)* units + fixed cost;
        //earn = selling price * units;

        //break-even point --> total_cost == earn
        double num_of_units = fix_cost/(sell_price - (manuf_cost + sell_cost));
        System.out.println("The number of units it will take to reach the break-even point is " + (int)Math.ceil(num_of_units) + " units.");


    }
}
