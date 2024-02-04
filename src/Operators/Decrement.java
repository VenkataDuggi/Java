package Operators;

public class Decrement {

    public static void main(String[] args) {

        int a=10;

        int c= (a-- + --a + a--);

        // Part A(a--) (Exp = 9, a =10) --> o/p =10
        // Part B(--a) (Exp = 8, a =8) --> o/p =8
        // Part C(a--) (Exp = 8, a =7) --> o/p =8

        System.out.println(c);
        System.out.println("value of a is "+a + "\n---------------------");

        int b=10;
        int d= (--b + b-- + b--);

        // Part A(--b) (Exp = 9, b =9) --> o/p =9
        // Part B(b--) (Exp = 9, b =8) --> o/p =9
        // Part C(b--) (Exp = 8, b =7) --> o/p =8


        System.out.println(d);
        System.out.println("value of b is "+b);

    }
}
