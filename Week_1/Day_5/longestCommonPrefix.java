class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        if(strs.length==1)return strs[0];
        String s =strs[0];
         for(int i =0;i<s.length();i++){
            char ch =s.charAt(i);
            for(int j=1;j<strs.length;j++){
           if(i==strs[j].length()||strs[j].charAt(i)!=ch) return strs[0].substring(0,i);
            }
         }
         return strs[0];
    }
}
