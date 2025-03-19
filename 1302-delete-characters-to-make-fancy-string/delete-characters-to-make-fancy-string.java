class Solution {
    public String makeFancyString(String s) {
        
        //Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(i>0 && s.charAt(i) == s.charAt(i-1)){
                count++;
            }else{
                count = 1;
            }
            if(count <= 2){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}