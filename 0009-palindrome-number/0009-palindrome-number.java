class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int a = x;
        int b = 0;
        int sum = 0;
        while(a!=0){
            b = a%10;
            a= a/10;
            sum = (sum*10) + b;
        }
        if(sum==x) return true;
        else return false;
    }
}