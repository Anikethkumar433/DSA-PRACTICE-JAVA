import java.util.*;
public class PrimePicnic {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //A number will be given and the sum of prime numbers should be returned till the number N
        int N = sc.nextInt();
        int sum = 0;
        for(int i = 2; i <= N; i++){
            if(isPrime(i) == true){
                sum += i;
            }
        }
        System.out.println("the sum of the prime numbers is:" + sum);
    }
        public static boolean isPrime(int num){
            for(int i = 2; i < num; i++){
                if(num == 2){
                    return true;
                }
                else if(num % i == 0){
                    return false;
                }
            }
            return true;
        }
    }
