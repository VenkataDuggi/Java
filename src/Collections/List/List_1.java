package Collections.List;

import java.util.ArrayList;
import java.util.List;

public class List_1 {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("Hi");


        list.add("Bye");

        list.add(1,"Sye");

        System.out.println(list);
        list.remove("Bye");
        list.add(1,"Joye");

        System.out.println(list);

        list.set(1,"Oye");

        System.out.println(list + "\n");

        //Another way
        for(int i =0; i<list.size();i++)

            System.out.println(list.get(i));

        //Another way
        for(Object obj: list)
            System.out.println(obj);

    }


}

