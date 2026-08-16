class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Set<Integer> set = new HashSet<>();

        for (int n : nums) {
            set.add(n);
        }

        int result = 0;
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int count = 1;
                int current = num;
                
                while (set.contains(current+1)) {
                    count++;
                    current++;
                }
                result = Math.max(result, count);
            }
        }
        return result;
        
    }
}
