class Solution {
    public boolean isValid(String s) {
    Stack<Integer> stack = new Stack<>();
    int len = s.length();
    if(len%2!=0){
        return false;
    }
    for(int i=0;i<len;i++){
        if(s.charAt(i)=='{' || s.charAt(i)=='[' || s.charAt(i)=='('){
            stack.push((int)s.charAt(i));
        }
        else if(s.charAt(i)=='}' || s.charAt(i)==']' || s.charAt(i)==')'){
            if(stack.size()==0){
                    return false;
            }
            if((s.charAt(i)=='}' && stack.peek()=='{') || (s.charAt(i)==']' && stack.peek()=='[') || (s.charAt(i)==')' && stack.peek()=='(')){
                stack.pop();
            }
            else{
                return false;
            }
        }
    }
    if(stack.size()==0){
        return true;
    }
    return false;
    }
}
