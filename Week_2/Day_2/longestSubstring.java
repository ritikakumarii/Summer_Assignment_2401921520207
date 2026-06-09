class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet <Character> set = new HashSet<>();
        int i = 0;
        int max= 0;
        int j =0;
        while(j<s.length()){
            char ch = s.charAt(j);
            if(!set.contains(s.charAt(j))){
                set.add(ch);
                j++;
                max = Math.max(set.size(),max);
            }
            else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        return max;
        


        
    }
}
