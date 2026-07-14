class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length + 1];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<bucket.length; i++) {
            bucket[i] = new ArrayList();
        }

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            bucket[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int resIndx = 0;
        for (int i = bucket.length - 1; i>=0 && resIndx < k; i--) {
            for (int n : bucket[i]) {
                res[resIndx++] = n;
                if (resIndx == k) return res;
            }
        }
        return res;
    }
}
