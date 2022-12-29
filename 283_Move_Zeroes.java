class Solution {
    public void moveZeroes(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int x=0;x<nums.length;x++)
        {
            if(nums[x]!=0)
            {
                list.add(nums[x]);
            }
        }
        for(int x=0;x<nums.length;x++)
        {
            if(x<list.size())
            {
                nums[x]=list.get(x);
            }
            else
            {
                nums[x]=0;
            }
        }
    }
}
