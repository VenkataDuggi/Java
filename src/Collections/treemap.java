package Collections;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class treemap {

        public static void main(String[] args) {

            TreeMap<String, Integer> map = new TreeMap<>();

            map.put("name",20);
            map.put("age",1);
            map.put("city",-3);

            //System.out.println(map.get("Name"));

            for(Map.Entry<String, Integer> value:map.entrySet()){

                System.out.println(value.getKey() +":" +value.getValue());
            }
        }
    }


