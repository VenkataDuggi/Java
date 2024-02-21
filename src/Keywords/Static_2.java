package Keywords;

public class Static_2 {


        // static variable
        static int a = 10;  // can be accessed with only static methods or blocks
        static int b;  // can be accessed with only static methods or blocks
        int c;
        // static block
        static {

            System.out.println("static block initilized");
            b=a *4;  //They can only directly access static data.
        }

        public static void main(String[] args)
        {
            System.out.println("from main");
            System.out.println("Value of a : "+a);
            System.out.println("Value of b : "+b);


        }
    }

