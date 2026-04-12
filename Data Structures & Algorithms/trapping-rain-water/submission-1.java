class Solution {
    public int trap(int[] height) {
        int result = 0; // 0 - 2

        for (int i=1; i<height.length-1; i++) { // i = 2
            int curr = height[i]; // 2 - 0
            int left = 0; //0 - 2
            int right = 0; // 3 - 3
            int val = 0; // 0 - 2

            for (int j=0; j<=i; j++) {
                left = Math.max(left, height[j]);
            }

            for (int j=i+1; j<=height.length-1; j++) { // j = 3
                right = Math.max(right, height[j]);
            }

            val = Math.min(left, right);
            if (curr < val) {
                result = result + (val - curr);
            }
        }
        return result;
    }
}
