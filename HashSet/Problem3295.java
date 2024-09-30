import java.util.HashSet;

class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        HashSet<String> bannedHash = new HashSet<>();
        for(String word:bannedWords){
            bannedHash.add(word);
        }
        int count = 0;
        for(String word:message){
            if(bannedHash.contains(word)){
                count++;
            }
            if(count>=2){
                return true;
            }
        }
        return false;           
    }
}
