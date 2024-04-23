package Basics;



public class basic {

    //This is sample sentence, this is another sentence here.

    public static void main(String[] args) {


        int count=0;
        String s = "How are youu";

        for(int i=0; i<s.length();i++) {

            for(int j=i+1; j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    System.out.println("Duplicate charcters "+s.charAt(j));
                }

        }


    }
     //   System.out.println("No.of.words" +count+1);



    }

}







