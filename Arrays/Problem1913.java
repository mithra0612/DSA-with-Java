class Solution {
    public int maxProductDifference(int[] nums) {
        int[] a = getMinMAx(nums);
        int[] b = getMinMAx(nums);
        return (a[0]*b[0]) - (a[1]*b[1]);
        
    }
    public int[] getMinMAx(int[] nums){
    	int[] ret = new int[2];
    	int min = Integer.MAX_VALUE;
    	int max = Integer.MIN_VALUE;
    	int minIndex = 0;
    	int maxIndex = 0;
    	for(int i=0;i<nums.length;i++){
    		if(nums[i] != -1){
    		if(nums[i] < min){
    			min = nums[i];
    			minIndex = i;
    		}
    		if(nums[i] > max){
    			max = nums[i];
    			maxIndex = i;
    		}
    		}
    	}
    	nums[minIndex] = -1;
    	nums[maxIndex] = -1;
    	ret[0] = max;
    	ret[1] = min;
    	return ret;
    }
}