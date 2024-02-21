package Collections;

import java.util.HashMap;

public class CountCharceter {

    //mississippi
    public static void countChar(String str){
        HashMap<Character,Integer> map = new HashMap<>();
       char[] ch =  str.toCharArray();
       for(int i=0;i<ch.length;i++){

           if(map.containsKey(ch[i])){

               map.put(ch[i],map.get(ch[i])+1);  //Hashmap cannot contain duplicate keys, if it there it will update the key with the respective value
           }
           else{

               map.put(ch[i],1);
           }
       }

        System.out.println(map);
    }

    public static void main(String[] args) {
        countChar("mississippi");
    }
}
