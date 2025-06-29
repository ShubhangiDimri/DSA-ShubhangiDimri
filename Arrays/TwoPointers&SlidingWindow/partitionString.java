class Solution {
    public List<String> partitionString(String s) {
      Set<String> seen= new HashSet<>();
        List<String> v= new ArrayList<>();
        int st=0;
        for(int e=0;e<s.length();e++){
            String curr=s.substring(st,e+1);//creating a current segment because we need to compare a segement if it is previously seen or not
            if(!seen.contains(curr)){
                v.add(curr);
                seen.add(curr);
                st=e+1;
            }
            
        }
        return v;
        
    }
}
