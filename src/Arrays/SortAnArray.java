package Arrays;

import java.util.Arrays;

public class SortAnArray {


        public static void main(String[] args)
        {
            //defining an array of integer type
            int [] arr = new int [] {90, 23, 5, 109, 12, 22, 67, 34};
            //invoking sort() method of the Arrays class
            Arrays.sort((arr));

            System.out.println("Elements of array sorted in ascending order: ");
            //prints array using the for loop
            for (int i = 0; i < arr.length; i++)
            {
                System.out.print(arr[i] + " ");  //Ascending order
            }
            System.out.print("\n\n");

            for (int i = arr.length-1; i >= 0; i--)
            {
                System.out.print(arr[i] + " ");  //Descending order
            }

        }
    }

