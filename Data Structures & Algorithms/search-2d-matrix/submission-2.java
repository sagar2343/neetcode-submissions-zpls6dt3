class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length; // height
        int n = matrix[0].length; // row

        int start = 0;
        int end = m - 1;

        while (start <= end) {

            int midRow = start + (end - start) / 2;

            if (target >= matrix[midRow][0] && 
                target <= matrix[midRow][n - 1] ) {

                return checkContains(matrix[midRow], target);

            } else if (target < matrix[midRow][0]) {

                end = midRow - 1;
            
            } else {

                start = midRow + 1;
            
            }
        }
        return false;
    }

    public boolean checkContains(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
