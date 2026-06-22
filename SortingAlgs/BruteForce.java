package SortingAlgs;
import java.util.*;

public class BruteForce {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // input an array
        System.out.println("enter the size of an array");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.println("enter the elements of the array");
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        // sorting
        int temp = 0;
        for(int i = 0; i < N; i++){
            for(int j = i + 1; j < N; j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }

}
