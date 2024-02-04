package Conditions;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {


        // Find Largest Number from 3 numbers

       Scanner sc = new Scanner(System.in);
       System.out.println("Enter three Number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c)

        {
            System.out.println("A is Greater");

        }
        else if (b>a && b>c)
        {

            System.out.println("B is Greater");

        }
        else
        {

            System.out.println("C is Greater");

        }
    }
}
