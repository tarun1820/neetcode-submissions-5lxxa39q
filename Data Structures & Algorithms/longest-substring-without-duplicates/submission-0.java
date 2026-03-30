class Solution {
    public int lengthOfLongestSubstring(String s) {
        int logestSubStringLength = 0;
        int len = s.length();
        int l=0,r=0;
        HashSet<Character> uniqueSet= new HashSet<Character>();
        while(r<len){
            while(uniqueSet.contains(s.charAt(r))){
                uniqueSet.remove(s.charAt(l));
                l++;
            }
            uniqueSet.add(s.charAt(r));
            logestSubStringLength = Math.max(logestSubStringLength,uniqueSet.size());
            r++;
        }
        return logestSubStringLength;
    }
}
