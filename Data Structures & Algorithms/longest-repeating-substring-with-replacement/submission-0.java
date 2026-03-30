class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> count = new HashMap<>();
        int l=0,r=0;
        int res =0;
        int maxFrequecyInCurrentWindow = 0;
        int len = s.length();
        while(r<len){
            count.put(s.charAt(r),count.getOrDefault(s.charAt(r),0)+1);
            maxFrequecyInCurrentWindow = Math.max(maxFrequecyInCurrentWindow,count.get(s.charAt(r)));
            int currentWindowLength = r-l+1;
            if(currentWindowLength - maxFrequecyInCurrentWindow>k){
                count.put(s.charAt(l),count.get(s.charAt(l))-1);
                l++;
            }
            res = Math.max(res,r-l+1);
            r++;
        }
        return res;
    }
}
