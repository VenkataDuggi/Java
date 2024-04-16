package Basics;

import java.util.ArrayList;
import java.util.Arrays;

public class basic {

    public static void main(String[] args) {

        ArrayList ls = new ArrayList();
        ls.add("Hi");
        ls.add("bye");
        ls.add(12);

        for(Object o : ls)
        {
            System.out.println(o);
        }


    }

}







