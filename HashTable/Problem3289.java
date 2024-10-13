class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> countFrequency = new HashMap<>();
        for(int num:nums){
            countFrequency.put(num,countFrequency.getOrDefault(num,0)+1);
        }
        int[] sneakyNumbers = new int[2];
        int x = 0;
        HashSet<Integer> num = new HashSet<>();
        for (int n : nums) {
            num.add(n);
            }
        for(Integer element:num){
            if(countFrequency.get(element)>1){
                sneakyNumbers[x++]=element;
            }
        }
        return sneakyNumbers;
    }
}