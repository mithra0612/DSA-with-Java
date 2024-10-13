class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> countFrequency = new HashMap<>();
        for(int num:nums){
            countFrequency.put(num,countFrequency.getOrDefault(num,0)+1);
        }
        int freq = nums.length/3;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            if(countFrequency.get(nums[i])>freq ){
                set.add(nums[i]);
            }
        }
        List<Integer> majorityElements = new ArrayList<>(set);
        return majorityElements;
    }
}