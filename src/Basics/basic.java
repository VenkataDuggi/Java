package Basics;

import java.util.ArrayList;
import java.util.Arrays;

public class basic {



    public static int uppercase(String str)

    {
        int count =0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>='A' && str.charAt(i)<='Z')
            {
                count++;
            }

        }return count;


    }
    public static void main(String[] args) {

        int count =0;
      int result=  uppercase("HellO");
        System.out.println(result);




    }

}


