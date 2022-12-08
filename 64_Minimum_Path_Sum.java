class Solution {
    public int minPathSum(int[][] grid) {
        int rows=grid.length;
        int col=grid[0].length;
        //for rows
        for(int x=1;x<col;x++)
        {
            grid[0][x]+=grid[0][x-1];
        }
        //for cloumns
        for(int x=1;x<rows;x++)
        {
            grid[x][0]+=grid[x-1][0];
        }

        //for other

        for(int x=1;x<rows;x++)
        {
            for(int y=1;y<col;y++)
            {
                grid[x][y]+=Math.min(grid[x-1][y],grid[x][y-1]);
            }
        }
        return grid[rows-1][col-1];

        
    }
}
