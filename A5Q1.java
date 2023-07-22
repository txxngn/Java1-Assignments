package A5;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class A5Q1 {
    public static void main (String [] args){
        /*
        WAP prompt user to input the size and integers of 2 array list1 and list2.
        Call the 1st method called "Output" with arguments are the arrays, print list1 and list2 in the method.
        Call the 2nd method called "compare" to see if both arrays have same elements.
        If equal -> return 1 and print equal, if not -> return -1 and print not equal.
        Call the 3rd method called "compareReverse" with list1 is the argument to check whether
        list1 is equal to the list1's reversed order.
        In method "compareReverse", nest another method called "printAnswer" to print if
        list1 equal to list1's reversed order -> print true.
         */
        Scanner input = new Scanner (System.in);

        //setup for list1
        System.out.println("Enter the size of the first array: ");
        int list1[] = new int[input.nextInt()];
        System.out.println("Enter integers for the first array: ");
        for (int i = 0; i < list1.length; i++){
            list1[i] = input.nextInt();
        }


        //setup for list2
        System.out.println("Enter the size of the second array: ");
        int list2[] = new int[input.nextInt()];
        System.out.println("Enter integers for the second array: ");
        for (int i = 0; i < list2.length; i++){
            list2[i] = input.nextInt();
        }

        //Invoke "Output" method
        Output(list1, list2);
        System.out.println();

        //Invoke "compare" method
        if (compare(list1,list2) == 1){
            System.out.println("Both lists are equal.");
        }
        else
            System.out.println("Both lists are NOT equal.");
        System.out.println();

        //Invoke "compareReverse" method
        compareReverse(list1);

    }

    //Method "Output"
    public static void Output (int arr1[], int arr2[]){
        System.out.print("List 1 is : ");
        for (int i : arr1){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("List 2 is : ");
        for (int i : arr2){
            System.out.print(i + " ");
        }
    }

    //Method "compare"
    public static int compare (int arr1[], int arr2[]){
        if (arr1.length - arr2.length == 0){
            boolean isEqual = false;
            for (int i = 0; i< arr1.length; i++){
                if (arr1[i] - arr2[i] == 0) {
                    isEqual = true;
                }
                else
                    break;
            }
            if (isEqual)
                return 1;
            else
                return -1;
        }
        else
            return -1;
    }

    //Method "compareReverse"
    public static void compareReverse (int[] arr){
        ArrayList<Integer> addList1 = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++){
            addList1.add(arr[i]);
        }
        ArrayList<Integer> Reversed_list1 = new ArrayList<Integer>(addList1);
        Collections.reverse(Reversed_list1);
        boolean checkEqual = addList1.equals(Reversed_list1);
        printAnswer(checkEqual);
        }

    public static void printAnswer (boolean checkEqual){
        if (checkEqual == true)
            System.out.println("List 1 and it's reversed is equal");
        else
            System.out.println("List 1 and it's reversed is NOT equal");
    }

}
