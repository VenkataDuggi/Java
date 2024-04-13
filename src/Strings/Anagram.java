package Strings;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String str = "zrame";
        String str1 = "yname";

        char firststring[] = str.toCharArray();
        Arrays.sort(firststring);
        char secondstring[] = str1.toCharArray();
        Arrays.sort(secondstring);

        System.out.println(firststring);
        System.out.println(secondstring);




        for(int i=0;i<firststring.length;i++)
        {
            if(firststring[i]==secondstring[i]) {


            }
            }
        System.out.println("Not Anagram");

        }



    }

