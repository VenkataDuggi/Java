package Arrays;

public class DeleteDuplicateElements {

    // Not working
    public static void main(String[] args) {

        int arr[] = {1, 3, 3, 1, 4, 6, 7, 1, 4};
        int temp[] = new int[arr.length]; //only this works
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
                temp[j++] = arr[arr.length - 1];

                //     for (int i = 0; i < j; i++)
                arr[i] = temp[i];


            }
            System.out.println(temp[i]);
        }

    }
}









