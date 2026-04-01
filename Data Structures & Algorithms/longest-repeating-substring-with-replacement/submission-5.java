class Solution {
    public int characterReplacement(String s, int k) {
        int i=0;
        int j=1;
        int len = s.length();
        int[] charFreq = new int[26];
        charFreq[s.charAt(i)-'A']++;
        int maxFreq = 1;
        char maxFreqChar = s.charAt(0);
        int ans = 1;
        while(j<len && i<len){
            int currLen = j-i+1;
            charFreq[s.charAt(j)-'A']++;
            if( maxFreq < charFreq[s.charAt(j)-'A']){
                maxFreqChar =  s.charAt(j);
                maxFreq = charFreq[s.charAt(j)-'A'];
            }
            while(currLen - maxFreq > k){
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
            if(currLen - maxFreq <=k){
                ans = Math.max(ans,currLen);
                j++;
            }
        }
        return ans;
    }
}
