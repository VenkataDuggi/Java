package Arrays;

public class FizzBuzz {
    public static void main(String[] args) {

        // In 100 numbers, If value is divided by 3 replace with Fizz
        // If value is divided by 5 replace with Buzz
        // If value is divided by 3 & 5 replace with FizzBuzz

        // Apply BODMAS rule, other first if will not work

        for(int i=1;i<100;i++)
        {

            if((i%3==0) && (i%5==0))
            {
                System.out.println("FizzBuzz");
            }

            else if(i%3==0)
            {
                System.out.println("Fizz");

            }
            else if(i%5==0)
            {

                System.out.println("Buzz");
            }

            else {
                System.out.println(i);
            }

        }

    }
}
