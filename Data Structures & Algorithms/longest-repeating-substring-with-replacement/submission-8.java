class Solution {
    public int characterReplacement(String s, int k) {
        int i=0;
        int j=0;
        int len = s.length();
        int[] charFreq = new int[26];
        // charFreq[s.charAt(i)-'A']++;
        int maxFreq=0;
        // char maxFreqChar = s.charAt(0);
        int ans = 0;
        while(j<len && i<len){
            int currLen = j-i+1;
            charFreq[s.charAt(j)-'A']++;
            if( maxFreq < charFreq[s.charAt(j)-'A']){
                // maxFreqChar =  s.charAt(j);
                maxFreq = charFreq[s.charAt(j)-'A'];
            }
            if(currLen - maxFreq > k){
                charFreq[s.charAt(i)-'A']--;
                // if(maxFreqChar == s.charAt(i)){
                //     maxFreq=0;
                //     for(int p=0;p<26;p++){
                //         maxFreq = Math.max(charFreq[p],maxFreq);
                //     }
                // }
                i++;
                currLen--;
            }
                ans = Math.max(ans,currLen);
                j++;
            
        }
        return ans;
    }
}
