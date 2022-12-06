package Easy;

public class RichestCustomerWealth_1672 {
    public int maximumWealth(int[][] accounts) {
        int maxWealth=Integer.MIN_VALUE;
        int[] account=new int[accounts.length];
        for (int i=0;i<accounts.length;i++){
            for (int j = 0; j < accounts[i].length; j++) {
                account[i]+=accounts[i][j];
                if (i==0){
                    maxWealth=account[i];
                }else {
                    if (account[i]>maxWealth){
                        maxWealth=account[i];
                    }
                }
            }
        }
        return maxWealth;
    }
}
