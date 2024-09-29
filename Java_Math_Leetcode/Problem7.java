class Solution {
    public int reverse(int x) {
        long num = x, rem, rev = 0;
        while (num != 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        
       
        if (rev >= Integer.MIN_VALUE && rev <= Integer.MAX_VALUE) {
            return (int) rev; 
        } else {
            return 0;   
        }
    }
}
