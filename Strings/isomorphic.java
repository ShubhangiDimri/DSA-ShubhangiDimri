class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map1= new HashMap<>();//mapping char from s to t
         //we use two hashmaps to ensure a one to one mapping in both directions
        HashMap<Character, Character> map2= new HashMap<>(); //mapping char from t to s
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char sc=s.charAt(i);
            char tc= t.charAt(i);


          if(map1.containsKey(sc) && map1.get(sc)!=tc) return false;
          map1.put(sc,tc);
          if(map2.containsKey(tc) && map2.get(tc)!=sc) return false;
          map2.put(tc,sc);
        }
        return true;
    }
}
