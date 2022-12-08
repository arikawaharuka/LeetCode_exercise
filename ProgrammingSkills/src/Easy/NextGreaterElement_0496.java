package Easy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class NextGreaterElement_0496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Deque<Integer> stack=new ArrayDeque<>();
        Map<Integer,Integer> map=new HashMap<>();
        for (int num : nums2) {
            while (!stack.isEmpty() && num > stack.peek()) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }

        int[] ans=new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i]=map.getOrDefault(nums1[i],-1);
        }
        return ans;
    }

    public int[] nextGreaterElement_2(int[] nums1, int[] nums2){
        int[] ans=new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int j=0;
            while (nums2[j]!=nums1[i]&&j< nums2.length){
                j++;
            }
            int k=j+1;
            while (k< nums2.length&&nums2[k]<nums2[j]){
                k++;
            }
            ans[i]=k< nums2.length?nums2[k]:-1;
        }
        return ans;
    }
}
