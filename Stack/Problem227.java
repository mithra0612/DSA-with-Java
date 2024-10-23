class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int currentNum = 0;
        char operation = '+';
        s = s.replaceAll("\\s", ""); 
        for(int i=0;i<s.length();i++){
            char currentChar = s.charAt(i);
            if(Character.isDigit(currentChar)){
                currentNum = currentNum*10 + currentChar - '0';
            }
            if(!Character.isDigit(currentChar) || (i==s.length()-1)){
                switch(operation){
                    case '+':
                    stack.push(currentNum);
                    break;
                    case '-':
                    stack.push(-currentNum);
                    break;
                    case '*':
                    stack.push(stack.pop()*currentNum);
                    break;
                    case '/':
                    stack.push(stack.pop()/currentNum);
                    break;
                }
                operation = currentChar;
                currentNum = 0;
            }
        }
        int result = 0;
        for(int num:stack){
            result+=num;
        }
        return result;
    }
}