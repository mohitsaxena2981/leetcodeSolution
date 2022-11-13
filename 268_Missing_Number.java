class Solution {
    public int missingNumber(int[] nums) {
        int arr[]=new int[nums.length+1];
        int ans=0;
        for(int x=0;x<nums.length;x++)
        {
            arr[nums[x]]++;
        }
        for(int x=0;x<arr.length;x++)
        {
            if(arr[x]==0)
            {
                ans=x;
                break;
            }
        }
        return ans;
        
    }
}
