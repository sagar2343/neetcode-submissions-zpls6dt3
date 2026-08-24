class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int water = 0;
        int left = 0;
        int right = n-1;

        while (left < right) {
            int h = Math.min(heights[left], heights[right]);
            int w = right - left;
            water = Math.max(water, h * w);
            if (heights[left] < heights[right]) left++;
            else right--;
        }
        return water;
    }
}
