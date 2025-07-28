class Solution {
    public int minInsertions(String s) {
        int open=0; //unmatched //counts how many '(' brackets are not yet matched
        int insertions=0;//needed insertions //counts how many insertions we need to make the string valid
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                open++;
            }else{
                 //If it's not '(', then it must be ')'
                if(i+1<s.length() && s.charAt(i+1)==')'){
                    //means we found a pair
                    if(open>0) open--; //(one ( matched)
                    else insertions++; //If there is no open '(', we need to insert one '(' to match with this ))


                    i++; //Skip the next character since we already processed a pair ))

                }else{  //If the current character is ')' but the next one is not another ')'
                 if(open>0){ open--;
                 insertions++;  //If there's an unmatched '(', we match one ) with it, but since we need )) (2 closing), we're missing one more ), so we increment insertions
                }
                 else{
                 insertions+=2; //If there's no open '(', then we are missing both '(' and another ')'. So we add 2 insertions: one '(' and one more ')'
                 }
                
            }
            

        }
    }
      insertions+=2*open; //If any '(' are left unmatched, we need 2 closing ) for each. So add 2 * open insertions
      return insertions;

    }
}
