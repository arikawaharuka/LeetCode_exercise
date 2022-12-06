package Easy;

public class MoveZeros_0283 {
    public void moveZeroes(int[] nums) {
        if (nums.length==1){
            return;
        }
        int zeroIndex=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0){
                swapArraysElement(nums,zeroIndex,i);
                zeroIndex++;
            }
        }
    }

    private void swapArraysElement(int[] arrays,int indexLeft,int indexRight){
        int temp=arrays[indexLeft];
        arrays[indexLeft]=arrays[indexRight];
        arrays[indexRight]=temp;
    }
}
