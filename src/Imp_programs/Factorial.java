package Imp_programs;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();

   /*     long fact =1;

        for(int i=1;i<=num;i++)

            fact = (fact * i);

        System.out.println("Factorial of given number is " + fact);  */

    long fact =1;
    int i=1;
    while(i<=num) {
        fact = fact * i;
        i++;

    }
        System.out.println("factorial is " +fact);

    }

}


