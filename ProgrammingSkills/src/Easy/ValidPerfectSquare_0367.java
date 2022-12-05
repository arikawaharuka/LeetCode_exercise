package Easy;

public class ValidPerfectSquare_0367 {
    public boolean IsPerfectSquare_1(int num) {
        int rootNum =(int)Math.sqrt(num);
        return rootNum * rootNum == num;
    }

    public boolean IsPerfectSquare_2(int num){
        int low=1,high=num;
        while (low<=high){
            int mid =(low+high)/2;
            long square=(long) mid*mid;
            if (num>square){
                low=mid+1;
            } else if (num<square) {
                high=mid-1;
            } else{
                return true;
            }
        }
        return false;
    }

}
