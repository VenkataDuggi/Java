package Strings;

public class Bodmas {
    public static void main(String[] args) {

        String s1 = " Hello ";
        String s2 = "World ";

        int a =10;
        int b =20;

        System.out.println(s1+s2+a+b);
        System.out.println(s1+s2+(a+b)); //BODMAS
        System.out.println(a+b+s1+s2);

    }
}
