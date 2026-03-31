class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean isDuplicate = false;
        
        Set<Integer> entry = new HashSet<>();

        for (int i: nums) {
            if (entry.contains(i)) {
                return true;
            }
            entry.add(i);
        }
        return false;
    }
}