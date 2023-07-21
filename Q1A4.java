package A4;

public class Q1A4 {
    public static void main (String [] args){

        /*According to the question, if we have commission, we can find the sale amount.
          income = base salary + commission
          In the first year, the commission is 17.000 - 5.000 = 12.000
          In the given example, the commission is only 2.700, significantly lesser than the first year and the next 2 years.
          But with the commission at 2.700, the sale amount already exceed $10.000

          We have 2.700 = 5000 * 8% + 5000 * 10% + 15000 * 12%
          So, the formula will be: commission = 5000*8% + 5000*10% + X*12%
          We find X, then sale amount = 5000 + 5000 + X
          NOTE: the question don't ask for the input (which is varied) but fixed number.
         */

        double base_salary = 5000;
        double incomeY1 = 17000;
        double incomeY2 = 20000;
        double incomeY3 = 25000;
        double commission, X, Sale_Amount;


        for (int i = 1; i <= 3; i++) {        //3 here is the number of years
            if (i == 1)
                commission = incomeY1 - base_salary;
            else if (i == 2)
                commission = incomeY2 - base_salary;
            else
                commission = incomeY3 - base_salary;


            X = (commission - 5000 * 0.08 - 5000 * 0.1) / 0.12;
            Sale_Amount = X + 10000;
            System.out.println("The sale you have to generate for the "+ i + " year is: $" + Sale_Amount);
        }


    }
}
