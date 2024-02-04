package Strings;

public class Object_Area {

    public static void main(String[] args) {

        String str = "Think Wise"; // This str will be created in String pool in heap

        String str1 = new String("Think Wise"); // This str1 will be created in Object Area in heap

        System.out.println((str + str1) + "\n----------------\n");

        System.out.println(str == str1);  // false

        System.out.println(str.equals(str1));  //true



    }
}
