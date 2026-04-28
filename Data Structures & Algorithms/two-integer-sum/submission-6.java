class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int con = target - nums[i];
            if (map.containsKey(con)) {
                return new int[] {map.get(con), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}
