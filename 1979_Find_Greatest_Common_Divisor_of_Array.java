class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int c=0;
        int ans=0;
        for(int x=nums[0];x>=1;x--)
        {
                if(nums[nums.length-1]%x==0 && nums[0]%x==0)
                {
                    ans=x;
                    break;
                }
            }

        
        return ans;
        
    }
}
