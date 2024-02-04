package Operators;

import java.util.Scanner;

public class Ternary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        String s = (a > b ? "a is Greater" : "b is greater");
        System.out.println(s);

        int c =10;
        int d = 30;

        int max = c > d ? c : d ;
        int min = c < d ? c : d ;

        System.out.println(max);
        System.out.println(min + "\n--------------------------");

        // Find largest in 3 numbers

        int a1 = 245, b1=55, c1=45;

        int maximum = (a1>b1) ? ((a1>c1)?a1:c1) : (b1>c1?b1:c1) ;
        System.out.println("largest number is s " + maximum);



    }
}
