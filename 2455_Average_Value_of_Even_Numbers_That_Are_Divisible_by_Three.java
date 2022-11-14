class Solution {
    public int averageValue(int[] nums) {
        int sum=0;
        int c=0;
        for(int x=0;x<nums.length;x++)
        {
            if(nums[x]%2==0 && nums[x]%3==0)
            {
                sum+=nums[x];
                c++;
            }
        }
        if(sum==0)
        {
            return 0;
        }
        int res=(sum)/c;
        return res;
        
    }
}
