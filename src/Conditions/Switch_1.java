package Conditions;

import java.util.Scanner;

public class Switch_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Browser name");
        String browser = sc.nextLine();

        switch (browser.toLowerCase())
        {

            case "firefox":
                System.out.println("Execute the Firefox Code");
                break;
            case "Chrome":
                System.out.println("Execute the Firefox Code");
                break;

            case "Edge":
                System.out.println("Execute the Firefox Code");
                break;

            case "safari":
                System.out.println("Execute the Firefox Code");
                break;
            default:
                System.out.println("I have no idea which browser it is ");
                break;

        }
    }
}
