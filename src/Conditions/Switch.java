package Conditions;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {


        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number");
        int a = sc.nextInt();


        switch (a)
        {
            case 1:
                System.out.println("Hi");
                break;
            case 2:
                System.out.println("Bye");
                break;
            default:
                System.out.println("Not Valid Number");

        }

    }
}
