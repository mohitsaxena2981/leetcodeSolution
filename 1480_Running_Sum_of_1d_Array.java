class Solution {
    public int[] runningSum(int[] nums) {
       
        int sum=0;
        for(int x=0;x<nums.length;x++)
        {
            sum+=nums[x];
            nums[x]=sum;
        }
        return nums;
    }
}
