class Solution {
    public boolean isCircularSentence(String sentence) {
        boolean isCircular = true;
        String[] words = sentence.split(" ");
        if(sentence.charAt(0) ==sentence.charAt(sentence.length()-1) && words.length==1){
            isCircular = true;
        }
        if(sentence.charAt(0)!=sentence.charAt(sentence.length()-1)){
            isCircular = false;
        }
        for(int i = 0;i<words.length-1;i++){
            if(words[i].charAt(words[i].length()-1)!=words[i+1].charAt(0)){
                isCircular = false;
                break;
            }
        }
        return isCircular;
    }
}