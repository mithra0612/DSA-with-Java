class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        HashSet<Integer> candySet = new HashSet<>();
        for(int type:candyType){
            candySet.add(type);
        }  
        return (candySet.size()>=n/2)? n/2:candySet.size(); 
    }
}