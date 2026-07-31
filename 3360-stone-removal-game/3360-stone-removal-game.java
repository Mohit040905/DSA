class Solution {
    public boolean canAliceWin(int n) {
        for(int i = 10; i>=0; i=i-2 ){
            if(n<i) return false;
            n=n-i;
            if(n<i-1) return true;
            n=n-(i-1);
        }
        return true;
    }
}