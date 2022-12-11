import java.util.*;
  class Solution {
    public int validSubarrays(int[] nums) {
      return ValidSubArray(nums);
    }
	public static int ValidSubArray(int arr[])
	{
	    Stack<Integer> st=new Stack<>();
	    int ans=0;
	    for(int x=0;x<arr.length;x++)
	    {
	        while(!st.isEmpty() && arr[x]<st.peek())
	        {
	            st.pop();
	        }
	        st.push(arr[x]);
	        ans+=st.size();
	    }
	    return ans;
	}
}
