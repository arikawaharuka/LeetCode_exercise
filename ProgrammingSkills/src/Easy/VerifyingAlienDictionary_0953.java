package Easy;

import java.util.HashMap;
import java.util.Map;

public class VerifyingAlienDictionary_0953 {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character,Integer> hashMap=new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            hashMap.put(order.charAt(i),i);
        }
        String[] decrypt=new String[words.length];
        for (int i = 0; i < words.length; i++) {
            StringBuilder decryptWord= new StringBuilder();
            for (int j = 0; j < words[i].length(); j++) {
                decryptWord.append((char) ('a' + hashMap.get(words[i].charAt(j))));
            }
            decrypt[i]= decryptWord.toString();
        }
        for (int i = 0; i < decrypt.length-1; i++) {
            if (decrypt[i].compareTo(decrypt[i+1])>0){
                return false;
            }
        }
        return true;
    }
}
