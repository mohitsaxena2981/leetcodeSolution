class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        double sum=0;
        int c=0;
        int z=0;
        int ans[]=new int[queries.length];
        Arrays.sort(nums);
        for(int x=0;x<queries.length;x++)
        {
            sum=0;
            c=0;
            for(int y=0;y<nums.length;y++)
            {
                sum+=nums[y];
                if(sum>queries[x])
                {
                    break;
                }
                else
                {
                    c++;
                }
            }
            ans[z]=c;
            z++;
        }
        return ans;
        
    }
}
