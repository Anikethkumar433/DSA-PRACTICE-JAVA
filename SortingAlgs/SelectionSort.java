package SortingAlgs;
import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int N = sc.nextInt();
        System.out.println("enter the elements of the array");
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        // built in sorting technique is merge sort
        // outer loop should work n-1 times
        for (int i = 0; i < N - 1; i++) {
             int getindx = i;

            for (int j = i + 1; j < N; j++) {
                if (arr[j] < arr[getindx]) {
                    getindx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[getindx];
            arr[getindx] = temp;
        }
        System.out.println(Arrays.toString(arr));
        
    }

}
