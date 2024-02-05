package Collections;

import java.util.List;

public class list {

    public static void main(String [] args)
    {

        List Fruits = List.of("apple", "banana","Watermelon");
        List<String> Shopping_items = List.of("Ghee","Vegetables","Spoons");

        List All_items = List.of("Tomato", true , 132, 23.4f, "Basket");

        System.out.println(Fruits.get(0));

        System.out.println(Fruits.size());

        System.out.println(All_items.get(1));

        System.out.println(All_items);

        System.out.println(All_items.indexOf(23.4f));

        System.out.println("Vegetables are in following index "+ Shopping_items.indexOf("Vegetables"));










    }

}
