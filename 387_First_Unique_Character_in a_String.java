class Solution {
    public int firstUniqChar(String mohit) {
        int ch[]=new int[123];
        if(mohit.length()==1)
            return 0;

	for(int x=0;x<mohit.length();x++)
	{
		ch[(int)(mohit.charAt(x))]++;
	}
	for(int x=0;x<mohit.length();x++)
	{
		if(ch[(int)(mohit.charAt(x))]==1){
			System.out.println(mohit.charAt(x));
			return x;
		}
    }
        return -1;
    }
}
