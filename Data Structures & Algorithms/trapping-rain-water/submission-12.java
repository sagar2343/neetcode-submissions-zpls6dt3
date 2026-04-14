class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int lmax = 0;
        int rmax = 0;
        int result = 0;
        int l = 0;
        int r = n - 1;

        while (l < r) {
            lmax = Math.max(lmax, height[l]);
            rmax = Math.max(rmax, height[r]);

            if (lmax < rmax) {
                result += lmax - height[l];
                l++;
            } else {
                result += rmax - height[r];
                r--;
            }
        }
        return result;
    }
}
