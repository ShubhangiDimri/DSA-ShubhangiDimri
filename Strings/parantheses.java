class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result= new StringBuilder();
        int counter=0 ;
        for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='('){
            if(counter>0){
                result.append('(');
                
            }
            counter++;
           }
           else{
            counter--;
           if(counter>0){
            result.append(')');
           }
           }
        }
        return result.toString();//java will call its toString() method automatically
                     //for clarity, we can use return result.toString();.
    }
}
