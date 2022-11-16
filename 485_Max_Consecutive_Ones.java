class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int c=1;
        int z=0;
    if(nums.length==1 && nums[0]==1)
    {
        return 1;
    }
    else if(nums.length==1 && nums[0]==0)
    {
        return 0;
    }
        for(int x=0;x<nums.length-1;x++)
        {
            if(nums[x]==1)
            {
                z=1;
            }
            if(nums[x]==nums[x+1] && nums[x]==1 && nums[x+1]==1)
            {
                c++;
                z=1;
            }
            else
            {
                if(c>max)
                {
                    max=c;
                }
                c=1;
            }
        }
        if(c>max)
        {
            max=c;
        }
        if(z==0 && nums[nums.length-1]==0)
        {
            max=0;
        }
        else if(z==0 && nums[nums.length-1]==1)
        {
            max=1;
        }
        
        return max;
    }
}
