class Solution {
    public int lastStoneWeight(int[] stones) {
        int size = stones.length;
        while (size>1){
            Arrays.sort(stones, 0, size);
            int max = stones[size-1];
            int min = stones[size-2];
            if(max == min) size-=2;
            else{
                stones[size-2] = max - min;
            size-=1;}
        }
        return size==0 ? 0: stones[0];
    }
}