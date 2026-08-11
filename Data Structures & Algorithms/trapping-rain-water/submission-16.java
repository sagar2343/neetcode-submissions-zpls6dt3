class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length-1;
        int leftmax = 0;
        int rightmax = 0;
        int water = 0;

        while (left < right) {
            leftmax = Math.max(leftmax, height[left]);
            rightmax = Math.max(rightmax, height[right]);

            if (leftmax < rightmax) {
                water += leftmax - height[left];
                left++;
            } else {
                water += rightmax - height[right];
                right--;
            }

            // if (height[left]  <= height[right]) {
            //     if (height[left] > leftmax) {
            //         leftmax = height[left];
            //     } else {
            //         water += leftmax - height[left];
            //     }
            //     left++;
            // } else {
            //     if (height[right] > rightmax) {
            //         rightmax = height[right];
            //     } else {
            //         water += rightmax - height[right];
            //     }
            //     right--;
            // }
        }
        return water;
    }
}
