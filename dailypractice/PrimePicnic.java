package dailypractice;
import java.util.*;

public class PrimePicnic {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        for(int i = 2; i <= N; i++){
            if(isPrime(i) == true){
                sum += i;
            }
        }
        System.out.println(sum);
        
    }
    public static boolean isPrime(int X){
        for(int i = 2; i <= X/2; i++){
            if (X == 2){
                return true;
            }
             else if(X % i == 0){
                return false;
            }
            
        }return true;
    }

    
}
