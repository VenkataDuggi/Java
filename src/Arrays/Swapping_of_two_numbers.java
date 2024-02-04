package Arrays;

import java.util.Scanner;

public class Swapping_of_two_numbers {
    public static void main(String[] args) {

     //   Scanner sc = new Scanner(System.in);
       // System.out.println("Enter two number");
        //int num1 = sc.nextInt();
        //int num2 = sc.nextInt();

        int arr[] = {12,24};

        System.out.println(+arr[0]+ " " + arr[1]);
        int temp;

        temp=arr[0];
        arr[0]=arr[1];
        arr[1]=temp;

        System.out.println(+arr[0]+ " " + arr[1]);
    }

}
