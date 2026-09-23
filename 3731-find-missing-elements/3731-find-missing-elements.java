class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int ele : nums) {
            set.add(ele);
            min = Math.min(ele, min);
            max = Math.max(ele, max);}
        for(int i = min+1; i<max; i++){
            if(!set.contains(i)) ans.add(i);
        }
        return ans;
    }
}