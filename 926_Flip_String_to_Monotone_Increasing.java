class Solution {
    public int minFlipsMonoIncr(String s) {
        int z=0;
        int c=0;
        int y=0;
        int c1=0;
        for(int x=0;x<s.length();x++)
        {
            if(s.charAt(x)=='1' && z==0)
            {
                z=1;
            }
            else if(s.charAt(x)=='0' && y==0)
            {
                y=1;
            }
            if(s.charAt(x)=='0'&&z==1)
            {
                c++;
            }
            else if(s.charAt(x)=='1' && y==1)
            {
                c1++;
            }
        }
        if(c1<c)
        {
            return c1;
        }
        return c;
    }
}
