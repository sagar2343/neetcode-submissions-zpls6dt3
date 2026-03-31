class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> entry = new HashSet<>();
        for (int n: nums) {
            if (entry.contains(n)) {
                return true;
            }
            entry.add(n);
        }
        return false;
    }
}