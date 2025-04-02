class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int max_area = 0;

        for(int i=0;i<=heights.length;i++){

            int h = (i == heights.length) ? 0 : heights[i];;
            while(!stack.isEmpty() && h< heights[stack.peek()]){
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i-stack.peek()-1;
                max_area = Math.max(max_area,height*width);
            }
            stack.push(i);
        }
        return max_area;
    }
}