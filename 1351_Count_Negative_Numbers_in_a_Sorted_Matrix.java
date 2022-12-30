class Solution {
    public int countNegatives(int[][] grid)
    {
        int c=0;
        for(int x=0;x<grid.length;x++)
        {
            for(int y=0;y<grid[0].length;y++)
            {
                if(grid[x][y]<0)
                {
                    c++;
                }
            }
        }
        return c;     
    }
}
