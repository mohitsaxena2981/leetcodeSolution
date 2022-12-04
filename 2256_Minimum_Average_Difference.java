class Solution {
    public int minimumAverageDifference(int[] nums) {
        long lh[]=new long[nums.length];
        long rh[]=new long[nums.length];
        int lsum=0;
        lh[0]=nums[0];
        for(int x=1;x<nums.length;x++)
        {
            lh[x]=lh[x-1]+nums[x];
        }
        rh[nums.length-1]=nums[nums.length-1];
        for(int x=nums.length-2;x>=0;x--)
        {
            rh[x]=rh[x+1]+nums[x];
        }
        long res=0;
        long z=0;
        long y=0;
        long min=Integer.MAX_VALUE;
        int idx=-1;
        for(int x=0;x<nums.length;x++)
        {
            if(x==nums.length-1){
                y=0;
              z=(lh[x]/(x+1));
           }
            else
            {
                z=(lh[x]/(x+1));
                y=(rh[x+1]/(nums.length-x-1));
            }
            res=Math.abs((z-y));
            if(res<min)
            {
                min=res;
                idx=x;
            }
        }
        return idx;
        
    }
}
