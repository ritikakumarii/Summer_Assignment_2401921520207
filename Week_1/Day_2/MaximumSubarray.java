class Solution {
public boolean AllNegative(int [] arr){
    for(int i = 0 ; i < arr.length;i++){
        
        if (arr[i]>=0){
            return false;
        }
      
    }
    return true;
}




    public int maxSubArray(int[] nums) {

      if(AllNegative(nums)){
        int max = nums[0];
        for(int i = 0 ; i <nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        return max;
      }




        int cs=0;
        int ms = Integer.MIN_VALUE;
        
        for(int i = 0 ;i <nums.length;i++){
              cs=cs+nums[i];
              if(cs<0){
                cs=0;
              }
              ms=Math.max(cs,ms);

        }
          return ms;
    }
  

}
