class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        int[] rightSmallest = new int[n];
        int[] leftSmallest = new int[n];

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

        int area = 0;

        for (int i=0; i<n; i++) {
            int h = heights[i];
            int w = rightSmallest[i] - leftSmallest[i] - 1;

            area = Math.max(area, h * w);
        }

        return area;
    }
}
