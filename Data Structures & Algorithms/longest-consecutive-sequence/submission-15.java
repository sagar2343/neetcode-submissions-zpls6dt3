class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        int res = 0;
        
        for (int n : nums) set.add(n);

        for (int n : nums) {
            if (set.contains(n-1)) continue;
            
            int current = n;
            int count = 1;
            while (set.contains(current+1)) {
                current++;
                count++;
            }
            res = Math.max(res, count);
        }
        return res;
    }
}
