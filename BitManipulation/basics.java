//swap two nos
class Solution {
    static List<Integer> get(int a, int b) {
        // code here
        List<Integer> li= new ArrayList<>();
        
        a=a^b;
        b=a^b; //b=a
        a=a^b;//a=b
        li.add(a);
        li.add(b);
        
        
      return li;  
    }
    
}

//odd and even
class Solution {
    static boolean isEven(int n) {
        // code here
        if((n&1)==1){
            return false;
        }else{
            return true;
        }
        
    }
}


//check kth bit is set or not
class CheckBit {
    static boolean checkKthBit(int n, int k) {
        // code here
        //using left shift operator
        if((n&(1<<k))!=0){
            return true;
        }else{
            return false;
        }
    }
}
