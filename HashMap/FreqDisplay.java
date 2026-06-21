package HashMap;
import java.util.*;
public class FreqDisplay {
    //frequency display of all integers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("enter the elments of the array: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        FrequencyDisplay(arr, n);


    }
    public static void FrequencyDisplay(int[] arr, int n){
        boolean[] visited = new boolean[n];
        for(int i = 0; i < n; i++){
            if(visited[i])
                continue;
            int count = 1;
            for(int j = i+1; j < n; j++){
                if(arr[i] == arr[j]){
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + "    " + count);
            
        }
    }

}
