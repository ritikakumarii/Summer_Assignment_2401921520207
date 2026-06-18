class Solution {
    public int largestRectangleArea(int[] heights) {
         Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++) {
            int h = (i == n) ? 0 : heights[i];

            while (!stack.isEmpty() && h < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width;

                if (stack.isEmpty()) {
                    width = i;
                } else {
                    width = i - stack.peek() - 1;
                }

                maxArea = Math.max(maxArea, height * width);
            }

            stack.push(i);
        }

        return maxArea;
        //  int n = heights.length;
        // int left = 0;
        // int right  = 0;
        // int currarea = heights[left]*1;
        // int maxarea= currarea;
        // if(heights.length!=right){
        //  maxarea = (heights.length)*Math.min(heights  [left],heights[right]);
        // }
        // if(heights.length==1) return heights[0];
        
        
        // while(right<n){
        //     int h = Math.min(heights[right],heights[left]);
        //     int width = (right+1) - left;
        //      currarea = h*width;

        //     maxarea = Math.max(currarea,maxarea);
        //     if(heights [right]> heights [left]){
        //         left++;

            
        //     }
        //     else if(heights [right]== heights [left]){
        //         right++;
        //     }
        //     else{
        //         right++;
        //         left++;
        //     }
        // }
            
        // return maxarea;
        
    
    }
}
    
    
