class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String i: tokens){
            if(i.equals("+") || i.equals("-") || i.equals("*") || i.equals("/")){
                int a = (int)stack.pop();
                int b = (int)stack.pop();
                if(i.equals("+")){
                    stack.push(a+b);
                }
                else if(i.equals("-")){
                    stack.push(b-a);
                }
                else if(i.equals("*")){
                    stack.push(a*b);
                }
                else{
                    stack.push(b/a);
                }
            }
            else{
                int curr = Integer.valueOf(i);
                stack.push(curr);
            }
            

        }
        return stack.pop();
    }
}
