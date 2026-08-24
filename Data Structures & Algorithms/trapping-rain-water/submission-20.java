class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n-1;
        int maxl = 0;
        int maxr = 0;
        int water = 0;

        while (l < r) {
            maxl = Math.max(maxl, height[l]);
            maxr = Math.max(maxr, height[r]);

            if (maxl < maxr) {
                water += maxl - height[l];
                l++;
            } else {
                water += maxr - height[r];
                r--;
            }
        }
        return water;
    }
}
