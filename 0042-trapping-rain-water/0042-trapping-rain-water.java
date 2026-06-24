class Solution {
    public int trap(int[] height) {
        int answer = 0 ;
        int n = height.length;
        int[] leftmax = new int[n];
        int[] rightmax = new int[n];
        for(int i = 0; i<height.length; i++){
            if(i==0) leftmax[0] = height[0];
            else leftmax[i] = Math.max(height[i], leftmax[i-1]) ;
        }
        for(int i = height.length - 1; i>=0; i--){
            if(i == height.length - 1) rightmax[i] = height[height.length - 1];
            else rightmax[i] = Math.max(rightmax[i+1], height[i]);
        }
        for(int i = 0; i<height.length; i++){
            answer = answer + (Math.min(rightmax[i], leftmax[i])-height[i]);
        }
        return answer;
    }
}