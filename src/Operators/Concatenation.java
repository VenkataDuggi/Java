package Operators;

public class Concatenation {

    public static void main(String[] args) {

        String str = "Venkat";

        int a = 5;
        int b = 9;

       System.out.println(str+ a+ b); //output is Venkat59

        System.out.println(str+b); //out put is 9Venkat

        System.out.println(a+b+str); //output is 14Venkat (BODMAS Rule)
    }
}
