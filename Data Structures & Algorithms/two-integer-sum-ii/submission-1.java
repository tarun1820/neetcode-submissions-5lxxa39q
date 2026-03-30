class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i=0;i<numbers.length-1;i++){
            int result = binarySearch(numbers,i+1,target - numbers[i]);
            if(result!=-1){
                return new int[]{i+1,result+1};
            }
        }
        return new int[]{-1,-1};
    }

    public int binarySearch(int[] nums,int start, int target){
        int l=start;int r=nums.length-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid] > target){
                r=mid-1;
            }
            else if(nums[mid] < target){
                l=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;

    }
}
