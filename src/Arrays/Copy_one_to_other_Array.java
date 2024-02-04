package Arrays;

public class Copy_one_to_other_Array {

    public static void main(String[] args) {

        int arr[]={34,67,2,9};
        int brr[]= new int[arr.length];

        brr=arr; // Doesn't copy elements of a[] to b[], only makes
                 // b refer to same location

        System.out.println(brr + "\n--------------------");

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n ");
        for(int i=0;i<brr.length;i++)
        {
            System.out.print(brr[i] +" ");
        }
    }
}
