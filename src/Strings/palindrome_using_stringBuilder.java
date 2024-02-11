package Strings;

public class palindrome_using_stringBuilder {

    public static void main(String[] args) {



        Boolean result = isPalindrome("LALALA");


        if (result) {
            System.out.println("palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

        public static Boolean isPalindrome(String str) {
        String str3 = str;
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return str3.equalsIgnoreCase(sb.toString());
        }

    }


    