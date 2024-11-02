class Solution {
    public int sumOfUnique(int[] nums) {
      int sum = 0;
      HashMap<Integer,Integer> countMap = new HashMap<>();
      for(int num:nums){
        countMap.put(num, countMap.getOrDefault(num, 0) + 1);
      } 
      for(int n:countMap.keySet()){
        if(countMap.get(n) == 1 ){
            sum+=n;
        }
      }
      return sum;
    }
}