import java.util.*;
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length==1){
            return false;
        }
        HashMap <Integer,Integer> numsIndex = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(numsIndex.containsKey(nums[i])){
                if(Math.abs(i-numsIndex.get(nums[i]))<=k){
                    return true;
                }
            }
            numsIndex.put(nums[i],i);
        }   
        return false;
    }
}