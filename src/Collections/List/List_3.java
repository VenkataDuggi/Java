package Collections.List;

import java.util.*;

public class List_3 {

    public static void main(String[] args) {

        List<Integer> mylist = new ArrayList<>();

        Collection mylist_1 = new ArrayList();

        Vector V = new Vector<>();

        mylist.add(64);
        mylist.add(0,89);
        mylist.add(99);
        mylist.set(2,109);


        for(Object obj:mylist)
        {
            System.out.println(obj);
        }
    }
}
