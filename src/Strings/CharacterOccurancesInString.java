package Strings;

public class CharacterOccurancesInString {

    public static int occurance(String str, Character ch)
    {
        int count =0;
        for(int i=0;i<str.length();i++)
        if(str.charAt(i)==ch)
        {
            count ++;
        }

       return count;
    }

    public static void main(String[] args) {


        String str ="Hi Hello";
        char ch ='H';

        System.out.println("occurances of charcter is " +occurance(str,ch));
    }

}
