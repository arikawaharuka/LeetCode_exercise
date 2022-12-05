package Easy;

public class CountOddInRange_1523 {

    public int countOdds(int low, int high) {
        if ((low%2==0&&high%2==1)||low%2==1){
            return (high-low)/2+1;
        }else {
            return (high-low)/2;
        }
    }
}
