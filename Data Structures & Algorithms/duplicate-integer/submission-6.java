class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> entry = new HashSet<>();

        for (int num : nums) {
            if (entry.contains(num)) {
                return true;
            }
            entry.add(num);
        }
        return false;
    }
}