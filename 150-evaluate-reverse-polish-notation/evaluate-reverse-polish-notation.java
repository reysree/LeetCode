class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<String> stack = new Stack<>();
        int val1 = 0;
        int val2 = 0;
        int res = 0;

        for(String s : tokens){

            switch(s){
                case "+":
                    val2 = Integer.parseInt(stack.pop());
                    val1 = Integer.parseInt(stack.pop());
                    res = val1+val2;
                    stack.push(res+"");
                    break;
                case "-":
                    val2 = Integer.parseInt(stack.pop());
                    val1 = Integer.parseInt(stack.pop());
                    res = val1-val2;
                    stack.push(res+"");
                    break;
                case "*":
                    val2 = Integer.parseInt(stack.pop());
                    val1 = Integer.parseInt(stack.pop());
                    res = val1*val2;
                    stack.push(res+"");
                    break;     
                case "/":
                    val2 = Integer.parseInt(stack.pop());
                    val1 = Integer.parseInt(stack.pop());
                    res = val1/val2;
                    stack.push(res+""); 
                    break;  
                default: 
                    stack.push(s);
                    break;              
            }
        }
        return Integer.parseInt(stack.peek());
    }
}