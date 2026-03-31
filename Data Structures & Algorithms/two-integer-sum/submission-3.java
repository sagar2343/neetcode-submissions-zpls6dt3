class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> entry = new HashMap<>();

        for (int i=0; i<nums.length; i++) {
            int comp = target - nums[i];
            if (entry.containsKey(comp)) {
                return new int[] { entry.get(comp), i};
            }
            entry.put(nums[i], i);
        }

        return new int[] {};
    }
}
