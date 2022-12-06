class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list=new ArrayList<>();
        for(int x=0;x<nums.length-1;x++)
        {
            if(nums[x]==nums[x+1])
            {
                list.add(nums[x]);
            }
        }
        return list;
        
    }
}
