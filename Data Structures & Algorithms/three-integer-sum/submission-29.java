class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        int n = nums.length;

        Set<List<Integer>> unique = new HashSet<>();

        for (int i = 0; i < n; i++) {

            int tar = -nums[i];

            Set<Integer> s = new HashSet<>();

            for (int j = i + 1; j < n; j++) {

                int third = tar - nums[j];

                if (s.contains(third)) {

                    List<Integer> trip = Arrays.asList(
                        nums[i],
                        nums[j],
                        third
                    );

                    Collections.sort(trip);

                    unique.add(trip);
                }

                s.add(nums[j]);
            }
        }

        return new ArrayList<>(unique);
    }
}