package HashMap;

import java.util.*;

public class CharHashing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String s = sc.nextLine();

        int[] hash = new int[26];

        for(int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }

        System.out.println("Enter number of queries:");
        int queries = sc.nextInt();

        for(int i = 0; i < queries; i++) {

            char ch = sc.next().charAt(0);

            System.out.println(hash[ch - 'a']);
        }

        sc.close();
    }
}