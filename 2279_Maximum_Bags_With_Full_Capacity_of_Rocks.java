class Solution {
    public int maximumBags(int[] c, int[] r, int a) {
        int k[] = new int[c.length];
        for(int i=0;i<r.length;i++)
        {
            k[i]=c[i]-r[i];
        }
        Arrays.sort(k);
        int l=0,i=0;
        while(a>0 && i<k.length)
        {
            if(a-k[i]<0)
            break;
            else
            l++;
            a-=k[i++];
        }
        return l;
        
    }
}
