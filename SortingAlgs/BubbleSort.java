package SortingAlgs;
import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of the array");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        // sorting
        // bubble sort will do sort with the number of iterations of n-1
        int temp = 0;
        for(int i = 1; i <= n - 1; i++){
            for(int j = 0; j < n - 1; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        
    }

}
