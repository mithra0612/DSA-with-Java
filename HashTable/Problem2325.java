class Solution {
    public String decodeMessage(String key, String message) {
        String decodedMessage = "";
        HashMap <Character,Character> decoder = new HashMap<>();
        char letter = 'a';
        for(char ch:key.toCharArray()){
            if (ch != ' ' && !decoder.containsKey(ch)){
                decoder.put(ch, letter++);
            }
        }
        for(char ch:message.toCharArray()){
            if(ch==' '){
                decodedMessage = decodedMessage+' ';
            }
            else{
                decodedMessage = decodedMessage + decoder.get(ch);
            }
        }
        return decodedMessage;
    }
}