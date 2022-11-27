class Solution {
    public int distributeCandies(int[] a) {
        ArrayList l1=new ArrayList<>();
        Arrays.sort(a);
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]!=a[i+1])
                {
                l1.add(a[i]);
            }
        }

        l1.add(a[a.length-1]);
    if(l1.size()>=a.length/2)
    {
        return a.length/2;
    }
    else
    {
        return l1.size();
    }
    }
}
