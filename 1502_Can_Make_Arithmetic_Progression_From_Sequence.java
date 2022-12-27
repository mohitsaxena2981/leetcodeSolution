class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int res=arr[0]-arr[1];
        for(int x=1;x<arr.length-1;x++)
        {
            if(arr[x]-arr[x+1]!=res)
            {
                return false;
            }
        }
        return true;
    }
}
