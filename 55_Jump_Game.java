class Solution {
    public boolean canJump(int[] nums) {
        int lastgoodposition=nums.length-1;
        for(int i=nums.length-1;i>=0;i--)
        {
            if(i+nums[i]>=lastgoodposition)
                lastgoodposition=i;
        }
        return lastgoodposition==0;
        
    }
}
