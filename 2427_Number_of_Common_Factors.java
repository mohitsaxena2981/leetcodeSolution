class Solution {
    public int commonFactors(int a, int b) {
        int c=0;
        if(a>b)
        {
            for(int x=1;x<=b;x++)
            {
                if(a%x==0 && b%x==0)
                {
                    c++;
                }
            }
        }
        else
        {
            for(int x=1;x<=a;x++)
            {
                if(a%x==0 && b%x==0)
                {
                    c++;
                }
            }
        }
        return c;
        
    }
}
