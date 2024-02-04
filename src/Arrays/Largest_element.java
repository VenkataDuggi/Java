package Arrays;

public class Largest_element {
    public static void main(String[] args) {

        int arr[] = {9,98,2,345,8978,8};
        int max = arr[0];

        for (int i=0;i<arr.length;i++)
        {

            if(arr[i]>arr[0])

                max = arr[i];

        }
        System.out.println(max);
    }
}
