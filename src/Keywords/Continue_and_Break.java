package Keywords;

public class Continue_and_Break {

    public static void main(String[] args) {

        int i;
        for(i=1; i<6;i++)
        {
            if(i > 3)
              continue;
            //break;  // in this case i is 3
        }
        System.out.println("Value of i is " + i);

    }
}
