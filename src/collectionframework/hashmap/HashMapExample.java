package collectionframework.hashmap;


import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {


         Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("test",1);
        hashMap.put("test",1);
        hashMap.put(null,null);
        hashMap.put("test4",null);
        hashMap.put(null,5);

        System.out.println(hashMap);

//        hashMap.remove("test");
//
//        System.out.println(hashMap);
//        System.out.println(hashMap.get("test4"));
//
//        System.out.println(hashMap.containsKey("test35"));


        for(Map.Entry<String,Integer> e:hashMap.entrySet()){
            System.out.println(e.getKey()+" : "+e.getValue());
        }
    }
}



// Two List unordered n number of element
//find common among those