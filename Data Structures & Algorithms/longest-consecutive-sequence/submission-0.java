class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);
        int n = nums.length;
        int count = 0;
        int lastSmallest = Integer.MIN_VALUE;
        int longest = 1;
        for (int i=0; i<n; i++) {
            if (nums[i] -1 == lastSmallest) {
                count ++;
                lastSmallest = nums[i];
            } else if (lastSmallest != nums[i]) {
                count = 1;
                lastSmallest = nums[i];
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
}
