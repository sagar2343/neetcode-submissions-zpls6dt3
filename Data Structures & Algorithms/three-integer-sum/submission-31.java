class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> unique = new HashSet<>();

        for (int i=0; i<n; i++) {
            int tar = -nums[i];
            Set<Integer> set = new HashSet<>();
            
            for (int j=i+1; j<n; j++) {
                int third = tar - nums[j];
                if (set.contains(third)) {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], third);
                    Collections.sort(triplet);
                    unique.add(triplet);
                } 
                set.add(nums[j]);
            }
        }
        return new ArrayList<>(unique);
    }
}