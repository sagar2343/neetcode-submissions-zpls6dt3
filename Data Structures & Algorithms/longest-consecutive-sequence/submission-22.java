class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int res = 0;

        for (int n : nums) {
            set.add(n);
        }

        for (int n : set) {
            if (set.contains(n - 1)) continue;

            int curr = n;
            int count = 1;
            while (set.contains(curr + 1)) {
                curr++;
                count++;
            }

            res = Math.max(res, count);
        }

        return res;
    }
}