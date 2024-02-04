package Operators;

public class Relational {
    public static void main(String[] args) {

        int a=30;
        int b=23;

        // < , > , <= , >= , == , != , ≠
        if(a<=b)
        {
            System.out.println("B is large Value");

        }
        else
        {
            System.out.println("A is Large Value");
        }

        int age_venkat = 33;
        int age_hari = 45;

        Boolean Result = (age_venkat >= age_hari );

        System.out.println(Result); // output is false

        System.out.println(15 == 15);
        System.out.println('A' == 65);  // ASCII and output is true
        System.out.println('B' == 69);

        System.out.println("--------------------------------------");

        System.out.println('A'==65.0);
        System.out.println('B'==66.0f);
        System.out.println('A'==65.0d);


    }
}
