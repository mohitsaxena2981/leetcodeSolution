class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        if(nums.length==1)
        {
            return nums[0];
        }
        for(int x=0;x<nums.length-1;x++)
        {
            if(nums[x]!=nums[x+1])
            {
                ans=nums[x];
                break;
            }
            x++;
        }
        if(nums[nums.length-1]!=nums[nums.length-2])
        {
            ans=nums[nums.length-1];
        }
        return ans;

    }
}
