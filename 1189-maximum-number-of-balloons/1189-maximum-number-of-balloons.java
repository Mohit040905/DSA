class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq = new int[26];
        for(int i = 0; i<text.length(); i++){
            char ch = text.charAt(i);
            freq[ch - 'a']++;
        }
        int a = freq['a' - 'a'];
        int b = freq['b'-'a'];
        int l = freq['l'-'a']/2;
        int o = freq['o'-'a']/2;
        int n = freq['n'-'a'];
        
        return Math.min(Math.min(Math.min(Math.min(l,o), n),b),a);
    }
}