package Arrays;

public class Two_Array_Comparison {

    public static void main(String[] args) {

        int arr[]={34, 56, 78, 99};
        int brr[]={34, 55, -1 ,99};

        if(arr.length == brr.length)
        {
            System.out.println("length is equal");

            for(int i=0;i<arr.length;i++)
            {

                if(arr[i]==brr[i])
                {
                    System.out.println("the values are equal under " + i +" index");
                }
                else
                {
                    System.out.println("the values are not equal under  " +i +" index");
                }

            }

        }
        else
        {
            System.out.println("length is not equal");
        }
    }
}

/*

boolean result = Arrays.equals(a, b);

// condition to check whether the
// result is true or false
        if (result == true) {
        // Print the result
        System.out.println("Two arrays are equal");
        }
                else {
                // Print the result
                System.out.println("Two arrays are not equal");
        }
                }
                }*/
