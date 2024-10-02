class Solution {
    public int[] arrayRankTransform(int[] arr) {
    int[] sortedArr = new int[arr.length];
    int[] result = new int[arr.length];
    System.arraycopy(arr,0,sortedArr,0,arr.length);
      HashMap<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        Arrays.sort(sortedArr);
        for (int num : sortedArr) {
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank);
                rank++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            result[i] = rankMap.get(arr[i]);
        }
        return result;
    }
}