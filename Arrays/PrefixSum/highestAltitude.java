class Solution {
    public int largestAltitude(int[] gain) {
        int maxi=0;//highest altitude
        int sum=0;//current altitude
        for(int i=0;i<gain.length;i++){
            sum+=gain[i];
            if(sum>maxi){
                maxi=sum;
            }

        }
        return maxi;
        
    }
}
