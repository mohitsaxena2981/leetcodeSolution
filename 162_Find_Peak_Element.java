class Solution {
    public int findPeakElement(int[] nums) {
        int x=0;
        if(nums.length==1){
            return 0;
        }
        // else if(nums.length==2){
        //     if(nums[0]>nums[1]){
        //         return 0;
        //     }
        //     else{
        //         return 1;
        //     }
        // }
        for(int i=0;i<nums.length-1;i++){
            x=i+1;
            if(nums[x]-nums[i]>0){
                if(i<nums.length-2){
                    if(nums[x]-nums[x+1]>0)
                        return i+1;
            }
            
            
        }
        
        
    }
        if(nums[nums.length-1] > nums[nums.length-2]){
            return nums.length-1;
        }
        return 0;
    }
}
