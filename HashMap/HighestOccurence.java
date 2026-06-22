package HashMap;
import java.util.*;

public class HighestOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//         Input: array[] = {10,5,10,15,10,5};
//         Output: 10 15
        int[] arr = {2,2,3,4,4,2};
        boolean[] visited = new boolean[arr.length];
        int len = arr.length;
        int highfreq = 0, highestele = 0;
        int minfreq = len, lowestele = arr[0];
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele : arr){
            if(!map.containsKey(ele)) 
            map.put(ele,1);
            else{
                int freq = map.get(ele);
                map.put(ele,freq+1);
            }
        }
        for(int ele : arr){
            if(map.get(ele) > highfreq) {
                highfreq = map.get(ele);
                highestele = ele;
            }
            if(map.get(ele) < minfreq){
             minfreq = map.get(ele);
             lowestele = ele;
            }
    
        }
        System.out.println(highestele + "   " + lowestele);
        





        }
    }
