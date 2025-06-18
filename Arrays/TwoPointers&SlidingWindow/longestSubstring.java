class Solution {
    public int lengthOfLongestSubstring(String s) {
        int [] freq= new int[256];//ASCII character frequency array
        int lp=0;
        int rp=0;
        int n=s.length();
        int maxi=0;
        while(rp<n){
            char ch= s.charAt(rp);
            freq[ch]++;//wehave to do this then the while condition below will be true.
            // If current char appears more than once, shrink window from left
            while(freq[ch]>1){
                freq[s.charAt(lp)]--; //remove freq of character at left.
                lp++;
            }
           int len=rp-lp+1;
            maxi=Math.max(maxi,len);
            rp++;
        }
        return maxi;
    }
}
