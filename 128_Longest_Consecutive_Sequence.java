class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0)
        {
            return 0;
        }
        if(nums.length==1)
        {
            return 1;
        }
        int c=1;
        int max=0;
        for(int x=0;x<nums.length-1;x++)
        {
            if(nums[x+1]-nums[x]==1)
            {
                c++;
            }
            else if(nums[x]!=nums[x+1])
            {
                max=Math.max(c,max);
                c=1;
            }
        }
        max=Math.max(c,max);
        return max;
    }
}
