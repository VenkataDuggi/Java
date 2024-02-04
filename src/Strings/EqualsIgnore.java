package Strings;

public class EqualsIgnore {

    public static void main(String[] args) {

      String  str = "Common Friend";

      String str1 = "common friend";

        System.out.println(str ==str1);  // false

        System.out.println(str.equalsIgnoreCase(str1)); // true


    }

}
