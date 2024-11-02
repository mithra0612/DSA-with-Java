class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> countFrequency = new HashMap<>();
        int maxFreq = 0;
        int mostFrequentEven = -1;

        for (int num : nums) {
            if(num%2==0){
               countFrequency.put(num, countFrequency.getOrDefault(num, 0) + 1);

            }
        }
        for (Map.Entry<Integer, Integer> entry : countFrequency.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();
            if (freq > maxFreq || (freq == maxFreq && num < mostFrequentEven)) {
                maxFreq = freq;
                mostFrequentEven = num;
            }
        }

        return mostFrequentEven;

    }
}