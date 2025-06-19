class Solution {
    public int numberOfSubstrings(String s) {
        int count=0;
        int[] freq= new int[3];//to store coubts of a,b and c
        int l=0;
        for(int r=0;r<s.length();r++){
            freq[s.charAt(r)-'a']++;//update freq of that charcater
            while(freq[0]>0&&freq[1]>0&&freq[2]>0){
               // If the window [l..r] is valid, then every substring starting from l to any end index >= r will also be valid.
                count+=s.length()-r;
                freq[s.charAt(l)-'a']--;//shrink the window by moving l to the right hence decreasing the frequency of thr character at l.
                l++;
            }

        }
        return count;
    }
}
