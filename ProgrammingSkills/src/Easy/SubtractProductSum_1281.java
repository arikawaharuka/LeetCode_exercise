package Easy;

public class SubtractProductSum_1281 {
    public int subtractProductAndSum(int n) {
        int product=1,sum=0;
        String s=Integer.toString(n);
        for (int i=0;i<s.length();i++){
            product*=(s.charAt(i)-48);
            sum+=(s.charAt(i)-48);
        }
        return product-sum;
    }
}
