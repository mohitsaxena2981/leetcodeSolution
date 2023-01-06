class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int c=0;
        int sum=0;
        for(int x=0;x<costs.length;x++)
        {
            sum+=costs[x];
            if(sum<=coins)
            {
                c++;
            }
            else
            {
                break;
            }
        }
        return c;

        
    }
}
