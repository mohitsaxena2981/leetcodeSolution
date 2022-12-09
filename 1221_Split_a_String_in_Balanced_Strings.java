class Solution {
    public int balancedStringSplit(String s) {
        int cr=0;
        int cl=0;
        int c=0;
        for(int x=0;x<s.length();x++)
        {
            if(s.charAt(x)=='L')
            {
                cl++;
            }
            else if(s.charAt(x)=='R')
            {
                cr++;
            }
            if(cr==cl)
            {
                c++;
                cr=0;
                cl=0;
            }
        }
        return c;      
    }
}
