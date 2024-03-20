package Basics;

import java.util.ArrayList;
import java.util.List;

public class basic {

    public static void main(String[] args) {

      List list = new ArrayList();
      list.add("Hi");

      list.add("Bye");

        System.out.println(list);
        list.remove("Bye");
        list.add(1,"Sye");
        System.out.println(list);
    }


}






