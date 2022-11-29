class Solution {
    public int countPrimes(int n) {
        if(n==0 || n==1)
        {
            return 0;
        }
        boolean prime[]=new boolean[n];
        prime[0]=true;
        prime[1]=true;
        for(int x=0;x*x<n;x++)
        {
            if(prime[x]==false)
            {
                for(int mul=2;mul*x<n;mul++)
                {
                    prime[x*mul]=true;
                }
            }
        }
        int count=0;
        for(int x=2;x<n;x++)
        {
            if(prime[x]==false)
            {
                count++;
            }
        }
        return count;

    }
}
