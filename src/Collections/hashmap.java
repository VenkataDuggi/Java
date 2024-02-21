package Collections;

import java.util.HashMap;
import java.util.Map;

public class hashmap {


    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("Name","vanekat");
        map.put("age","10");
        map.put("city","bangalore");

        //System.out.println(map.get("Name"));

        for(Map.Entry<String, String> value:map.entrySet()){

            System.out.println(value.getKey() +":" +value.getValue());
        }
    }
}
