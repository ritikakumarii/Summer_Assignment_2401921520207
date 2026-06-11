class Solution {
    public String reverseWords(String s) {
    char arr[]=s.toCharArray();
    int n=arr.length; 
    int i=0;
    int j=0;
    while(j<=n){
     if(j==n||arr[j]==' '){
        int k=i;
         int e=j-1;
        while(k<e){
            char temp=arr[k];
            arr[k]=arr[e];
            arr[e]=temp;
            k++;
            e--;
        }
        i=j+1;
     }
     j++;
     
     


    }
   return new String(arr);

    }
   }
