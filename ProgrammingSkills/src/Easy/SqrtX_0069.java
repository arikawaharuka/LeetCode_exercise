package Easy;

public class SqrtX_0069 {
    public int mySqrt(int x) {
        int low=0,high=x,mid;
        int result=-1;
        while (low<=high){
            mid=(low+high)/2;
            if ((long)mid*mid<=x){
                result=mid;
                low=mid+1;
            }else {
                high=mid-1;
            }
        }
        return result;
    }
}
