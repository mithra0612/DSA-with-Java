import java.util.HashSet;
import java.util.Iterator;
class Solution {
    public char findTheDifference(String s, String t) {
        HashSet<Character> set = new HashSet<>();
        for(char c:s.toCharArray()){
            if(set.contains(c)){
                set.remove(c);
            }
            else{
                set.add(c);
            }
        }
        for(char c:t.toCharArray()){
            if(set.contains(c)){
                set.remove(c);
            }
            else{
                set.add(c);
            }
        }
        return set.iterator().next();
    }
}