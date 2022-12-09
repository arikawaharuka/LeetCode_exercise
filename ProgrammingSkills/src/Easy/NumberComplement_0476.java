package Easy;

public class NumberComplement_0476 {
    public int findComplement(int num) {
        long i=1;
        while (true){
            if (num>=i){
                i*=2;
            }else {
                return (int)(i-num-1);
            }
        }
    }
}
