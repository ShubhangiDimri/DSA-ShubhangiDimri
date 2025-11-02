class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        int[] arr= new int[102];
        for(List<Integer> num:nums){
            int s= num.get(0);
            int e= num.get(1);
            arr[s]++;
            arr[e+1]--;
        }
        int sum=0;
        int[] prefix= new int[102];
        for(int i=0;i<102;i++){
         sum+=arr[i];
         prefix[i]=sum;
        }
        int count=0;
        for(int i=0;i<102;i++){
            if(prefix[i]>0){
                count++;
            }
        }
        return count;



    }
}
