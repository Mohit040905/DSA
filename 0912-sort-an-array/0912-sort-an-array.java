class Solution {
    public int[] sortArray(int[] nums) {
        merge(nums, 0 , nums.length-1);
        return nums;
    }
    public void merge(int[] nums, int low, int high){
        if(low>=high) return;
        int m = low+ (high - low)/2;
        merge(nums, low, m);
        merge(nums, m+1, high);
        mergeSort(nums, low, m , high);
    }
    public void mergeSort(int[] nums, int low, int m, int high){
        int[] temp = new int[high - low + 1];
        int i = low, j = m+1, k = 0;
        while(i<=m && j<=high) temp[k++] = nums[i]<=nums[j] ? nums[i++] : nums[j++];
        while(i<=m) temp[k++] = nums [ i++];
        while(j<=high) temp[k++] = nums[j++];
        System.arraycopy(temp, 0, nums, low, temp.length);
    }
}