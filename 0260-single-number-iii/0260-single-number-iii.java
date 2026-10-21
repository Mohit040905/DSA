class Solution {
    public int[] singleNumber(int[] nums) {
        int xor  = 0;
        for(int ele : nums){
         xor ^= ele;
        }
        int b1 = 0 ; int b2 = 0;
        int setbit = (xor&(xor-1))^xor;
        for(int ele : nums ){
            if((ele&setbit)!=0) b1 ^= ele;
            else b2 ^=ele;
        }
        int[] arr = {b1, b2};
        Arrays.sort(arr);
        return arr;

    }
}