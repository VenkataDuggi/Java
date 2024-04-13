package Strings;

public class stringbuilder {

    public static void main(String[] args) {


      StringBuilder str= new StringBuilder("Venkat");


        str.reverse();  // used to reverse the string
        System.out.println(str);

        StringBuilder str1= new StringBuilder("Jailer");
        str1.replace(0,0, "ra");
        str1.replace(str1.length()-2,str1.length()-1,"ety");

       // System.out.println(str.equalsIgnoreCase(str1));

        System.out.println(str1);
    }
}
