class Solution {
    public int pivotIndex(int[] nums) {
        int suml=0;
        int sumr=0;
        int ans=-1;
        for(int x=0;x<nums.length;x++)
        {
            suml=0;
            sumr=0;
            for(int y=0;y<nums.length;y++)
            {
                if(y<x)
                {
                    suml+=nums[y];
                    
                }
                else if(y>x)
                {
                    sumr+=nums[y];
                }
            }
            if(suml==sumr)
            {
                ans=x;
                break;
            }
        }
        if(ans==-1)
        {
            return -1;
        }

        return ans;
    }
}
