package Functions;

public class Method_OverLoading {

    public static void main(int a)
    {
        System.out.println("One Parameter");
    }

    public static void main(int a, int b)
    {
        System.out.println("Two Parameters");
    }

    public static void main(int a, int b, int c)
    {
        System.out.println("Three Parameters");
    }

    public static void main()
    {
        System.out.println("No Parameters");
    }


    public static void main(String[] args) {

        main(1);
        main(3,4);
        main(6,1,2);
        main();


    }
}
