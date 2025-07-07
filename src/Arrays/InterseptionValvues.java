package Arrays;

public class InterseptionValvues {

    public static void main(String[] args) {


        int arr[] = {1, 2, 3, 4, 5};
        int brr[] = {4, 5, 6, 7, 8};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < brr.length; j++) {

                if (arr[i] == brr[j])

                    System.out.println("Similar values are " + arr[i]);

            }

        }
    }

}