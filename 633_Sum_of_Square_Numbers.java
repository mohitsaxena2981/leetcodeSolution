class Solution {
    public boolean judgeSquareSum(int c) {
        long res=0;
        long si=0;
        long ei=(long)(Math.sqrt(c));
        while(si<=ei)
        {
            if(Math.pow(si,2)+Math.pow(ei,2)==c)
            {
                return true;
            }
            else if(Math.pow(si,2)+Math.pow(ei,2)>c)
            {
                ei--;
            }
            else{
                si++;
            }
        }
        return false;
    }
}
