package Strings;

public class SwappingTwoStrings {

    public static void main(String[] args) {

        String s1 = "Venkata";
        String s2 = "Duggi";

// Combine both the strings s1 and s2 using the concatenation(+) operator
        s1 = s1 + s2;
        System.out.println(s1);

// Use the substring method to get the subset of the combined string
        s2 = s1.substring(0, s1.length() - s2.length());
        System.out.println(s2.length());
        s1 = s1.substring(s2.length());


        System.out.println("s1 =" + s1);
        System.out.println("s2 =" + s2);

    }

}


