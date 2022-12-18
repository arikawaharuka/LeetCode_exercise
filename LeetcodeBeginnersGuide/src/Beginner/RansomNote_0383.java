package Beginner;

import java.util.HashMap;
import java.util.Map;

public class RansomNote_0383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length()<ransomNote.length()){
            return false;
        }
        Map<Character,Integer> hashMap=new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            hashMap.put(magazine.charAt(i),hashMap.getOrDefault(magazine.charAt(i),0)+1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (!hashMap.containsKey(ransomNote.charAt(i))){
                return false;
            }
            if (hashMap.get(ransomNote.charAt(i))==0){
                return false;
            }
            hashMap.put(ransomNote.charAt(i),hashMap.getOrDefault(ransomNote.charAt(i),0)-1);
        }
        return true;
    }
}
