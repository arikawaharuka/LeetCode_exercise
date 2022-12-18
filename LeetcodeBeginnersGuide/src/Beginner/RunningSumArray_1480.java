package Beginner;

public class RunningSumArray_1480 {
    public int[] runningSum(int[] nums) {
        int[] prefix=new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=nums[i]+prefix[i-1];
        }
        return prefix;
    }
}
