package Arrays;

public class MergeTwoArrays {


    public static void main(String[] args) {

        int arr[] = {5, 6, 7, 1};
        int brr[] = {22, 2, 45};
        int crr[] = new int[arr.length + brr.length];

        System.out.println(crr.length);


        for (int i = 0; i < arr.length; i = i + 1) {
            crr[i] = arr[i];
        }

        for (int i = 0; i < brr.length; i = i + 1) {
            crr[arr.length + i] = brr[i];
        }
        for (int k = 0; k < crr.length; k = k + 1) {
            System.out.print(crr[k] + " ");
        }
    }
}
