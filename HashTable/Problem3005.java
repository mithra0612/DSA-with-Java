class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        int maxFreq = 0;
        for(int frequency:freq.values()){
            maxFreq = Math.max(frequency,maxFreq);
        }
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(freq.get(nums[i])==maxFreq){
                count++;
            }
        }
        return count;
    }
}