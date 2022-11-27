package Easy;

import java.util.Arrays;

public class CanMakeArithmeticProgression_1502 {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int commonDifference=arr[1]-arr[0];
        for (int i=2;i<arr.length;i++){
            if (commonDifference!=(arr[i]-arr[i-1])){
                return false;
            }
        }
        return true;
    }
}
