import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String s) {
      HashMap<Character,String> patternMap = new HashMap<>();
      String[] str = s.split(" ");
      if(pattern.length()!=str.length) return false;
      for(int i = 0;i<pattern.length();i++){
        if(!patternMap.containsKey(pattern.charAt(i))){
            if(!(patternMap.containsValue(str[i]))){
                patternMap.put(pattern.charAt(i),str[i]);

            }
            else{
                return false;
            }
        }
        else{
            if(!patternMap.get(pattern.charAt(i)).equals(str[i])){
                return false;
            }
        }
      }
      return true;
    }
}