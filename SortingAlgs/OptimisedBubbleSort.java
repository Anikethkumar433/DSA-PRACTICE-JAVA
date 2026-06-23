package SortingAlgs;
import java.util.*;

public class OptimisedBubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of the array");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        // optimised bubble sort
        int temp = 0;
        for(int i = 0; i <= n-2; i++){
            int swaps = 0;
            for(int j = 0; j <= n-2-i; j++){
                if(arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
            if(swaps == 0) break;
        }
        System.out.println(Arrays.toString(arr));
        
    }

}
