class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<int[]> q= new LinkedList<>();
        for(int i=0;i<tickets.length;i++){
            q.add(new int[]{i,tickets[i]});// here we are storing {index,no of tickets}
        }
        int time=0;
        while(!q.isEmpty()){
        //take the front person
        int[] curr= q.poll();//curr is an array [index,ticketsLeft]
        //curr[0] for the perons index and curr[1] for the remaining tickets since curr is an array[index,tickets]i.e. wirth indexes[0,1]
        curr[1]--;
        time++;
        if(curr[1]==0){
            if(curr[0]==k) return time;
        }else{
            q.add(curr);
        }
        } 
        return time;
    }
}
