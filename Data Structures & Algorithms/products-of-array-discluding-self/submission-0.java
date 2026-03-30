class Solution {
    public int[] productExceptSelf(int[] nums) {
    //    [1,1,2,8];
    //    [48,24,6,1]; 
    int len = nums.length;
    int[] prefixarry = new int[len];
    int[] suffixarry = new int[len];
    for(int i=0;i<len;i++){
        if(i==0){
            prefixarry[0]=1;
            continue;
        }
        prefixarry[i]=nums[i-1]*prefixarry[i-1];
    }
    for(int i=len-1;i>-1;i--){
        if(i==len-1){
            suffixarry[len-1]=1;
            continue;
        }
        suffixarry[i]=nums[i+1]*suffixarry[i+1];
    }

    for(int i=0;i<len;i++){
        suffixarry[i]*=prefixarry[i];
    }
    return suffixarry;
    }
}  
