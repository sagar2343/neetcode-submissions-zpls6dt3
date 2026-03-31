class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length + 1];
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int n: nums) {
            frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
        } 

        for (int key: frequencyMap.keySet()) {
            int freq = frequencyMap.get(key);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        int[] res = new int[k];
        int counter = 0;
        for (int i = bucket.length-1; i >= 0 && counter < k; i--) {
            if (bucket[i] != null) {
                for (Integer n: bucket[i]) {
                    res[counter++] = n;
                }
            }
        }
        return res;
    }
}
