package HashMap;
import java.util.*;
public class HashSetBasic {
    public static void main(String[] args){
        // first the arraysize to be taken as input
        // next the array is taken as input
        // then the next input is the number of queries
        // next the queries are given as input
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        int[] Hash = new int[13];
        int count = 0;
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
            Hash[arr[i]]++;
        }
        System.out.println("Enter the number of queries");
        int queries = sc.nextInt();
        int x = 0;
        for(int y = 1; y <= queries; y++){
           x = sc.nextInt();
           System.out.println(Hash[y]);
        }
        

    }
}
