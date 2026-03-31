class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length + 1];
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int i=0; i <= nums.length; i++) {
            bucket[i] = new ArrayList<Integer>();
        }

        for (Integer n: nums) {
            freqMap.put(n, freqMap.getOrDefault(n, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry: freqMap.entrySet()) {
            bucket[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int resIndx = 0;
        for (int i = bucket.length - 1; i >= 0 && resIndx < k; i--) {
            for (int val: bucket[i]) {
                res[resIndx++] = val;
                if (resIndx == k) return res;
            }
        }
        return res;
    }
}
