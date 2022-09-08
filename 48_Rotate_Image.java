class Solution {
    public void rotate(int[][] matrix) {
        int transpose[][]=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                transpose[i][j]=matrix[j][i];
            }
        }
        int x=0;
        for(int i=0;i<matrix.length;i++){
            x=0;
            for(int j=matrix.length-1;j>=0;j--){
                matrix[i][x]=transpose[i][j];
                x++;
            }
        }
        
    }
}
