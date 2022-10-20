class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List arr=new ArrayList();
        int startrow=0;
        int endrow=matrix.length-1;
        int startcol=0;
        int endcol=matrix[0].length-1;
        while(startrow<=endrow && startcol<=endcol){
            //top
        for(int j=startcol;j<=endcol;j++){
            arr.add(matrix[startrow][j]);
        }
        //right
        for(int i=startrow+1;i<=endrow;i++){
            arr.add(matrix[i][endcol]);
        }
        //bottom
        for(int j=endcol-1;j>=startcol;j--){
            if(startrow==endrow){
                break;
            }
            arr.add(matrix[endrow][j]);
        }
        //left
        for(int i=endrow-1;i>=startrow+1;i--){
            if(startcol==endcol){
                break;
            }
            arr.add(matrix[i][startcol]);
        }
            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }
        
        return arr;
    }
}
