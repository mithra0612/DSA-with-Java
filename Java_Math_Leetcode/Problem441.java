class Solution {
    public int arrangeCoins(int n) {
        int temp = n,k=1;
        for(int i =2;i<n;i++){
            temp-=i;
            if(temp>0){
                k++;
            }
            else break;
        }
        return k;
    }
}