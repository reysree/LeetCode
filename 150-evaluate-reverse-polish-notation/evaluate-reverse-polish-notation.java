class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stack = new Stack<>();

        for(String s : tokens){

            switch(s){
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    int sub2 = stack.pop();
                    int sub1 = stack.pop();
                    stack.push(sub1-sub2);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;     
                case "/":
                    int divisor = stack.pop();
                    int dividend = stack.pop();
                    stack.push(dividend/divisor); 
                    break;  
                default: 
                    stack.push(Integer.parseInt(s));
                    break;              
            }
        }
        return stack.peek();
    }
}