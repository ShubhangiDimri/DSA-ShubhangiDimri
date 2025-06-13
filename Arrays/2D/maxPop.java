class Solution {
    public int maximumPopulation(int[][] logs) {
        int [] population= new int [2051];
        for(int[] log: logs){
            population[log[0]]+=1;//person born
            population[log[1]]-=1;//person died
        }
        int maxi=0;
        int currPop=0;
        int year=1950;//to store the value of the earlist year with max pop.
        for(int i=1950;i<2050;i++){
            currPop+=population[i];
            if(currPop>maxi){
                maxi=currPop;
                year=i;
            }
        }
        return year;
    }
}
