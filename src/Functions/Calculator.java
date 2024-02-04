package Functions;

public class Calculator {
    static int sum(int x, int y)
    {
        int z= x+y;
        return z;
    }
    static int sub(int x, int y)
    {
        int z= x-y;
        return z;
    }
    static int mul(int x, int y)
    {
        int z= x*y;
        return z;
    }
    static float div(float x, float y)
    {
        float z= x/y;
        return z;
    }

    public static void main(String[] args) {
        int a = sum(3,4);
        int b = sub(6,5);
        int c = mul(4,5);
        float d = div(43.3f,5f);

        System.out.println("sum is = " +a);
        System.out.println("sub is = " +b);
        System.out.println("mul is = " +c);
        System.out.println("div is = " +d);

    }
}
