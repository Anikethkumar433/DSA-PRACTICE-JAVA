package dailypractice;
import java.util.*;

public class SecondHighestNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.println("enter the elements of the array: ");
        for(int i = 0; i < N; i++ ){
            arr[i] = sc.nextInt();
        }
        
        int largest = arr[0];
        int larger = arr[1];
        if(larger > largest){
            int temp = largest;
            largest = larger;
            larger = temp;
        }
        for(int i = 0; i < N; i++){
            if(arr[i] > largest){
                int temp = largest;
                largest = arr[i];
                larger = temp;
            }
            else if(arr[i] > larger && arr[i] < largest){
                larger = arr[i];
            }
        }
        System.out.println("the second largest element in the array is " + larger);
    }
}
