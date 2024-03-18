package Arrays;

public class Second_Largest_Number {

    public static void main(String[] args) {

        int arr[] = {11, 1112, 11, 19, 1, 10};
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

// The code below is for every digit is same
        for (int i = 1; i < arr.length; i++) {
            // If the element is not
            // equal to largest element
            if (arr[i] != arr[0]) {
                System.out.printf("The second largest "
                                + "element is %d\n",
                        arr[i]);
                return;
            }
        }

        System.out.printf("There is no second "
                + "largest element\n");
    }
    }



