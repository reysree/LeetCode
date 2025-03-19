class Solution {
    public String makeFancyString(String s) {
        
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
                count = 1;
                continue;
            }
            if(s.charAt(i) == stack.peek()){
                if(count == 2){
                    continue;
                }else{
                    stack.push(s.charAt(i));
                    count++;
                }
            }else{
                count = 1;
                stack.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        //System.out.println(stack);
        return sb.reverse().toString();
    }
}