class Solution {
    public String largestOddNumber(String num) {
        for(int i=num.length()-1;i>=0;i--){
            if(num.charAt(i)%2!=0){
               return num.substring(0,i+1); // supoose the num is 73142,if i=2,then substring (0,2+1) gives 731 not 7314 because the end index (3) is exclusive. So it includes characters at positions 0, 1, and 2 only.
               

            }
        }
        return "";
    }
}
