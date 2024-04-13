package Strings;
import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class AnagramwithFunction {

    public void anagramcheck(char[] firststring, char[] secondstring)
    {
        for(int i=0;i<firststring.length;i++)
        {
            if(firststring[i]==secondstring[i])
            {
                continue;
            }
            else
                System.out.println("not equal");
        }

    }


    public void main(String[] args) {

        String str1 = "name";
        String str2 = "fame";

        char firststring[]= str1.toCharArray();
        char secondstring[]= str2.toCharArray();

        anagramcheck(firststring,secondstring);



    }


}
