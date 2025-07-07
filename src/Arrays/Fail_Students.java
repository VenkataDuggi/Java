package Arrays;

import java.util.Scanner;

public class Fail_Students {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float[] Marks = new float[6];

        System.out.println("Enter 6 Subject Marks");
        Marks[0]=sc.nextInt();
        Marks[1]=sc.nextInt();
        Marks[2]=sc.nextInt();
        Marks[3]=sc.nextInt();
        Marks[4]=sc.nextInt();
        Marks[5]=sc.nextInt();

        for(int i=0;i<Marks.length;i++)
        {
            if(Marks[i]<40)
            {
                System.out.println("The subject failed is " + Marks[i]);
            }
            else
            {
                System.out.println("Subject passed is " + Marks[i]);
            }

        }


    }
}
