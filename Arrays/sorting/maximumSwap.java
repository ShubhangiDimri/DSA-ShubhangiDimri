class Solution {
    public int maximumSwap(int num) {
        char[] digits= Integer.toString(num).toCharArray();//2736 → ['2','7','3','6']

       int [] lastOccurence= new int [10]; //to store the last index where each digit (0–9) appears
       for(int i=0;i<digits.length;i++){
        //to store the index of digit
        lastOccurence[digits[i]-'0']=i;
       }
        for(int i=0;i<digits.length;i++){
       int curr= digits[i]-'0'; //converting char to int
       for(int j=9;j>curr;j--){
        if(lastOccurence[j]>i){
            //swap
            char temp= digits[i];
            digits[i]= digits[lastOccurence[j]];
            digits[lastOccurence[j]]= temp;
            return Integer.parseInt(new String(digits));
        }

       }

        }
        //no swap
        return num;
    }
}
