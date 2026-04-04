class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length + 1];
        Map<Integer, Integer> entryMap = new HashMap<>();

        for (int i=0; i<bucket.length; i++) {
            bucket[i] = new ArrayList<>();
        }

        for (Integer n: nums) {
            entryMap.put(n, entryMap.getOrDefault(n, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry: entryMap.entrySet()) {
            bucket[entry.getValue()].add(entry.getKey());
        }
        
        int[] res = new int[k];
        int resInd = 0;
        for (int i=bucket.length-1; i>=0 && resInd<k; i--) {
            for (int n: bucket[i]) {
                res[resInd++] = n;
                if (resInd == k) return res;
            }
        }
        return res;
    }
}
