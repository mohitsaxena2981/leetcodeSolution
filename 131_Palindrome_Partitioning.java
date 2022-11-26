class Solution {
    public List<List<String>> partition(String s) {
        List<String> list=new ArrayList<>();
	    List<List<String>> ans=new ArrayList<>();
	    printpartition(s,list,ans);
        return ans;  
    }
    public static void printpartition(String str,List<String> list,List<List<String>> ans)
	{
	    if(str.length()==0)
	    {
	       // System.out.println(list);
	        ans.add(new ArrayList<String>(list));
	        
	    }
	    for(int x=1;x<=str.length();x++)
	    {
	        String s=str.substring(0,x);
	        if(ispalindrome(s))
	        {
	            list.add(s);
	            printpartition(str.substring(x),list,ans);
	            list.remove(list.size()-1);
	        }
	    }
	}
	
	public static boolean ispalindrome(String s)
	{
	    int x=0;
	    int y=s.length()-1;
	    while(x<=y)
	    {
	        if(s.charAt(x)!=s.charAt(y))
	        {
	            return false;
	        }
	        x++;
	        y--;
	    }
	    return true;
	}
} 
