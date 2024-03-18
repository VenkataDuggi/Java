package Imp_programs;

public class Armstrong {


        public static void main(String[] args){
            int c=0,a,temp;

           // Armstrong number is a number that is equal to the sum of cubes of its digits.
            // For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers.
            int num = 153;
            temp = num;
            while(num>0){
                a=num%10;
                num=num/10;
                c=c+(a*a*a);
            }
            if(temp==c) {
                System.out.println(temp +  " is an Armstrong number");
            } else
                System.out.println(temp + " is not an armstrong number");
        }
    }

