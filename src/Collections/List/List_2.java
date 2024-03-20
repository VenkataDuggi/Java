package Collections.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_2 {

    public static void main(String[] args) {

        List<String> mylist = new ArrayList<>();
        mylist.add("Grand Father");
        mylist.add("Father");
        mylist.add("Son_1");
        mylist.set(2,"Son_2");

        for(Object obj:mylist)
            System.out.println(obj);

        mylist.remove(2);
        mylist.set(1,"Father is Great");

        for(int i =0; i<mylist.size();i++)
        {
            System.out.println(mylist.get(i));
        }

        Iterator items = mylist.iterator();
        while (items.hasNext()){
            System.out.println(items.next());


        }

    }
}
