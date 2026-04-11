class Solution {
    public int maxArea(int[] heights) {
        int result = 0;

        int left = 0;
        int right = heights.length - 1;

        while (left < right) {
            int width = right - left;
            int height = Math.min(heights[left], heights[right]);

            int area = height * width;
            result = Math.max(result, area);
            
            if (heights[right] > heights[left]) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }
}
