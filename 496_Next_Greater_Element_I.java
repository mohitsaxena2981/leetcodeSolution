//Method 1
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int z=-1;
        int i=0;
        int nums[]=new int[nums1.length];
        for(int x=0;x<nums1.length;x++)
        {
            z=-1;
            for(int y=0;y<nums2.length;y++)
            {
                if(nums2[y]==nums1[x])
                {
                    z=y;
                }
                else if(z!=-1 && nums2[y]>nums1[x])
                {
                    nums[i]=nums2[y];
                  
                    break;
                }
            }
            if(nums[i]==0)
            {
                nums[i]=-1;
                
            }
           i++;
        }
        return nums;
        
    }
}

//Method 2
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int z=0;
        int c=0;
        int ans[]=new int[nums1.length];
        for(int x=0;x<nums1.length;x++)
        {
            for(int y=0;y<nums2.length;y++)
            {
                if(nums2[y]==nums1[x])
                {
                    z=y;
                    break;
                }
            }
            for(int y=z;y<nums2.length;y++)
            {
                if(nums2[y]>nums2[z])
                {
                    ans[c]=nums2[y];
                    break;
                }

            }
            if(ans[c]==0)
            {
                ans[c]=-1;
            }
            c++;
        }
        return ans;
    }
}
