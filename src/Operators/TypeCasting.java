package Operators;

public class TypeCasting {

    public static void main(String[] args) {

        byte b =10;
    //  int a = b; //Implicit Casting - JVM
        int a = (int)b; //Explicit Casting -JVM
        System.out.println(a);

        int a1 =300;
        byte b1 = (byte)a1;
        System.out.println(b1); // prints 44, because in bit mapping last 8 bits are taken
    }
}
