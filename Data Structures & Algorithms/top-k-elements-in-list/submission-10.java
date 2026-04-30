class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length + 1];
        Map<Integer, Integer> entry = new HashMap<>();
        
        

        for (int i=0; i<bucket.length; i++) {
            bucket[i] = new ArrayList<>();
        }
        

        for (int n : nums) {
            entry.put(n, entry.getOrDefault(n, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> en : entry.entrySet()) {
            bucket[en.getValue()].add(en.getKey());
        }

        int[] res = new int[k];
        int indx = 0;
        for (int i = bucket.length - 1; i >= 0 && indx < k; i--) {
            for (int n : bucket[i]) {
                res[indx++] = n;
                if (indx == k) return res;
            }
        }
        return res;
        
    }
}
