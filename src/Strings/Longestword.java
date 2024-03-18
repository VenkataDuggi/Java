package Strings;

public class Longestword {

    public static void main(String[] args) {


        String str = "Hi Hello How are you";
        String wordsplit[] = str.split(" ");
        String longword ="";

        for(int i =0; i<wordsplit.length-1;i++)
        {
            for(int j=i+1;j< wordsplit.length-1;j++)
            {
                if(wordsplit[i].length()> wordsplit[j].length())
                {
                    longword=wordsplit[i];

                }
            }
        }
        System.out.println(longword );
        System.out.println(wordsplit[2]);
    }
}

