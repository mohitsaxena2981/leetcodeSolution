class Solution {
    public int maximumGap(int[] nums) {
        if (nums == null || nums.length < 2) return 0;		
        Arrays.sort(nums);		
        
        int Diff = 0, n = nums.length, maxDiff = Integer.MIN_VALUE;		
        for (int i = 1; i < nums.length; i++){
            Diff = nums[i] - nums[i-1];
        if (nums[i] == nums[i-1] && nums[n-1] == nums[0] ) 
            maxDiff = 0;
        if (Diff > maxDiff && Diff != 0)
            maxDiff = Diff;
        }             
        return maxDiff;  
    }
}
