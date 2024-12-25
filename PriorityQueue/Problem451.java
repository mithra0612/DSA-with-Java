class Solution {
    public String frequencySort(String s) {
        HashMap <Character,Integer> map = new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a,b) -> map.get(b)-map.get(a));
        maxHeap.addAll(map.keySet());
        while(!maxHeap.isEmpty()){
            char ch = maxHeap.poll();
            int freq = map.get(ch);
            for(int i = 0;i<freq;i++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}