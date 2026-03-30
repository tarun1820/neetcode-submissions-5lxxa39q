class Solution {
    // public int bisearch(int[] nums,int tofind,int start){
    //     int left =start;
    //     int right= nums.length -1;
    //     while(right>=left){
            
    //          int mid = left+(int)Math.floor((right-left)/2);
    //          System.out.println(mid);
    //          if(nums[mid]==tofind){
    //             return mid;
    //          }
    //          else if(nums[mid]>tofind){
    //             right = mid-1;
    //          }
    //          else{
    //             left = mid+1;
    //          }
    //     }
    //     return -1;
    // }
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            int tofind = target-nums[i];
            if(h.containsKey(tofind)){
                return new int[]{h.get(tofind),i};
            }
            h.put(nums[i],i);
        }
        return new int[]{};
        
        // Arrays.sort(nums);System.out.println(Arrays.toString(nums));
        // int first=-1,sec=-1;
        // for(int i=0;i<nums.length;i++){
        //     int tofind = target-nums[i];
        //     int ret = bisearch(nums,tofind,i+1);
        //     if(ret!=-1){
        //         first = i;
        //         sec = ret;break;
        //     } 
        // }
        // return new int[]{first,sec};
    }
}
