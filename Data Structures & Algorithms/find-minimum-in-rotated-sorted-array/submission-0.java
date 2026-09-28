class Solution {
    public int findMin(int[] nums) {
        int mini = nums[0];

        for (int n : nums) {
            mini = Math.min(mini, n);
        }

        return mini;
    }
}
