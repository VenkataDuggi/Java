package Imp_programs;

public class Fibanacci {


    public static void main(String[] args) {


        {
            int num1 = 0, num2 = 1, num = 10;

            for (int i = 0; i < num; i++) {
                // Print the number


                // Swap
                int num3 = num2 + num1;
                num1 = num2;
                num2 = num3;

                System.out.print(num1 + " ");
            }
        }
    }
}