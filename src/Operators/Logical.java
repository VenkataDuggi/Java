package Operators;

import java.util.Scanner;

public class Logical {

    public static void main(String[] args) {

        // && and || and !

        System.out.println(!(true));

        System.out.println("----------------------------------");

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);

        System.out.println("----------------------------------");

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);

        System.out.println("----------------------------------");


        boolean c ;
        int a =10;
        c = a < 5 || a >6 ;
      //  c = !(a < 5 || a >6) ;  // false || true is true and !true is false

        System.out.println(!c);


    }
}
