class Solution {
    public boolean digitCount(String num) {
        if(num.length()==1&&num.charAt(0)=='0')
        {
            return false;
        }
        for(int x=0;x<num.length();x++)
        {
            int c=0;
            for(int y=0;y<num.length();y++)
            {
                if( x==((int)num.charAt(y)-48))
                {
                    c++;
                }
            }
            if(c!=((int)num.charAt(x)-48))
            {
                return false;
            }
        }
        return true;
    }
}
