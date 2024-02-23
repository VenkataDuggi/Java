package Strings;

public class Count_characters_in_String {


    public static void main(String[] args) {

        String str = "Hi I am Venkata Duggi";
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ')
            {
                count++ ;
            }
        }
        System.out.println("No.of charcters in a string is "+count);

    }
}
