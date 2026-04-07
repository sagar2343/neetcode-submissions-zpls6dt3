class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);
        int smallest = Integer.MIN_VALUE;
        int longest = 1;
        int count = 0;

        for (int i=0; i < nums.length; i++) {
            if (nums[i] - 1 == smallest) {
                count ++;
            } else if (nums[i] != smallest) {
                count = 1;
            }
            smallest = nums[i];
            longest = Math.max(longest, count);
        }
        return longest;
    }
}
