class Solution {
    public boolean halvesAreAlike(String s) {
        //frist we are splitting the string into two parts
        String a=s.substring(0,s.length()/2);
        String b= s.substring(s.length()/2); //s.substring(s.length()/2) and s.substring(s.length()/2, s.length()) both work the same way
        //count vowels in both halves
        int countA=0, countB=0;
        for(char c: a.toCharArray()){
            if("aeiouAEIOU".indexOf(c)!=-1) countA++;

        }
        for(char c:b.toCharArray()){
            if("aeiouAEIOU".indexOf(c)!=-1) countB++;
        }
        if(countA==countB) return true;
        else return false;
    }
}
