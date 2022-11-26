class Solution {
    public int longestPalindrome(String s) {
        int ch[]=new int[127];
        for(int x=0;x<s.length();x++)
        {
            ch[(int)(s.charAt(x))]++;
        }
        int c=0;
        int y=0;
        for(int x=0;x<127;x++)
        {
            if(ch[x]%2!=0)
            {
                y=1;
            }
            while(ch[x]>1)
            {
                c+=2;
                ch[x]-=2;
            }
            
        }
    if(y==1)
    {
        c++;
    }
        return c;


        
    }
}
