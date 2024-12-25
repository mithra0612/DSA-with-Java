class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int n = nums.length;
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> freqMap.get(a) == freqMap.get(b) ? b - a:
        freqMap.get(a) - freqMap.get(b));

        pq.addAll(freqMap.keySet());

        int[] result = new int[n];
        int index = 0;
        while (!pq.isEmpty()) {
            int num = pq.poll();
            int freq = freqMap.get(num);
            for (int i = 0; i < freq; i++) {
                result[index++] = num;
            }
        }
        return result;
    }
}