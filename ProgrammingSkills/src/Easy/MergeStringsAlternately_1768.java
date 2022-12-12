package Easy;

public class MergeStringsAlternately_1768 {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder builder=new StringBuilder();
        int length1=word1.length();
        int length2=word2.length();
        int i=0,j=0;
        while (i<length1||j<length2){
            if (i<length1){
                builder.append(word1.charAt(i));
                i++;
            }
            if (j<length2){
                builder.append(word2.charAt(j));
                j++;
            }
        }
        return builder.toString();
    }
}
