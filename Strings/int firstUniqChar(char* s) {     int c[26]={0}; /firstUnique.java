class Solution {
    public int firstUniqChar(String s) {
        int[] ct= new int[26];
        for(int i=0;i<s.length();i++){
            //to store the occurence
            ct[s.charAt(i)-'a']++;
        }
        for(int j=0;j<s.length();j++){
        if(ct[s.charAt(j)-'a']==1){
        return j;        
    }
        }    
        return -1;
    }
}
