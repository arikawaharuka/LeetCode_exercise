package Easy;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber_0202 {
    public boolean isHappy(int n) {
        Set<Integer> hashMap=new HashSet<>();
        while (n!=1&& !hashMap.contains(n)){
            hashMap.add(n);
            n=getNextNumber(n);
        }
        return n==1;
    }

    public int getNextNumber(int n){
        int sumSquareNumber=0;
        String num=Integer.toString(n);
        for (int i=0;i<num.length();i++){
            sumSquareNumber+=(num.charAt(i)-48)*(num.charAt(i)-48);
        }
        return sumSquareNumber;
    }
}
