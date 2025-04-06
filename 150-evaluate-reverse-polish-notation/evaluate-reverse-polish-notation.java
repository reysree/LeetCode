class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stack = new Stack<>();
        // int val1 = 0;
        // int val2 = 0;
        // int res = 0;

        for(String s : tokens){

            switch(s){
                case "+":
                    // val2 = Integer.parseInt(stack.pop());
                    // val1 = Integer.parseInt(stack.pop());
                    // res = val1+val2;
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    int sub2 = stack.pop();
                    int sub1 = stack.pop();
                    stack.push(sub1-sub2);
                    break;
                case "*":
                    // val2 = Integer.parseInt(stack.pop());
                    // val1 = Integer.parseInt(stack.pop());
                    // res = val1*val2;
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