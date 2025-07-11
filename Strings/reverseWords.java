class Solution {
    public String reverseWords(String s) {
        //Splitting helps us reverse by words, not letters
        String[] words=s.trim().split("\\s+");//trim() removes extra spaces at the start/end.
        //"\s+" part which ensures splitting by one or more spaces. Without it, only exact spaces are considered so multiple spaces won't work as expected
    StringBuilder result= new StringBuilder();
    for(int i=words.length-1;i>=0;i--){
        result.append(words[i]);
        if(i!=0){
            result.append(" ");
        }

    }

return result.toString();
    }
}
