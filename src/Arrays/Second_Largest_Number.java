package Arrays;

public class Second_Largest_Number {

    public static void main(String[] args) {

        int arr[] = {34, 56, 234, 1, 0, 89};
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++)

                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
        }
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i] + " ");
        System.out.print("\n");

        System.out.println("Second Largest Number in array is " +arr[1]);
    }
}


