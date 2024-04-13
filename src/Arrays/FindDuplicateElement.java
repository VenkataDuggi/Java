package Arrays;

public class FindDuplicateElement {

    public static void main(String[] args) {


        int arr[] = {5, 2, 1, 1, 5, 99, 2, 6, 99};
      //  int brr[] = {arr.length};

        for (int i = 0; i < arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println("Duplicate numbers are "+arr[i]);
                }
            }
        }
    }
}