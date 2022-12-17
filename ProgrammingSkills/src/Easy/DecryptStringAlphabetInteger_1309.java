package Easy;

public class DecryptStringAlphabetInteger_1309 {
    public String freqAlphabets(String s) {
        StringBuilder builder=new StringBuilder();
        int i=0;
        while (i<s.length()){
            if (s.charAt(i)=='1'||s.charAt(i)=='2'){
                if (i+2>=s.length()){
                    builder.append((char)(s.charAt(i)+48));
                    i++;
                }else {
                    if (s.charAt(i+2)=='#'){
                        builder.append((char) (s.charAt(i)+s.charAt(i+1)+9*(s.charAt(i)-48)));
                        i+=3;
                    }else if(s.charAt(i+2)!='#'){
                        builder.append((char)(s.charAt(i)+48));
                        i++;
                    }
                }
            } else {
                builder.append((char) (s.charAt(i)+48));
                i++;
            }
        }
        return builder.toString();
    }
}
