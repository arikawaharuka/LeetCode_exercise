package Easy;

public class CheckStringSwapEqual_1790 {
    public boolean areAlmostEqual(String s1, String s2) {
        int count=0;
        int[] differPos={-1,-1,-1};
        for (int i=0;i<s1.length();i++){
            if (s1.charAt(i)!=s2.charAt(i)){
                if (count>2){
                    return false;
                }
                differPos[count]=i;
                count++;
            }
        }
        if (count==0){
            return true;
        } else if (count==1||count>2) {
            return false;
        }else {
            return s1.charAt(differPos[0]) == s2.charAt(differPos[1]) && s1.charAt(differPos[1]) == s2.charAt(differPos[0]);
        }
    }
}
