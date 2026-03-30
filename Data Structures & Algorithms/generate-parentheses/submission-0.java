class Solution {

    public void generateStringParentesis(int n,int open, int close, List<String> ret, StringBuffer str){
        // System.out.println("open ="+ open);
        if(open+close == 2*n){
            ret.add(str.toString());
            return; 
        }
        if(open < n){
            str.append("(");
            generateStringParentesis(n,open+1,close,ret,str);
            str.deleteCharAt(str.length()-1);
        }
        if(open>close){
            str.append(")");
            generateStringParentesis(n,open,close+1,ret,str);
            str.deleteCharAt(str.length()-1);
        }
        
    }
    public List<String> generateParenthesis(int n) {
        int open=0;
        int close=0;
        StringBuffer str = new StringBuffer("");
        List<String> ret = new ArrayList<>();
        generateStringParentesis(n,open,close,ret,str);
        return ret;
    }
}
