class Solution {
    public void moveZeroes(int[] nums) {
    int j=0;
    int temp;
    for(int i=0;i<nums.length;i++){
        if(nums[i]!=0){
        if(i!=j){
            temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            }
            j++;
        }
    }
    }
}
