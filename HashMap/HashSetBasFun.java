package HashMap;
import java.util.*;

public class HashSetBasFun {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> Set = new HashSet<>();
        // to add numbers into the set then 
        Set.add(77); Set.add(65); Set.add(65); Set.add(86);
        System.out.println(Set.size());
        System.out.println(Set.contains(21) + " " +Set.contains(65));
        Set.remove(65);
        System.out.println(Set.contains(65));
        System.out.println(Set.size());
        // to clear all the elements in the set
         Set.clear();
         // to traverse and print all the elements in the set
         // as it will print{} so we can use for each loop 
         for(int ele: Set){
            System.out.println(ele + " ");
         }
    }
}
