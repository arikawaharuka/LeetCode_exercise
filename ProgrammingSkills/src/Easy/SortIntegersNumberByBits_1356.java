package Easy;

import java.util.HashMap;
import java.util.Map;

public class SortIntegersNumberByBits_1356 {
    public int[] sortByBits(int[] arr) {
        Map<Integer,Integer> hashMap= new HashMap<>();
        for (int num:arr){
            hashMap.put(num,Integer.bitCount(num));
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (hashMap.get(arr[i])>hashMap.get(arr[j])||((hashMap.get(arr[i])==hashMap.get(arr[j])))&&(arr[i]>arr[j])){
                    arr[i]=arr[i]+arr[j];
                    arr[j]=arr[i]-arr[j];
                    arr[i]=arr[i]-arr[j];
                }
            }
        }
        return arr;
    }
}
