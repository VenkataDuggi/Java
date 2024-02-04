package Others;

import static java.lang.Integer.sum;

public class Everything {

    public static void main(String[] args) {

        //Datatypes

        int i =10;
        char c = 15;
        String str = "Venkat";
        float f= 10.12f;
        double d = 3.14d;

        System.out.println("Int value is "+i);
        System.out.println("Char value is "+c);
        System.out.println("Str value is "+str);
        System.out.println("Float value is "+f);
        System.out.println("Double value is "+d + "\n");

        //Loops

        int a=10, b=30;
        if(a>b)
        {
            System.out.println("a is grater " +a);
        }
        else
        {
            System.out.println("b is grater " +b);
        }

        for(int j=1; j<3;j++)
        {
            System.out.println("j Value is "+j);
        }

        int k= 1;
        while(k < 4)
        {
            System.out.println("k value is "+k);
            k++;
        }




        //Arrays

        int arr[] = {1,7,4,89};
        for(int l=0;l<arr.length;l++)
        {
            System.out.println("Array Values is "+arr[l]);
        }
        

    }
}
