package Easy;

import java.util.Arrays;

public class ValidAnagram_0242 {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()){
            return false;
        }
            char[] char1=s.toCharArray();
            char[] char2=t.toCharArray();
            Arrays.sort(char1);
            Arrays.sort(char2);
            return Arrays.equals(char1,char2);
    }
}
