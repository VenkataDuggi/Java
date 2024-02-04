package Arrays;

public class Initilization {

    public static void main(String[] args) {

        int int_arr[] = {10, 4, 20, 40, 23};
        long l_arr[] = {23l, 56l, 88, 999l};
        float f_arr[] = {23f, 56.0f, 88.8f, 999.67f};
        double d_array[] = {23.3, 44.0, 88.98, 999};

        char c_arr[]={'d' , 'e', 'j'};
        String s_arr[]={"Hi", "bye", "world"};

        // we can also intilize like int[] int_arr = , long[] l_arr , String[] s_arr


        System.out.println(int_arr.length);
        System.out.println(s_arr.length);

        System.out.println(int_arr[0]);
        System.out.println(int_arr[1]);
        System.out.println(int_arr[2]);
        System.out.println(int_arr[3] + "\n----------------------");

        for (int i = 0; i < int_arr.length; i++) {
            System.out.println(int_arr[i]);
        }


        for (int i = 0; i < int_arr.length; i++) {
            if (int_arr[i] == 40)
                System.out.println("the number is 40");


        }

    }
}