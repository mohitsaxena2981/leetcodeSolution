// class Solution {
    
//     public static int first(int nums[],int low , int high , int target){
//         if(low<=high){
//             int mid = low + (high - low )/2;
//             if(nums[mid]==target) {
//                 if(mid == 0 || nums[mid-1] != target) return mid;
//                 else if(nums[mid-1] == target) return first(nums , low , mid-1 , target);
//             } else if(target > nums[mid]){
//                 return first(nums , (mid+1) , high , target);
//             }
//             else{
//                 return first(nums , low , mid-1 , target);
//             }
//         }
//         return -1;
        
//     }
//     public static int last(int nums[],int low , int high , int target){
//         if(low<=high){
//             int mid = low + (high - low )/2;
//             if(nums[mid]==target) 
//             {
//                 if(mid == nums.length-1 || nums[mid+1] != target) return mid;
//                 else if(nums[mid+1] == target) return last(nums , (mid+1) , high , target);
//             } else if(target < nums[mid]){
//                 return last(nums , low , (mid-1) , target);
//             }
//             else{
//                 return last(nums , (mid+1) , high , target);
//             }
//         }
//         return -1;
//     }
//     public int[] searchRange(int[] nums, int target) {
//         int low=0;
//         int high=nums.length-1;
//         int arr[]=new int[2];
//         if(nums.length == 1 && nums[0] == target){
//             arr[0] = 0;
//             arr[1] = 0;
//         } else {
//         arr[0]=first(nums , low , high , target);
//         arr[1]=last(nums , low , high , target);
//         }
//         return arr;
        
//     }
    
// }


class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[]=new int[2];
        int si=0;
        int ei=-1;
        while(si<nums.length)
        {
            if(nums[si]==target && ei==-1)
            {
                arr[0]=si;
                ei=1;
            }
            else if(nums[si]==target)
            {
            arr[1]=si;
            }
            si++;
        }
        if(ei==-1)
        {
            arr[0]=-1;
            arr[1]=-1;
        }
        else if(ei!=-1 && arr[1]==0)
        {
            arr[1]=arr[0];
        }
        return arr;
        
    }
}
