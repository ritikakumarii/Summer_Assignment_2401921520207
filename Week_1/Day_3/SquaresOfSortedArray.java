class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int i = 0; int j=n-1;
        int k =n-1;
        while(i<j){
            if((nums[i]*nums[i])>(nums[j]*nums[j])){
              ans[k]= (nums[i]*nums[i]);
              
              i++;
              
            }
            else if ((nums[i]*nums[i])<(nums[j]*nums[j])){
           
              ans[k]= (nums[j]*nums[j]);
                
                 j--;
                
            }
            else{
                ans[k--]=(nums[j]*nums[j]);

               ans[k]=(nums[j]*nums[j]);
               i++;
               j--;
            }k--;
        
            
        }
        if(i==j){
            ans[k]=nums[i]*nums[i];
            
        }
        return ans;
    }
}
