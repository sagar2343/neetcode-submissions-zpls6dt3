class Solution {
    public int maxArea(int[] heights) {
        int result = 0;
        int l = 0;
        int r = heights.length-1;

        while (l < r) {
            int w = r - l;
            int h = Math.min(heights[l], heights[r]);

            int area = h * w;
            result = Math.max(result, area);

            if (heights[l] < heights[r]) {
                l ++;
            } else {
                r--;
            }
        }
        return result;
    }
}
