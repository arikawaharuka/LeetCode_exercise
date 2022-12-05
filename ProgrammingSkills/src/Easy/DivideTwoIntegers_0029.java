package Easy;

public class DivideTwoIntegers_0029 {
    public int divide(int dividend,int divisor){
        if (dividend==Integer.MIN_VALUE){
            if(divisor==-1){
                return Integer.MAX_VALUE;
            }
            if (divisor==1){
                return Integer.MIN_VALUE;
            }
        }
        if (divisor==Integer.MIN_VALUE){
            return dividend==Integer.MIN_VALUE?1:0;
        }
        if (dividend==0){
            return 0;
        }
        if (divisor==1){
            return dividend;
        }
        if (divisor==-1){
            return -dividend;
        }

        boolean flag=false;
        if (dividend>0){
            dividend=-dividend;
            flag=!flag;
        }
        if(divisor>0){
            divisor=-divisor;
            flag=!flag;
        }

        int quotient=0;
        while (dividend<=divisor){
            dividend=dividend-divisor;
            quotient++;
        }
        if(flag){
            quotient=quotient*-1;
        }
        return quotient;
    }

}
