package Functions;

public class Basic_Function {

    static int sum(int x, int y) {
        int z = x + y;
        return z;

    }

    static int sum(int x)
    {
        return x;
    }

    static void sum()
    {
        System.out.println("Without Parameters");

    }

    static int sum1()
    {
        return 99;
    }


    public static void main(String[] args) {


        int a =sum(4,6);
        System.out.println("Sum is = " +a);

        int b= sum(7);
        System.out.println(b);

        sum();

        int c = sum1();
        System.out.println(c);
    }
}

