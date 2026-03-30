class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        
        Stack<int[]> stack = new Stack<>();
        for(int i=len-1;i>-1;i--){
            int t= temperatures[i];
            while(!stack.isEmpty() && t>=stack.peek()[0]){
                stack.pop();
            }
            if(stack.isEmpty()){
                stack.add(new int[]{temperatures[i],i});
                temperatures[i]=0;
            }
            else{
                int[] top = stack.peek();
                stack.add(new int[]{temperatures[i],i});
                temperatures[i]=top[1]-i;
            }
        }
        return temperatures;
    }
}
