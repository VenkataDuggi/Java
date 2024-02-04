package Arrays;

public class Leap_Year {
    public static void main(String[] args) {

        int year[] ={1624,1900,2000,2024,};
        //int year = 1900;


        for(int i=0;i<year.length;i++)
            if ((year[i] % 400 == 0) || (year[i] % 100 != 0 && year[i] % 4 == 0)) {
                System.out.println(+year[i] + " is Leap Year");
            } else {
                System.out.println(+year[i] + " is Not Leap year");
            }
    }
}
