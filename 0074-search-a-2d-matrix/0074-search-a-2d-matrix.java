class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length, cols = matrix[0].length;
        int lo = 0, hi = rows * cols - 1;
        while (lo<=hi){
            int mid = lo + (hi-lo)/2;
            int midr = mid/cols, midc = mid%cols; /* Very imp cond to get mid in the sorted matrix */
            if (matrix[midr][midc]==target) return true;
            else if(matrix[midr][midc]>target) hi=mid -1;
            else lo=mid+1;

        }
        return false;
    }
}