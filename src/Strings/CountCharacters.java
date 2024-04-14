package Strings;

public class CountCharacters {

    public static int CountChars(String s)
    {
        int count =0;
        for(int i=0; i<s.length();i++)
        {
            if(s.charAt(i)!=' ' )
            {
                count ++;
            }

        }return count;

       // System.out.println("Characters in a string is = " +count);
    }

    public static void main(String[] args) {

        int r=  CountChars("Hello Hi how are you");
        System.out.println("Characters in a string is = " +r);
    }
}
