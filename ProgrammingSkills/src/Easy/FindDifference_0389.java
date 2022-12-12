package Easy;

public class FindDifference_0389 {
    public char findTheDifference(String s, String t) {
        int i=0,j=0;
        int sums=0,sumt=0;
        while (i<s.length()){
            sums+=s.charAt(i);
            i++;
            sumt+=t.charAt(j);
            j++;
        }
        sumt+=t.charAt(j);
        return (char) (sumt-sums);
    }
}
