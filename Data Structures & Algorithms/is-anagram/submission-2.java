class Solution {
    public boolean isAnagram(String s, String t) {
      int sLen = s.length(); int tLen = t.length();
      if(sLen!=tLen) return false;
      HashMap<Character,Integer> h = new HashMap<Character,Integer>();
      for(char i:s.toCharArray()){
         int defOrValue = h.getOrDefault(i,0);
         h.put(i,defOrValue+1);
      }
      System.out.println(h);
      for(char i:t.toCharArray()){
         int defOrValue = h.getOrDefault(i,0);
         if(defOrValue==0){
            return false;
         }else{
            h.put(i,defOrValue-1);
         }
      }
      return true;
    }
}
