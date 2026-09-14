class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] leftSmallest = new int[n];
        int[] rightSmallest = new int[n];
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        for (int i=n-1; i>=0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            rightSmallest[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        stack.clear();

        for (int i=0; i<n; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            leftSmallest[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        for (int i=0; i<n; i++) {
            int w = rightSmallest[i] - leftSmallest[i] - 1;
            int h = heights[i];
            maxArea = Math.max(maxArea, h * w);
        }

        return maxArea;
    }
}
