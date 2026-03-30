class Solution {
    public int trap(int[] height) {
        int len = height.length;
        int[] leftMaximums = new int[len];
        int[] rightMaximums = new int[len];
        for(int i=0;i<len-1;i++){
            leftMaximums[i+1] = Math.max(leftMaximums[i],height[i]);
        }
        for(int i=len-1;i>0;i--){
            rightMaximums[i-1] = Math.max(rightMaximums[i],height[i]);
        }
        System.out.println(Arrays.toString(leftMaximums));
        System.out.println(Arrays.toString(rightMaximums));
        int totalArea = 0;
        for(int i=0;i<len-1;i++){
            int currStored = Math.min(leftMaximums[i],rightMaximums[i])-height[i];
            totalArea+=currStored>0?currStored:0;
            System.out.println(totalArea);
        }
        
        return totalArea;
    }
}
