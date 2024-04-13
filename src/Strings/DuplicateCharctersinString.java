package Strings;

public class DuplicateCharctersinString {

    public static void Duplicatechar(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    System.out.println("Duplicate elements are "+s.charAt(i));
                }
            }
        }

    }

    public static void main(String[] args) {

        String s= "venkatav";

        Duplicatechar(s);

    }
}
