class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum=0; int rsum=0; int maxi=0; int n=cardPoints.length;
        for(int i=0;i<k;i++){
            lsum+=cardPoints[i];
       
        }
             maxi=lsum;
        //now shrinking down the window one by one
        int rindex=n-1;
        for(int i=k-1;i>=0;i--){
            lsum-=cardPoints[i];
            rsum+=cardPoints[rindex];
            rindex--;
            maxi=Math.max(maxi,lsum+rsum);

        }
        return maxi;

    }
}
