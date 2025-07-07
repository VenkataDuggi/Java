package Arrays;
import java.util.Arrays;

public class Add_two_arrays {


    public static void main(String[] args) {

        int arr[] = {34, 12, 78, 99};
        int brr[] = {34, 16, -1, 200};
        int crr[]= new int[arr.length];  // Important



    for(int i=0;i<arr.length;i++)
    {
       crr[i] =(arr[i]+brr[i]);

    }

    for(int i=0;i<crr.length;i++)
    {
        System.out.print(crr[i] + " ");
    }


}


}

