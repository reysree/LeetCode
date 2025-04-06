class Solution {
    public List<String> generateParenthesis(int n) {
        
        ArrayList<String> alist = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        backtrack(0,0,n,sb, alist);
        return alist;
    }

    public static void backtrack(int openCount, int closeCount, int n, StringBuilder sb, ArrayList<String> alist){

        if(openCount == closeCount && openCount == n){
            alist.add(sb.toString());
            return;
        }

        if(openCount < n){
            sb.append('(');
            backtrack(openCount+1,closeCount,n, sb, alist);
            sb.deleteCharAt(sb.length()-1);
        }

        if(closeCount < openCount){
            sb.append(')');
            backtrack(openCount, closeCount+1, n, sb, alist);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}