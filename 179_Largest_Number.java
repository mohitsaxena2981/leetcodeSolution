class Solution {
    
    public static int compare(int x,int y)
    {
        String s1=""+x+y;
        String s2=""+y+x;
        if(Long.parseLong(s2)>Long.parseLong(s1))
            return 1;
        else
            return -1;
        
    }
    public String largestNumber(int[] nums) {
        int c=0;
        for(int j=0;j<nums.length;j++)
            {
                if(nums[j]==0){
                    c++;
                }
            }
        if(c==nums.length)
            return "0";
        for(int i=1;i<nums.length;i++)
        {
            for(int j=0;j<nums.length-i;j++)
            {
                if(compare(nums[j],nums[j+1])>0){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        
        String str="";
        for(int i=0;i<nums.length;i++)
        {
            str+=nums[i];
        }
        return str;
        
    }
}
