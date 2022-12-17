package Easy;

public class ToLowerCase_0709 {
    public String toLowerCase(String s) {
        StringBuilder builder=new StringBuilder();
        int i=0;
        while (i<s.length()){
            if (s.charAt(i)>=65&&s.charAt(i)<=90){
                builder.append((char) (s.charAt(i)+32));
            }else {
                builder.append(s.charAt(i));
            }
            i++;
        }
        return builder.toString();
    }

    public String toLowerCase_2(String s){
        return s.toLowerCase();
    }
}
