package Easy;

public class SumOddLengthSubArrays_1588 {
    public int sumOddLengthSubArrays(int[] arr) {
       int[] prefixSum=new int[arr.length+1];
       prefixSum[0]=0;
       for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i]=prefixSum[i-1]+arr[i-1];
       }
       int sum=0;
       for (int start=1;start<prefixSum.length;start++){
           for (int length = 1;start+length <= prefixSum.length; length+=2) {
               int end=start+length-1;
               sum+=prefixSum[end]-prefixSum[start-1];
           }
       }
       return sum;
    }
}
