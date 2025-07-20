class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result= new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> row= new ArrayList<>();
            row.add(1);
            for(int j=1;j<i;j++){   // Inside the loop, j helps fetch two adjacent numbers from the previous  row:
// result.get(i - 1).get(j - 1) → the left number
// result.get(i - 1).get(j) → the right number

            int sum= result.get(i - 1).get(j - 1) + result.get(i - 1).get(j);             
            
    // result.get(i - 1) → gets the previous row (so Row 2 when i = 3)
    //.get(j - 1) and .get(j) → picks two neighboring numbers from that previous row
    // for j = 1, this will do:
    //result.get(2).get(0) = 1
    //result.get(2).get(1) = 2
   //Adds them: 1 + 2 = 3
   //for j=2;
   // result.get(2).get(1) = 2
  //result.get(2).get(2) = 1
  // Adds them: 2 + 1 = 3

                row.add(sum);
            }
            if(i>0) {
                row.add(1);
                //Final row: [1, 3, 3, 1]
            }
            result.add(row);
        }
        return result;
    }
}
