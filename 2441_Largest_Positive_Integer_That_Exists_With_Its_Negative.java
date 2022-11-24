class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=0;i--){
            int ans= nums[i]*-1;
            for(int j=0;j<i;j++){
                if(ans==nums[j])
                    return ans*-1;
            }
        }
        return -1;
    }
}
