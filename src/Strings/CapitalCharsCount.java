package Strings;

public class CapitalCharsCount {

    public static int CountUppercase(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
          //      if(s.charAt(i)>='a' && s.charAt(i)<='z')
                count++;

        }return count;

    }


    public static void main(String[] args) {

        int res = CountUppercase("HelloWorld");
        System.out.println("No.of Uppercase characters is = "+res);

    }
}




