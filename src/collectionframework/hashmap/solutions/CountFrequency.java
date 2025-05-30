package collectionframework.hashmap.solutions;

import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 10, 10, 20, 5, 20};
        countFreq(arr);
    }
    static void countFreq(int arr[]) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
