class Solution {
    public int minBitFlips(int start, int goal) {
        int med = start ^ goal ;
        int count = 0;
        for(int i =0; i<31; i++){
            if((med>>i)%2 !=0) count++;

        }
        return count;
    }
}