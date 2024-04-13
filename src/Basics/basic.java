package Basics;

import java.util.ArrayList;
import java.util.Arrays;

public class basic {

    public static void main(String[] args) {


        int arr[] = {4, 6, 1, 2, 0};



        int temp =0;


        for (int i = 0; i < arr.length;i++)
        {

            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {

                    temp=arr[i];
                    arr[j]=arr[i];
                    arr[i]=temp;

                }
            }


        }System.out.println(arr[1]);

    }

}







