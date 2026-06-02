class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int key :nums){
            if(map.containsKey(key)) return true;
            else{
                map.put(key,1);
            }
        }
      return false;  
    }
}
