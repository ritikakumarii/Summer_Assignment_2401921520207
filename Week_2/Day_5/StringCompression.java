class Solution {
    public int compress(char[] chars) {
        int i=0;
        int j =0;
          while(i<chars.length){
          char current = chars[i];
          int count =0;
          while( i<chars.length && chars[i]==current){
            i++;
            count ++;
           }
           chars[j++]= current;

           
           if(count>1){
           String num = count + "";
           for(int k = 0;k<num.length() ; k++){
            chars[j++] = num.charAt(k);
           }    
        }}
    
            return j;
    }
}
