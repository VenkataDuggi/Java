package Arrays;

import java.util.Arrays;

public class Descending_order {

    public static void main(String[] args) {
        int[] arr = {23,12,99,12,11};

           int temp =0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
                if(arr[i] < arr[j]) {

              temp = arr[i];
              arr[i]=arr[j];
              arr[j]=temp;


            }
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
