class Solution {
    public int[] twoSum(int[] nums, int htfhgvty) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == htfhgvty) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}