package HashMap;

import java.util.HashMap;

public class ArraySubset {
    public static void main(String[] args) {
        int[] a = {11, 1, 13, 21, 7, 3, 7};
        int[] b = {11, 3, 7, 1, 7};
        System.out.print(isSubset(a, b));
        
    }
    // a[] = [11, 1, 13, 21, 7, 3, 7], b[] = [11, 3, 7, 1, 7]
    public static boolean isSubset(int a[], int b[]){
        HashMap<Integer, Integer> aMap = new HashMap<>();
        for(int ele : a){
            if(aMap.containsKey(ele)){
                int freq = aMap.get(ele);
                aMap.put(ele,freq+1);
            }
            else aMap.put(ele,1);
        }
        HashMap<Integer, Integer> bMap = new HashMap<>();
        for(int ele : b){
            if(bMap.containsKey(ele)){
            int freq = bMap.get(ele);
            bMap.put(ele, freq+1);
            }
            else bMap.put(ele,1);

        }
        for(int ele : bMap.keySet()){
            if(aMap.containsKey(ele)){
                int Afreq = aMap.get(ele);
                int Bfreq  = bMap.get(ele);
                if(Afreq<Bfreq) return false;
            }
            if(!aMap.containsKey(ele)) return false;
        }
        return true;
    }

}
