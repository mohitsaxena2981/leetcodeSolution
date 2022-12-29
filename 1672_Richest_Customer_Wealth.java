class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int x=0;x<accounts.length;x++)
        {
            int sum=0;
            for(int y=0;y<accounts[0].length;y++)
            {
                sum+=accounts[x][y];
                
            }
            if(sum>max)
            {
                max=sum;
            }
        }
        return max;
        
    }
}
