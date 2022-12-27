class Solution {
    public int arraySign(int[] nums) {
        long prd=1;
        int c=0;
        for(int x=0;x<nums.length;x++)
        {
            if(nums[x]==0)
            {
                return 0;
            }
            if(nums[x]<0)
            {
                c++;
            }
        }
        if(c%2==0)
        {
            return 1;
        }
    
            return -1;
        
        
    }
}
