class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()) return true;
        String str = s.toLowerCase()  ;
            StringBuilder sb = new StringBuilder();

        for (int i =0 ; i<str.length() ; i++ ){
            char ch = str.charAt(i);
            if(Character.isLetterOrDigit(ch)) sb.append(ch);
        }
        String rb =sb.toString();
        sb.reverse();
        String ab =sb.toString();
        return rb.equals(ab) ;
    }
}
