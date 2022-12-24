class Solution {
    public int countOdds(int low, int high) {
        int c=0;
        if(low%2==0)
        {
            low++;
        }
        for(int x=low;x<=high;x+=2)
        {
            c++;
        }
        return c;
    }
}
