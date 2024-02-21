package Collections;

public class CountWords {

public static int count(String str){


    int count =0;

    for(int i=0;i<str.length()-1;i++){


        if ((str.charAt(i)==' ' && str.charAt(i + 1)!=' ')) {
            count++;
        }

    }
    return str.charAt(0)==' '?count:count+1;
}
    public static void main(String[] args) {

        int val = count("   Hello How are you");

        System.out.println(val);

        }


    }

