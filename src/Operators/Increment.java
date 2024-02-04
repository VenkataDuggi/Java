package Operators;

public class Increment {

    public static void main(String[] args) {
        int a=10;

        int c= (a++ + ++a + a++);

        // Part A(a++) (Exp = 10, a =11) --> a =10
        // Part B(++a) (Exp = 12, a =12) --> a =12
        // Part C(a++) (Exp = 12, a =13) --> a =12


        System.out.println(c);
        System.out.println("value of a is "+a + "\n---------------------");

        int b=10;
        int d= (++b + b++ + b++);

        // Part A(++b) (Exp = 11, b =11) --> b =11
        // Part B(b++) (Exp = 11, b =11) --> b =11
        // Part C(b++) (Exp = 12, b =13) --> b =12


        System.out.println(d);
        System.out.println("value of b is " +b  + "\n---------------------");


        int e=10;
        int f= (--e + e++ + ++e);
        System.out.println(f);
        System.out.println("value of e is " +e);

    }
}
