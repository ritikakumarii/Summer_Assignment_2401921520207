class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result= new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        int toprow=0, bottomrow= m-1, rightcol=n-1, leftcol= 0;
        while( toprow<= bottomrow && leftcol <= rightcol){
        //print toprow
        for(int j = leftcol ; j<=rightcol ; j++){
            result.add(matrix [toprow][j]);
           
        }
         toprow++;
        //print rightcol
        for(int i = toprow; i<= bottomrow; i++){
            result.add(matrix[i][rightcol]);
            
        }
        rightcol--;
        //print bottom row
        if(toprow <= bottomrow){
         for(int j = rightcol; j>= leftcol; j--){
           result.add (matrix[bottomrow][j]);
           
         }
          bottomrow--; }
         if(leftcol<=rightcol){       
         //print leftcol
         for(int i = bottomrow ; i>=toprow ; i--){
            result.add(matrix[i][leftcol]);
            
         }leftcol++;
         }}
         return result;
    }
}
