package HashMap;
import java.util.*;

public class HashMapBasics {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        HashMap<String, Integer> Map = new HashMap<>();
        Map.put("aniketh", 23); Map.put("rishik", 22);
        Map.put("trinath", 20); Map.put("Raj", 19);
        System.out.println(Map);
        System.out.println("map's size is " + Map.size());
        // removes the key and returns the value of the removed one
        System.out.println(Map.remove("trinath"));
        // if you want to get the value of a key then
        System.out.println(Map.get("Raj"));
        // for example if we introduce a new value to the Map 
        // with the same key it will  update the key
        Map.put("Raj", 21);
        System.out.println(Map);
        // for each loop in HashMap
        for(String key: Map.keySet()){
            System.out.println(key + " " + Map.get(key));

        }
        System.out.println(Map.containsKey("aniketh"));
    }

}
