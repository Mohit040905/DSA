class Solution {
    public int search(int[] nums, int target) {
        int lo=0, hi = nums.length-1;
        while(lo<=hi){
            int mid = lo + (hi- lo)/2;
            if(nums[mid] == target) return mid;
            else if (nums[mid]>= nums[lo]){ // checking if left part is sortred ?
                if(nums[lo]<=target && nums[mid]>=target) hi=mid-1; // does the element exist in the sorted part or not
                else {lo=mid+1;}
            }
            else{ //right part checking sorted or not
                if(nums[mid]<=target && nums[hi]>=target){ // does the element exist in the sorted part or not
                    lo = mid+1;
                }
                else { hi = mid -1;}
            }
        }
        return -1;
    }
}