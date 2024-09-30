public class Problem {
    public int getLucky(String s, int k) {
        StringBuilder numStr = new StringBuilder();
        for (char ch : s.toCharArray()) {
            numStr.append(ch - 'a' + 1);
        }
        int sum = 0;
        for (char digit : numStr.toString().toCharArray()) {
            sum += digit - '0';
        }
        
        while (--k > 0) {
            int newSum = 0;
            while (sum > 0) {
                newSum += sum % 10;
                sum /= 10;
            }
            sum = newSum;
        }

        return sum;
    }
}
