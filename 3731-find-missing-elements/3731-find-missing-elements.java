class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int low = nums[0];
        int n = nums.length;
        int high = nums[n-1];
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int ele : nums) set.add(ele);
        for(int i = low; i<high; i++){
            if(!set.contains(i)) ans.add(i);
        }
        return ans;
    }
}