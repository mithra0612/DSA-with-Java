class Solution {
    public int[] singleNumber(int[] nums) {
        int[] single = new int[2];
        HashMap<Integer,Integer> countMap = new HashMap<>();
        for(int num:nums){
            countMap.put(num,countMap.getOrDefault(num,0)+1);
        }
        int x = 0;
        for(int num:countMap.keySet()){
            if(countMap.get(num)==1){
                single[x++] = num;
            }
        }
        return single;
    }
}