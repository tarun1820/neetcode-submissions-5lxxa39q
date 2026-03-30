class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hset = new HashSet<Integer>();
        for(int num:nums){
            hset.add(num);
        } 
        int maclen=0;
        for(int num:nums){
            int count=1;
            if(!hset.contains(num-1)){
                while(hset.contains(num+1)){
                    num=num+1;
                    count++;
                }
            }
            if(maclen<count){
                maclen=count;
            }

        }
        return maclen;
    }
}
