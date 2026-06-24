class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int i = 0;
        int j = i+1;
        while(i<nums.length&&j<nums.length){
            if(nums[i]==nums[j]) j++;
            else{
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
                count++;
            }
        }
        
        return count;
    }
}