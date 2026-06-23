package SortingAlgs;
import java.util.*;

public class MoveZeroes {
    // Move zeroes to the end without changing the order of non-zero elements
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Refined bubble-shift approach: swap zero with next element when next is non-zero
        for (int i = 0; i < n; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] == 0 && arr[j + 1] != 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }

        System.out.println(Arrays.toString(arr));
    }
}