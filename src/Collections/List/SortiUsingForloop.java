package Collections.List;

import java.util.ArrayList;

public class SortiUsingForloop {

    public static void main(String[] args) {
        ArrayList< Integer > list = new ArrayList < Integer > ();

        list.add(10);
        list.add(5);
        list.add(4);
        list.add(2);

        for (int i = 0; i < list.size(); i++) {
            for (int j = list.size() - 1; j > i; j--) {

                if (list.get(i) > list.get(j)) {
                    int tmp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,tmp);
                }
            }
        }
        for (int i : list) {
            System.out.println(i);
        }
    }
}

