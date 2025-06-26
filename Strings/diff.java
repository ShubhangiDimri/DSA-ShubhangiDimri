class Solution {
    public char findTheDifference(String s, String t) {
     int count=0;
     int count1=0;
     for(int i=0;i<s.length();i++){
        count+=s.charAt(i);
     }   
     for(int j=0;j<t.length();j++){
        count1+=t.charAt(j);
     } 
    int diff=count1-count;
     return (char) diff;
     
    }
}
