class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        HashSet<Integer> numbers = new HashSet<>();
        for(int i = 0;i<n;i++){
            numbers.add(nums[i]);
        }
        int max = Integer.MIN_VALUE;
        for(int num:nums){
            if(num>max){
                max = num;
            }
        }
        int small = n;
        for(int i = 1;i<=n;i++){
            if(!numbers.contains(i)){
                return i;
            }
        }
        return n+1;
    }
}