class Solution {
    public int diagonalSum(int[][] mat) {
        int sum =0;
         int n =mat.length;
        for(int i =0; i<n ; i++){
         // O(n) time complexity
          sum+=mat[i][i];
          sum+=mat[i][n-i-1];// (i+j==n-1)

          // O(n*n) time complexity
          // for(int j =0; j<mat[i].length ; j++){
            //     if(i==j){
            //         sum+=mat[i][j];
                    
            //     }
            //     if(i+j==n-1){
            //         sum+=mat[i][j];
            //     }
            // }
        }
        if(n%2!=0) sum-=mat[n/2][n/2];

        return sum;
    }
}
