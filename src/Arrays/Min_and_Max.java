package Arrays;

public class Min_and_Max {

    public static void main(String[] args) {

        int arr[]={4,3,56,78,2,3,456,77};

        int min=arr[0];
        int max=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min = arr[i];
            }
            if(arr[i]>max)
            {
                max = arr[i];
            }

        }
        System.out.println(min);
        System.out.println(max);
    }
}