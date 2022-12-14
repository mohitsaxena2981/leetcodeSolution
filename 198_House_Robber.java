class Solution 
{
    public int rob(int[] nums) {
    int prevNo = 0;
    int prevYes = 0;
    for (int x=0;x<nums.length;x++) {
        int temp = prevNo;
        prevNo = Math.max(prevNo, prevYes);
        prevYes = nums[x] + temp;
    }
    return Math.max(prevNo, prevYes);
    }
}
