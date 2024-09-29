class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int remainder, reverse = 0; 

  while (x > 0) {
    remainder = x % 10;
    reverse = (reverse * 10) + remainder;
    x = x / 10;
  }

  if (temp == reverse) {
    return true;
  } else {
    return false;
  }
}
}