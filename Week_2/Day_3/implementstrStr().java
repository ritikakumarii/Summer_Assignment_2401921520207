class Solution {

    public int strStr(String haystack, String needle ) {
        if (needle.length()==0)
            return 0 ;

        // function call 
         return FindIndex( haystack ,  needle , 0);




    }
     public  int FindIndex(String haystack , String needle , int idx){
       int  n1 = haystack.length();
        int n2 = needle.length();
        //  base case 
        if ( idx > n1-n2)
            return -1;

        // case match 
         if ( ismatch( haystack,needle ,idx,0))
            return idx;
         
         // recursive call

         return FindIndex(haystack, needle, idx+1);



     }
      public  boolean ismatch(String haystack , String needle ,int i,int j){
        if (j==needle.length())
            return true;

        if (haystack.charAt(i+j)!=needle.charAt(j))
            return false;

         // recursive call 
         return ismatch(haystack, needle, i, j+1);


      }
      }
