class Solution {
    public int findMin(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int x=0;x<nums.length;x++)
        {
            if(nums[x]<min)
            {
                min=nums[x];
            }
        }
        return min;
    }
}
