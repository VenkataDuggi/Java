package Collections.Map;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class treemap {

        public static void main(String[] args) {

            TreeMap<String, Integer> map = new TreeMap<>();

            map.put("Experience",20);
            map.put("age",45);
            map.put("Salary",30000);

          System.out.println(map.get("Salary"));

           for(Map.Entry<String, Integer> value:map.entrySet())
           {
               System.out.println(value.getKey() +":" +value.getValue());
           }

          //  System.out.println(map);
        }
        }



