class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> list1=new ArrayList<>();
        for(int x=0;x<factorial(nums.length);x++)
        {
            getpermutation(nums);
            for(int y=0;y<nums.length;y++)
            {
                list.add(nums[y]);
            }
            list1.add(new ArrayList<>(list));
            list.clear();
            
            
        }
        
        return list1;
    }
    public static void getpermutation(int arr[])
    {
        int p=0;
        int q=0;
        for(int x=arr.length-2;x>=0;x--)
        {
            if(arr[x]<arr[x+1])
            {
                p=x;
                break;
            }
        }
        for(int x=arr.length-1;x>p;x--)
        {
            if(arr[x]>arr[p])
            {
                q=x;
                break;
            }
        }
        if(p==0 && q==0)
        {
            reverse(arr,0,arr.length-1);
            return;
        
        }
        int temp=arr[p];
        arr[p]=arr[q];
        arr[q]=temp;

        reverse(arr,p+1,arr.length-1);
        return;
    }

    public static void reverse(int arr[],int i,int j)
    {
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    public static int factorial(int n) {
       if(n==0) {
    	   return 1;
       }
		int fn = factorial(n - 1);
		return factorial(n - 1)*n;

	}
}
