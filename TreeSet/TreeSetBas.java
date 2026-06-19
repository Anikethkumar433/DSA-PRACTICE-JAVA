package TreeSet;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetBas {
    public static void main(String[] args){
        // Tree set is an ordered set for the HashSet
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> Set = new TreeSet<>();
        // to add numbers into the set then 
        Set.add(77); Set.add(65); Set.add(65); Set.add(86);
        System.out.println(Set.size());
        System.out.println(Set.contains(21) + " " +Set.contains(65));
        Set.remove(65);
        System.out.println(Set.contains(65));
        System.out.println(Set.size());
    }

}
