class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        	    List<Integer> list=new ArrayList<>();
	    List<List<Integer>> list1=new ArrayList<>();
        printcombination(candidates,target,list,list1,0);
        return list1;
        
    }
    public static void printcombination(int coin[],int amount ,List<Integer> list,List<List<Integer>> list1,int idx)
	{
	    if(amount==0)
	    {
	       // list.add(ans);
	        list1.add(new ArrayList<>(list));
	        return;
	    }
	    for(int x=idx;x<coin.length;x++)
	    {
	        if(amount>=coin[x]){
	        list.add(coin[x]);
	            printcombination(coin,amount-coin[x],list,list1,x);
	       list.remove(list.size()-1);
	        }
	    }
	}
}
